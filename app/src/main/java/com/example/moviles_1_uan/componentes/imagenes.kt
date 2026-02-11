package com.example.moviles_1_uan.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles_1_uan.R

@Preview(showBackground = true)

@Composable
fun Imagenes (){
    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.haloverde),
            contentDescription = "El jeilo verde regresa",
            modifier = Modifier.size(400.dp).clip(CircleShape),
            contentScale = ContentScale.FillHeight
            )
        Icon(painter= painterResource(R.drawable.baseline_surfing_24),
            contentDescription = "Icono",
            tint = Color(0xFF2196F3),
            modifier = Modifier.size(200.dp)
        )
        Image(painter = painterResource(R.drawable.images),
            contentDescription = "El jeilo verde regresa",
            modifier = Modifier.size(400.dp).clip(CircleShape),
            contentScale = ContentScale.FillHeight
        )

    }
}
