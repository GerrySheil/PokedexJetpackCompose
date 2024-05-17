package com.example.pokedexjetpackcompose.repository

import com.example.pokedexjetpackcompose.data.remote.PokedexAPI
import com.example.pokedexjetpackcompose.data.remote.responses.Pokemon
import com.example.pokedexjetpackcompose.data.remote.responses.PokemonList
import com.example.pokedexjetpackcompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokedexAPI
) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList>{
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception){
            return Resource.Error("An unknown error occured")
        }
        return Resource.Success(response)
    }
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        val response = try {
            api.getPokemon(pokemonName)
        } catch (e: Exception){
            return Resource.Error("An unknown error occured")
        }
        return Resource.Success(response)
    }

}