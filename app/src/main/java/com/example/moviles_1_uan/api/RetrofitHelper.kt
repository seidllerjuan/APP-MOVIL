package com.example.moviles_1_uan.api

import retrofit2.Retrofit

object RetrofitHelper {
    private val URL_BASE = "https://dog.ceo/api/"

    fun getRetrofitService(): ApiInterface{
        val retrofit = Retrofit.Builder()
            .baseUrl(URL_BASE)
    }
}