package com.example.pokedexjetpackcompose


data class PokemonModel(
    val id: Int,
    val name: String,
    val sprites: Sprites,
    val types: List<Types>,
    val stats: List<Stats>
    )

data class Sprites(
    val frontDefault: String
)

data class Types(
    val type: Type
)

data class Type(
    val name: String,
)

data class Stats(
    val baseStat: Int,
    val stat: Stat
)

data class Stat(
    val name: String
)
