package com.example.daggerhilt.views

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerhilt.R
import com.example.daggerhilt.models.Car
import com.example.daggerhilt.view_models.PostVM
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val postVM : PostVM by viewModels()
    @Inject  // Field injection
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.showMediaType()
        car.showCarStatus()

        // Get data from remote
        postVM.postResponse.observe(this, { posts ->
            Log.i(TAG, "onCreate: first post body is: ${posts[0].body}")
        })
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}