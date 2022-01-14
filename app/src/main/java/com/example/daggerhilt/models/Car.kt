package com.example.daggerhilt.models

import android.util.Log
import javax.inject.Inject

// Constructor injection - When Inject to constructor then
// no need to Inject (annotated) to parameter (s)
class Car @Inject constructor(private val engine: Engine, private val wheel: Wheel) {

    fun getCarStatus() {
        engine.getEngineStatus()
        wheel.getWheel()
        Log.i(TAG, "getCarStatus: Car is running...")
    }

    companion object {
        private const val TAG = "Car"
    }
}