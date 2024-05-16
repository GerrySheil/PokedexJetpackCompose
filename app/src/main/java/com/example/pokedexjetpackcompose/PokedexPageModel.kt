package com.example.pokedexjetpackcompose

data class PokedexPageModel(
    val next:String,
    val prev: String,
    val results: List<PokedexEntry>

)

data class PokedexEntry(
    val name: String,
    val url: String
)
