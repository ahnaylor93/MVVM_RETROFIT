package com.apolis.newsapp_retrofit4.api

import com.example.lecture19_1.LatestNewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.Headers

interface ApiService {


    @GET("latest-news")
    fun getLatestNews(): Call<LatestNewsResponse>

}