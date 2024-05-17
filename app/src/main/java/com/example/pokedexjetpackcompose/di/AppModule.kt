package com.example.pokedexjetpackcompose.di

import com.example.pokedexjetpackcompose.data.remote.PokedexAPI
import com.example.pokedexjetpackcompose.repository.PokemonRepository
import com.example.pokedexjetpackcompose.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRespoitory(
        api: PokedexAPI
    ) = PokemonRepository(api)

    @Singleton
    @Provides
    fun providePokeApi(): PokedexAPI{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokedexAPI::class.java)
    }

}