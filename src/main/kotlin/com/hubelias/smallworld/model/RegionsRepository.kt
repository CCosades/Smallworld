package com.hubelias.smallworld.model

interface RegionsRepository {
    fun findAll() : List<Region>
}