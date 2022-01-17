package com.example.daggerhilt.view_models

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.daggerhilt.models.Post
import com.example.daggerhilt.repositories.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import javax.inject.Inject

@HiltViewModel
class PostVM @Inject constructor(private val postRepository: PostRepository)
    : ViewModel() {

        val postResponse : LiveData<List<Post>> = postRepository.getPost()
            .catch { e ->
                Log.e(TAG, "error: ${e.message}", e)
            }.asLiveData()

    companion object {
        private const val TAG = "PostVM"
    }
}