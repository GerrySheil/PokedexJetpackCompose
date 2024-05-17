package com.example.pokedexjetpackcompose.data

import com.squareup.moshi.Json


data class PokedexDTO(
    @field:Json(name="next")
    val next:String,
    @field:Json(name="previous")
    val prev: String,
    @field:Json(name="results")
    val results: List<PokedexEntry>
)

data class PokedexEntry(
    @field:Json(name="name")
    val name: String,
    @field:Json(name="url")
    val url: String
)
