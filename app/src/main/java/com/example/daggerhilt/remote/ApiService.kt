package com.example.daggerhilt.remote

import com.example.daggerhilt.models.Post
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPost() : List<Post>
}