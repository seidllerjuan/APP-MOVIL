package com.example.moviles_1_uan.listas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun listview (){
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
        ProductoView(producto = com.example.moviles_1_uan.R.drawable.laptop,
            nombre = "laptop",
            calificacion = 2.0,
            precio = 1100,
            llegada = "Lunes"
        )
        ProductoView(producto = com.example.moviles_1_uan.R.drawable.images,
            nombre = "packnan",
            calificacion = 4.0,
            precio = 2000,
            llegada = "Martes"
        )
        ProductoView(producto = com.example.moviles_1_uan.R.drawable.haloverde,
            nombre = "HALO",
            calificacion = 2.5,
            precio = 540,
            llegada = "Lunes"
        )
        ProductoView(producto = com.example.moviles_1_uan.R.drawable.baseline_surfing_24,
            nombre = "CURSO SURFISTA",
            calificacion = 4.0,
            precio = 100,
            llegada = "Miercoles"
        )
        ProductoView(producto = com.example.moviles_1_uan.R.drawable.ic_launcher_background,
            nombre = "Pendiente",
            calificacion = 0.0,
            precio = 0,
            llegada = "----"
        )
        ProductoView(producto = com.example.moviles_1_uan.R.drawable.ic_launcher_background,
            nombre = "Pendiente",
            calificacion = 0.0,
            precio = 0,
            llegada = "----"
        )
        ProductoView(producto = com.example.moviles_1_uan.R.drawable.ic_launcher_background,
            nombre = "Pendiente",
            calificacion = 0.0,
            precio = 0,
            llegada = "----"
        )

        ProductoView(producto = com.example.moviles_1_uan.R.drawable.ic_launcher_background,
            nombre = "Pendiente",
            calificacion = 0.0,
            precio = 0,
            llegada = "----"
        )
        ProductoView(producto = com.example.moviles_1_uan.R.drawable.ic_launcher_background,
            nombre = "Pendiente",
            calificacion = 0.0,
            precio = 0,
            llegada = "----"
        )

        ProductoView(producto = com.example.moviles_1_uan.R.drawable.ic_launcher_background,
            nombre = "Pendiente",
            calificacion = 0.0,
            precio = 0,
            llegada = "----"
        )


    }
}