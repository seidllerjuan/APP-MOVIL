package com.example.moviles_1_uan

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyTextView(){

    val myfontColor =   Color.Magenta
    val tamaniofuente = 80.sp

    Text( text = stringResource(R.string.saludo_txt),
            color = myfontColor,
            fontSize = tamaniofuente,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Thin,
            fontFamily = FontFamily.Serif,
            textDecoration = TextDecoration.Underline,
            letterSpacing = 20.sp,
            lineHeight = 70.sp,
            textAlign = TextAlign.Right,
            maxLines = 4,
            //minLines = 5,
            overflow = TextOverflow.Ellipsis
    )
}