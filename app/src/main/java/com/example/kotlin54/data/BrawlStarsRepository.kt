package com.example.kotlin54.data

import android.telecom.Call
import android.view.WindowInsetsAnimation
import com.example.kotlin54.data.model.BrawlStarsResponse
import com.example.kotlin54.data.model.ListItem
import com.example.kotlin54.data.remote.apiservises.BrawlStarsApiService
import com.example.kotlin54.data.remote.apiservises.RetrofitClient
import retrofit2.Callback
import retrofit2.Response

class BrawlStarsRepository {
    private val BrawlStarsApiService = RetrofitClient.jsonPlaceholderApiService

    fun getCharacter(
        onResponse: (character: List<ListItem>) -> Unit,
        onFailure: (t: Throwable) -> Unit
    ) {
        BrawlStarsApiService.getPosts().enqueue(object : Callback<BrawlStarsResponse> {
            override fun onResponse(
                call: retrofit2.Call<BrawlStarsResponse>,
                response: Response<BrawlStarsResponse>
            ) {
                if(response.isSuccessful) {
                    response.body()?.let {
                        onResponse(it.list!!)
                    }
                }
            }

            override fun onFailure(call: retrofit2.Call<BrawlStarsResponse>, t: Throwable) {
                onFailure(t)
            }


        })
    }
}