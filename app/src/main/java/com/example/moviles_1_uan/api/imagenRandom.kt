package com.example.moviles_1_uan.api

import com.google.gson.annotations.SerializedName

data class imagenRandom(
    @SerializedName("message") val message: String,
    @SerializedName("status") val status: String
)
