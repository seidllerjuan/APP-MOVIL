package com.example.moviles_1_uan.api

import okhttp3.Response
import retrofit2.http.GET

interface aoiInterface {
    @GET("breeds/image/random")
    suspend fun imagenAleatoria(){

    }



}