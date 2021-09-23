package com.example.lecture19_1.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lecture19_1.LatestNewsResponse

class MainRespository {
    fun fetchDataFromNetwork(): MutableLiveData<LatestNewsResponse> {
        val networkData = NetworkDataSource().retrieveData()

        return networkData
    }
}