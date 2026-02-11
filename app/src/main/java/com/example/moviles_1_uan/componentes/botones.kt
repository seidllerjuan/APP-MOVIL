package com.example.movil23534.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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

@Preview(showBackground = true)
@Composable

fun Botones(){
    var texto by remember {
        mutableStateOf("")
    }

    var activo by remember {
        mutableStateOf(false)
    }
    fun cambiarTexto(){
        if (activo){
            texto="activo"
        } else{
            texto="xd"
        }
        activo = !activo
    }
    Column(modifier = Modifier
        .fillMaxSize().padding(40.dp)) {
        Text(texto)
        Button(onClick = {
            cambiarTexto()
        }, colors = ButtonDefaults.buttonColors(
            contentColor = Color(0xFF1CC02B),
            containerColor = Color(0xFF110606)
        )){
            Text(text = "Click me")
        }
    }
}


