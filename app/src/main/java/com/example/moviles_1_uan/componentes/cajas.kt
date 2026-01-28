package com.example.movil23534.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Cajas(){
    Box(modifier = Modifier.fillMaxSize()){
        CajaInterna( alineacion = Alignment.TopStart)
        CajaInterna( alineacion = Alignment.BottomEnd)
    }
}
@Composable
fun CajaInterna(alineacion:Alignment){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = alineacion){
        Box(modifier = Modifier.size(300.dp)){
            Text("1",Modifier.background(color = Color.Green).align(Alignment.TopStart),
                color=Color.White,
                fontSize = 80.sp)
            Text("2",Modifier.background(color = Color.Red).align(Alignment.TopCenter),
                color=Color.White,
                fontSize = 80.sp)
            Text("3",Modifier.background(color = Color.Gray).align(Alignment.TopEnd),
                color=Color.White,
                fontSize = 80.sp)
            Text("4",Modifier.background(color = Color.Black).align(Alignment.CenterStart),
                color=Color.White,
                fontSize = 80.sp)
            Text("5",Modifier.background(color = Color.Blue).align(Alignment.Center),
                color=Color.White,
                fontSize = 80.sp)
            Text("6",Modifier.background(color = Color.Red).align(Alignment.CenterEnd),
                color=Color.White,
                fontSize = 80.sp)
            Text("7",Modifier.background(color = Color.Yellow).align(Alignment.BottomStart),
                color=Color.White,
                fontSize = 80.sp)
            Text("8",Modifier.background(color = Color.Magenta).align(Alignment.BottomCenter),
                color=Color.White,
                fontSize = 80.sp)
            Text("9",Modifier.background(color = Color.Cyan).align(Alignment.BottomEnd),
                color=Color.White,
                fontSize = 80.sp)

        }
    }

}
