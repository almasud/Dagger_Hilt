package com.example.daggerhilt.repositories

import com.example.daggerhilt.models.Post
import com.example.daggerhilt.remote.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepository @Inject constructor(private val apiService: ApiService) {

    fun getPost() : Flow<List<Post>> = flow {
        val request = apiService.getPost()
        emit(request)
    }.flowOn(Dispatchers.IO)

}