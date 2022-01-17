package com.example.daggerhilt.models
import com.google.gson.annotations.Expose

import androidx.annotation.Keep

import com.google.gson.annotations.SerializedName

@Keep
data class Post(
    @SerializedName("body")
    @Expose
    val body: String,
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("title")
    @Expose
    val title: String,
    @SerializedName("userId")
    @Expose
    val userId: Int
)