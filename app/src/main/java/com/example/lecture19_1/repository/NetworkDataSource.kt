package com.example.lecture19_1.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.apolis.newsapp_retrofit4.api.ApiClient
import com.example.lecture19_1.LatestNewsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NetworkDataSource {
    fun retrieveData(): MutableLiveData<LatestNewsResponse>{
        val call = ApiClient.apiService.getLatestNews()
        var liveData: MutableLiveData<LatestNewsResponse> = MutableLiveData()
        call.enqueue(object : Callback<LatestNewsResponse> {
            override fun onResponse(
                call: Call<LatestNewsResponse>,
                response: Response<LatestNewsResponse>
            ) {
                liveData.value = response.body()

            }

            override fun onFailure(call: Call<LatestNewsResponse>, t: Throwable) {

            }
        })
        return liveData
    }
}