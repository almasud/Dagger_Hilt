package com.example.daggerhilt.models

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor() {

    fun getCarStatus() {
        Log.i(TAG, "getCarStatus: Car is running...")
    }

    companion object {
        private const val TAG = "Car"
    }
}