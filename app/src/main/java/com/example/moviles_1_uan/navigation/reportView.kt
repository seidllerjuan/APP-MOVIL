package com.example.moviles_1_uan.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

//@Preview(showBackground = true)
@Composable
fun ReportView(navegar: NavHostController) {
    var nombreSeccion by remember { mutableStateOf("Nombre de la seccion") }
    var numeSeccion by remember { mutableStateOf("Nunero de la seccion") }
    var nombreEncargado by remember {mutableStateOf("Nombredel encargado")}
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Reporte de ventas")
        Button(onClick = {
            navegar.navigate(Home)
        }) {
            Text("Regresar")
        }
        TextField(value = nombreSeccion, onValueChange = {nombreSeccion = it}, label = {Text("Nombre de la seccion")})
        TextField(value = numeSeccion, onValueChange = {numeSeccion = it}, label = {Text("Numero de la seccion")})
        TextField(value = nombreEncargado, onValueChange = {nombreEncargado = it}, label = {Text("Nombre del encargado")})
        Button(onClick = {
//            navegar.navigate(ReportManager,numeSeccion.toInt(),nombreEncargado, nombreSeccion)) }) {
                navegar.navigate(ReportManager)
             }) {
            Text("Enviar datos")
        }
    }
}