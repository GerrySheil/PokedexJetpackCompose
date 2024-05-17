package com.example.pokedexjetpackcompose.data.remote

import com.example.pokedexjetpackcompose.data.PokedexDTO
import com.example.pokedexjetpackcompose.data.PokemonDataDTO
import com.example.pokedexjetpackcompose.data.remote.responses.Pokemon
import com.example.pokedexjetpackcompose.data.remote.responses.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokedexAPI {

    @GET("pokemon")
    suspend fun getPokemonList(
            @Query("limit") limit: Int,
            @Query("offset") offset: Int = 0
    ): PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemon(
        @Path("name") name: String
    ): Pokemon
}