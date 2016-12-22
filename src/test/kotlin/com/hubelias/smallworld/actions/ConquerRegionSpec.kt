package com.hubelias.smallworld.actions

import com.hubelias.smallworld.model.RaceAndPowerCombo
import com.hubelias.smallworld.model.Region
import com.hubelias.smallworld.model.RegionsRepository
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ConquerRegionSpec {
    private lateinit var regions: RegionsRepository
    private lateinit var civilization: RaceAndPowerCombo

    @Before fun before() {
        regions = mock<RegionsRepository>()
        civilization = RaceAndPowerCombo()
    }

    @Test fun `findPossibleTargets at the edges of the board if the civilization does not control any territory`() {
        whenever(regions.findAll()).thenReturn(listOf(Region(true), Region(true), Region()))
        val possibleTargets = ConquerRegion(regions).findPossibleTargets(civilization)
        Assert.assertTrue("find only regions adjacent to edge", possibleTargets.all { it.adjacentToEdge })
        Assert.assertTrue("all of regions adjacent to edge are included", possibleTargets.size == 2)
    }

    @Test fun `conquer region automatically if it is not defended`() {

    }

    @Test fun `findPossibleTargets among regions adjacent to regions already occupied by civilization`() {

    }
}