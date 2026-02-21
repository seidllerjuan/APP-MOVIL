package com.example.moviles_1_uan.listas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun Listview(){
    val productVM = ProductViewModel()
    Column(modifier = Modifier.fillMaxSize()) {
        LazyRow () {
            item { Text("Hola") }
            items(productVM.getProducts()){ producto ->
                ProductView(producto)
            }
            item { Text("Hola") }

        }
    }
}