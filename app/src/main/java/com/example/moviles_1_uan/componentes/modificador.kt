package com.example.moviles_1_uan.componentes

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles_1_uan.ui.theme.GoldColor

@Preview(showBackground = true)
@Composable
fun Modificador(){
    Text("Hola Mundo", modifier = Modifier
            .background(Color(0xFFEF5400))
            .padding(7.dp)
           // .background(Color.Red)
            //.padding(top = 14.dp)
            .padding(vertical = 14.dp)
            //.alpha(alpha = 0.5f)
            //.blur(0.8.dp)
            //.border(2.dp, Color.DarkGray)
            .shadow(elevation = 20.dp)
            //.rotate(degrees = 180f)
        ,
        color = Color(0xFFFFFFFF),
        fontSize = 12.sp
    )
}

