package com.example.myapplication.estilos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.Comentario
import com.example.myapplication.ui.theme.MISUPERCOLOR
import com.example.myapplication.ui.theme.color_variableGlobal


@Preview(showBackground = true)
@Composable
fun Colors_Definition() {
    Column() {
        Comentario(text = "Colores predefinidos")

        Text("Color.Red", Modifier.background(color = Color.Red))
        Text("Color.Blue", Modifier.background(color = Color.Blue))
        Text("Color.Green", Modifier.background(color = Color.Green))

        Comentario(text = "Colores creados por mi")
        Text("color_variableGlobal", Modifier.background(color = color_variableGlobal))
        Text(
            "MaterialTheme.colors.MISUPERCOLOR",
            Modifier.background(color = MaterialTheme.colors.MISUPERCOLOR)
        )

        Comentario(text = "Colores creados por mi (sin variables)")
        Text("Color(0xFF95bb65)", Modifier.background(color = Color(0xFF95bb65)))
    }
}


fun Modifier.variasPropriedades() = this
    .fillMaxWidth()
    .height(30.dp)

@Preview(showBackground = true)
@Composable
fun Colores_Opacity() {
    Column {

        Comentario(text = "Opacidad:")
        Text(
            "Green (por defecto)",
            modifier = Modifier
                .background(color = Color.Green)
                .variasPropriedades()
        )
        Text(
            "Green 60%",
            modifier = Modifier
                .background(color = Color.Green.copy(alpha = 0.6f))
                .variasPropriedades()
        )
        Text(
            "Green 40%",
            modifier = Modifier
                .background(color = Color.Green.copy(alpha = 0.4f))
                .variasPropriedades()
        )
        Text(
            "Green 20%",
            modifier = Modifier
                .background(color = Color.Green.copy(alpha = 0.2f))
                .variasPropriedades()
        )
        Text(
            "Green 10%",
            modifier = Modifier
                .background(color = Color.Green.copy(alpha = 0.1f))
                .variasPropriedades()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Colors_ImportantFunctions() {
    Column {

        Comentario(text = "toArgb() -> convierte el Color a un número")
        Text(text = "Color.Yellow.toArgb()= ${Color.Yellow.toArgb()}")
        Text(text = "Color.Red.toArgb()= ${Color.Red.toArgb()}")
        Text(text = "Color.Blue.toArgb()= ${Color.Blue.toArgb()}")
    }
}
