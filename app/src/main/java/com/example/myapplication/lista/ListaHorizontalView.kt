package com.example.myapplication.lista

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.Comentario
import com.example.myapplication.ui.theme.MyApplicationTheme

@Preview(showBackground = true)
@Composable
fun ListaHorizontal_EspacioSobrepasado_Preview() {
    MyApplicationTheme() {
        ListaHorizontal_EspacioSobrepasado()
    }
}

@Composable
fun ListaHorizontal_EspacioSobrepasado() {
    Column {
        Comentario(
            text = "Escenario: Cuando tengo 2 columnas con ancho proporcional (weight)\"" +
                    "si el ancho de los hijo buscará ajustarse a la proporcion \n" +
                    "si el elemento secundario es más grande buscará achicarse"
        )

        Comentario(text = "Ejemplo 1: espacio sobrepasado, el segundo boton se redimensionó")
        Row(
            modifier = Modifier
                .background(Color.LightGray)
                .width(150.dp)
        ) {
            Row(
                modifier = Modifier
                    .weight(2f)
            ) {
                Button(onClick = { }) {
                    Image(Icons.Default.Refresh, "")
                }
                Button(onClick = { }) {
                    Image(Icons.Default.Call, "")
                }
            }
            Box(
                Modifier
                    .background(Green)
                    .height(50.dp)
                    .weight(1f)
            )
        }

        Comentario(text = "Ejemplo 2: Para que no se redimensiones agrego un scroll")
        Row(
            modifier = Modifier
                .background(Color.LightGray)
                .width(150.dp)
        ) {
            val scrollState = rememberScrollState()

            Row(
                modifier = Modifier
                    .weight(2f)
                    .horizontalScroll(state = scrollState)
            ) {
                Button(onClick = { }) {
                    Image(Icons.Default.Refresh, "")
                }
                Button(onClick = { }) {
                    Image(Icons.Default.Call, "")
                }
            }
            Box(
                Modifier
                    .background(Green)
                    .height(50.dp)
                    .weight(1f)
            )
        }

    }
}
