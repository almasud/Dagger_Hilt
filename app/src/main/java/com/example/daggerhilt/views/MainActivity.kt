package com.example.daggerhilt.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerhilt.R
import com.example.daggerhilt.models.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject  // Field injection
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.getCarStatus()
    }
}