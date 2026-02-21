package com.example.moviles_1_uan.listas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles_1_uan.R

@Preview(showBackground = true)
@Composable
fun ProductPreview(){
    val computadora = ProductoModel(imagens = R.drawable.baseline_surfing_24, nombre = "Iphone 17 pro max", calif = 4.8f, precio = 28779.0 , entrega = "Lunes")
    ProductView(computadora)
}

//fun ProductoView(producto:Int,nombre: String, calificacion: Double,precio: Int, llegada: String) {

@Composable
fun ProductView(producto: ProductoModel) {
//    var producto: Int = com.example.moviles_1_uan.R.drawable.images
//    var nombre: String = "LA GRASA"
//    var calificacion: Double = 4.0
//    var precio: Int= 200
//    var llegada: String = "Llegara"

    var texto by remember {
        mutableStateOf("")
    }

    var activo by remember {
        mutableStateOf(false)
    }
    fun cambiarTexto(){
        if (activo){
            texto="agregste al carro"
        } else{
            texto=""
        }
        activo = !activo
    }

    Card(modifier = Modifier.padding(17.dp), colors = CardDefaults.cardColors(
        contentColor = Color.Black

    )) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(
                    painter = painterResource(producto.imagens),
                    contentDescription = "imagen de producto",
                    modifier = Modifier
                        .size(120.dp)
                        .align(Alignment.CenterVertically)
                )
                Column() {
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(producto.nombre, fontSize = 22.sp)
                    Text("⭐️${producto.calif}", fontSize = 18.sp)
                    Text(producto.precio.toString(), fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text("llega el ${producto.entrega}", fontSize = 20.sp)
                    Spacer(modifier = Modifier.size(10.dp))
                    Button(
                        onClick = {
                            cambiarTexto()

                        }, colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFF000000),
                            containerColor = Color(0xFFFFEB3B)
                        )
                    ) {
                        Text("Agregar al carrito")
                    }
                    Spacer(modifier = Modifier.size(10.dp))

                }

            }
        }
    }

}