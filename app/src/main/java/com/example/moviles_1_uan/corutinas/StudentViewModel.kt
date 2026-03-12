package com.example.moviles_1_uan.corutinas

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import java.lang.Thread.sleep

class StudentViewModel {
    var winner by mutableStateOf("")
    fun getWinner(){
        winner = ""
        sleep(5000)
        winner = "Juan Perez Perez"
    }
}