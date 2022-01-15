package com.example.daggerhilt.services

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
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
@InstallIn(ActivityComponent::class)
abstract class MediaModule {

    @Binds
    abstract fun bindMedia(
        vehicle: Vehicle
    ) : Media
}