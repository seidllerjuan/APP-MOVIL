package com.example.moviles_1_uan.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles_1_uan.MyTextView

@Preview(showBackground = true)
@Composable
fun Columna(){
    Column(verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().background(Color.Gray).padding(end = 120.dp),
        horizontalAlignment = Alignment.End)
    {
        Text("Hola bro")

        Spacer(modifier = Modifier.height(20.dp))

        Text("Que")
        Spacer(modifier = Modifier.height(20.dp))
        Text(" royo")
    }

}
@Preview(showBackground = true)
@Composable
fun Separadores (){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        Text(" otro", modifier = Modifier.fillMaxSize().weight(0.25f))
        HorizontalDivider(thickness = 40.dp, color = Color.Red)
        MyTextView()

        Text(" que ", modifier = Modifier.fillMaxSize().weight(0.5f))
        Text(" obdaaa",modifier = Modifier.fillMaxSize().weight(0.25f))


    }
}