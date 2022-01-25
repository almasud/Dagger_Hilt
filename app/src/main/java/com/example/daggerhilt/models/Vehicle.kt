package com.example.daggerhilt.models

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

interface Media {
    fun getName() : String
}

// Constructor-injected
class Vehicle @Inject constructor(
    @FirstName
    private val fistName: String,
    @LastName
    private val lastName: String
    ) : Media {

    override fun getName(): String {
        return "$fistName $lastName"
    }
}

@Module
@InstallIn(SingletonComponent::class)
object MediaModule {
    // Hilt doesn't care about method name. It's care return type
    // And same return type more than once confuses to hilt what
    // should be choose? For that reason we need to use qualifier
    // as an annotation


    @Provides
    @Singleton
    @FirstName
    fun getFirstName() : String = "CNG"

    @Provides
    @Singleton
    @LastName
    fun getLastName() : String = "Vehicle"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LastName