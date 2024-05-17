package com.example.pokedexjetpackcompose.data

import retrofit2.http.GET
import retrofit2.http.Query

interface PokedexAPI {

    @GET("v2/pokemon?")
    suspend fun getPokedexPage(
            @Query("limit") limit: Int = 20,
            @Query("offset") offset: Int = 0
    ): PokedexDTO

    @GET("v2/pokemon/")
    suspend fun getPokemonData(
    ):PokemonDataDTO
}