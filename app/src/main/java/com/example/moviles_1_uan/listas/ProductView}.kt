package com.example.moviles_1_uan.listas

import android.R
import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles_1_uan.componentes.Modificador

@Preview(showBackground = true)
@Composable
fun ProductView(){
    ProductoView(producto = com.example.moviles_1_uan.R.drawable.images,
                nombre = "laptbook",
                calificacion = 3.0,
                precio = 10,
                llegada = "Lunes"
        )
}

@Composable
fun ProductoView(producto:Int,nombre: String, calificacion: Double,precio: Int, llegada: String) {
//    var producto: Int = com.example.moviles_1_uan.R.drawable.images
//    var nombre: String = "LA GRASA"
//    var calificacion: Double = 4.0
//    var precio: Int= 200
//    var llegada: String = "Llegara"

    Card(modifier = Modifier.padding(17.dp), colors = CardDefaults.cardColors(
        contentColor = Color.Black

    )) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(
                    painter = painterResource(producto),
                    contentDescription = "imagen de producto",
                    modifier = Modifier
                        .size(120.dp)
                        .align(Alignment.CenterVertically)
                )
                Column() {
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(nombre, fontSize = 20.sp)
                    Text(calificacion.toString(), fontSize = 20.sp)
                    Text(precio.toString(), fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text(llegada, fontSize = 18.sp)
                    Spacer(modifier = Modifier.size(10.dp))
                    Button(
                        onClick = {}, colors = ButtonDefaults.buttonColors(
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