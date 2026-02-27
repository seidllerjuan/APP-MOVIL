package com.example.moviles_1_uan.trash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.HorizontalDivider // Cambiado por Divider (Material3)
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
// IMPORTANTE: Cambia esto por el nombre real de tu paquete
import com.example.moviles_1_uan.R

@Preview(showBackground = true)
@Composable
fun PostInstagram() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        RowHeader()

        Spacer(modifier = Modifier.height(8.dp))

        Image(
            // Asegúrate de tener una imagen llamada "post" en res/drawable
            painter = painterResource(id = R.drawable.laptop),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "❤️ 1,245 Me gusta")

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "usuario: Qué buen día ☀️")

        HorizontalDivider(modifier = Modifier.padding(top = 12.dp))
    }
}

@Composable
fun RowHeader() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Text("usuario", modifier = Modifier.align(Alignment.CenterStart))
        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = "Opciones",
            modifier = Modifier.align(Alignment.CenterEnd)
        )
    }
}