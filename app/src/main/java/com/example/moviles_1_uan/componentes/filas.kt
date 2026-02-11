package com.example.moviles_1_uan.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Filas() {

    Row( Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly ,
        verticalAlignment = Alignment.CenterVertically) {
        Text("uno")
        VerticalDivider()
        Column() {
            Text("dos")

            Text("cuatro")
            Text("cinco")
            Text("seis")
        }

        VerticalDivider()
        Column() {
            Text("tres")

            Row() {
                Text("rrrrrr", Modifier.background(Color.Red),
                    color = Color.Red,
                    lineHeight = 40.sp,

                    )

                Spacer(modifier = Modifier.width(20.dp))
                Text("rrrrrrrrrrrrrr", Modifier.background(Color.Blue),
                    color = Color.Blue,
                    lineHeight = 40.sp,

                    )
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row() {
                Text("rrrrrrrrrrrrrr", Modifier.background(Color.Black),
                    color = Color.Black,
                    lineHeight = 40.sp,

                    )
                Spacer(modifier = Modifier.width(20.dp))

                Text("rrrrrr", Modifier.background(Color.Red),
                    color = Color.Red,
                    lineHeight = 40.sp,

                    )
            }

        }



    }





}