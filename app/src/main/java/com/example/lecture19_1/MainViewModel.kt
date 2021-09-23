package com.example.lecture19_1

import android.app.AlertDialog
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.apolis.newsapp_retrofit4.api.ApiClient
import com.example.lecture19_1.repository.MainRespository
import com.example.lecture19_1.repository.NetworkDataSource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {

    //var liveData: MutableLiveData<LatestNewsResponse> = MutableLiveData()
    fun emitValue() = MainRespository().fetchDataFromNetwork()


        /*val call = ApiClient.apiService.getLatestNews()

        call.enqueue(object : Callback<LatestNewsResponse> {
            override fun onResponse(
                call: Call<LatestNewsResponse>,
                response: Response<LatestNewsResponse>
            ) {
                liveData.value = response.body()
            }

            override fun onFailure(call: Call<LatestNewsResponse>, t: Throwable) {

            }
        })*/


}