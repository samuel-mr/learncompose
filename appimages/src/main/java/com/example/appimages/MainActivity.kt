package com.example.appimages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.appimages.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {

            }
        }
    }
}

/**
 * Agrega un título para describir el comportamiento de algo
 */
@Composable
fun Titulo(text: String) {
    Row(
        modifier = Modifier
            .padding(vertical = 5.dp, horizontal = 0.dp)
            .height(34.dp)
            .background(Color.LightGray)
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = 16.sp, color = Color.Gray),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TituloPreview() {
    Titulo(text = "Prueba de mensaje")
}

/**
 * Agrega un comentario para describir el comportamiento de algo
 */
@Composable
fun Comentario(text: String) {
    Row(
        modifier = Modifier
            .padding(vertical = 5.dp, horizontal = 0.dp)
        // .background(Color.LightGray)
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Start,
            style = TextStyle(fontSize = 12.sp, color = Color.Gray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 5.dp)
                .align(Alignment.CenterVertically)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComentarioPreview() {
    Comentario(text = "Este es un super comentario que debo probar para que sea multilinea")
}
