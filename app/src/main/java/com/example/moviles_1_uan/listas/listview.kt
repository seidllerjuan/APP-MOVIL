package com.example.moviles_1_uan.listas

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun Listview(){
    val productVM = ProductViewModel()
    var estado by remember { mutableStateOf(0) }
    fun cambiocolor(): Color{
        return if(estado==0) Color.Black else Color.Blue
    }
    Column(modifier = Modifier.fillMaxSize()) {
        LazyRow (modifier = Modifier.background(cambiocolor()).padding(20.dp)) {
            item { Text("<-") }
            items(productVM.getProducts()){ producto ->
                ProductView(producto, selected = {
                    Log.d("EVENTO","probando el evento click")
                    estado = 1
                 })
                    

            }
            item { Text("->") }

        }
    }
}