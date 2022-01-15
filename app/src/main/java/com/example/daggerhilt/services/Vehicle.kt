package com.example.daggerhilt.services

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

interface Media {
    fun getName() : String
}

// Constructor-injected, because Hilt needs to know how to
// provide instances of Vehicle, too.
class Vehicle @Inject constructor() : Media {

    override fun getName(): String {
        return "Vehicle"
    }
}

@Module
@InstallIn(SingletonComponent::class)
object MediaModule {

    @Provides
    fun provideMedia() : Media = Vehicle()
}