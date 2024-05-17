package com.example.pokedexjetpackcompose.data

import com.squareup.moshi.Json
data class PokemonDataDTO(
    @field:Json(name = "id")
    val id: Int,
    @field:Json(name = "name")
    val name: String,
    @field:Json(name = "sprites")
    val sprites: SpritesDTO,
    @field:Json(name="types")
    val types: List<Types>,
    @field:Json(name="stats")
    val stats: List<Stats>
)

data class SpritesDTO(
    @field:Json(name="front-default")
    val frontDefault:String
)

data class Types(
    @field:Json(name="types")
    val type: Type
)

data class Type(
    @field:Json(name="name")
    val name: String,
)

data class Stats(
    @field:Json(name="baseStat")
    val baseStat: Int,
    @field:Json(name="stat")
    val stat: Stat
)

data class Stat(
    @field:Json(name="name")
    val name: String
)
