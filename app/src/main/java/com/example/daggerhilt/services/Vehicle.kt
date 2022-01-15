package com.example.daggerhilt.services

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface Media {
    fun getName() : String
}

// Constructor-injected, because Hilt needs to know how to
// provide instances of Vehicle, too.
class Vehicle @Inject constructor(private val name: String) : Media {

    override fun getName(): String {
        return name
    }
}

@Module
@InstallIn(SingletonComponent::class)
object MediaModule {

    @Provides
    @Singleton
    fun getName() : String = "Vehicle"

    @Provides
    fun provideMedia(
        name: String
    ) : Media = Vehicle(name)
}