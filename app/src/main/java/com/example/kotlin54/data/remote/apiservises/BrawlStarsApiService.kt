package com.example.kotlin54.data.remote.apiservises

import com.example.kotlin54.data.model.BrawlStarsResponse
import retrofit2.Call
import retrofit2.http.GET

private const val POSTS_END_POINT = "brawlers"

interface BrawlStarsApiService {
    @GET(POSTS_END_POINT)
    fun getPosts(): Call<BrawlStarsResponse>

}