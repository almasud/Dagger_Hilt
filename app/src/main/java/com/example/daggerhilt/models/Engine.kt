package com.example.daggerhilt.models

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {

    fun getEngineStatus() {
        Log.i(TAG, ": Engine is started.")
    }

    companion object {
        private const val TAG = "Engine"
    }
}