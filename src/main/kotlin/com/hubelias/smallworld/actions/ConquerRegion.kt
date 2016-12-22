package com.hubelias.smallworld.actions

import com.hubelias.smallworld.model.*

class ConquerRegion(val regions: RegionsRepository) {
    fun findPossibleTargets(player: RaceAndPowerCombo): List<Region> {
        return regions.findAll().filter { it.adjacentToEdge }
    }

    fun conquer(target: Region, forces: Army): BattleResult {
        return BattleResult()
    }
}


