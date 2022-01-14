package com.example.daggerhilt.models

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor() {

    fun getWheel() {
        Log.i(Companion.TAG, "getWheel: wheel is ready.")
    }

    companion object {
        private const val TAG = "Wheel"
    }
}