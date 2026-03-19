package com.example.moviles_1_uan.corutinas

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception
import java.lang.Thread.sleep

class StudentViewModel: ViewModel() {
    var winner by mutableStateOf("")
        private set

    var isloading by mutableStateOf(false)
        private set
    var lista = mutableListOf<String>()
        private set

    init {
        lista = mutableListOf("Carlos","Juan","Pedro")

    }

    fun getWinner(){
        isloading = true
        try {
            viewModelScope.launch {
                winner = ""
                changePerson()
            }
        } catch (e: Exception){
            Log.e("Error background", "Error eb modulo studentViewModel $e")
        }finally {
            isloading = false

        }
    }

    suspend fun changePerson(){
        withContext(Dispatchers.IO){
            isloading=true
            delay(5000)
            winner = "Juan Perez Perez"
            isloading = false

        }
    }
}