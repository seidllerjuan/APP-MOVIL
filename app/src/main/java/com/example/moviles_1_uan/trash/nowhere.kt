package com.example.moviles_1_uan.trash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider // En Material3 se usa HorizontalDivider en lugar de Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
// Importa el R de tu propio proyecto (ajusta 'com.example.moviles_1_uan' si es necesario)
import com.example.moviles_1_uan.R

@Preview(showBackground = true)
@Composable
fun ProductoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            // Asegúrate de que la imagen "producto" exista en res/drawable
            painter = painterResource(id = R.drawable.laptop),
            contentDescription = "Imagen de Laptop Gamer",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Laptop Gamer", fontSize = 22.sp)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "$18,999 MXN", fontSize = 26.sp, color = Color.Green)

        Spacer(modifier = Modifier.height(16.dp))

        HorizontalDivider() // Actualizado de Divider a HorizontalDivider

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Laptop con 16GB RAM y RTX 4060")

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { /* Acción de compra */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Comprar ahora")
        }
    }
}