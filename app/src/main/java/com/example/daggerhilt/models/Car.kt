package com.example.daggerhilt.models

import android.util.Log
import javax.inject.Inject

// Constructor injection - When Inject to constructor then
// no need to Inject (annotated) to parameter (s)
class Car @Inject constructor(
    private val vehicle: Vehicle,
    private val engine: Engine,
    private val wheel: Wheel
    ) {

    fun showCarStatus() {
        engine.showEngineStatus()
        wheel.showWheelStatus()
        Log.i(TAG, "getCarStatus: Car is running...")
    }

    fun showMediaType() {
        Log.i(TAG, "showMediaType: media type is: ${vehicle.getName()}")
    }

    companion object {
        private const val TAG = "Car"
    }
}