package com.example.myapplication.estilos

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.myapplication.Comentario

class GradientStartAndEnd : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
        }
    }

    @Composable
    fun Texto_Gradiente(texto: String, brush: Brush) {
        Text(
            texto,
            Modifier
                .background(brush = brush)
                .width(300.dp)
                .padding(8.dp)
        )
    }

    fun Modifier.PropiedadesTexto() = this
        .width(300.dp)
        .height(30.dp)

    @Preview(showBackground = true, name = "Gradientes con variaciones (startX)")
    @Composable
    fun Gradientes_Variaciones_StartX() {
        Column() {
            Comentario(text = "startX: amplia o disminuye el 1er color")
            Text(
                text = "startX = 0", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            startX = 0.0f
                        )
                    )
            )
            Text(
                text = "startX = 100", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            startX = 100.0f
                        )
                    )
            )
            Text(
                text = "startX = 200", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            startX = 200.0f
                        )
                    )
            )
            Text(
                text = "startX = 300", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            startX = 300.0f
                        )
                    )
            )
            Text(
                text = "startX = 400", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            startX = 400.0f
                        )
                    )
            )
            Text(
                text = "startX = 500", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            startX = 500.0f
                        )
                    )
            )
        }
    }

    @Preview(showBackground = true, name = "Gradientes con variaciones (endX)")
    @Composable
    fun Gradientes_Variaciones_endX() {
        Column() {
            Comentario(text = "endX: amplia o disminuye el último color")

            Text(
                text = "endX = 0", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            endX = 0.0f
                        )
                    )
            )
            Text(
                text = "endX = 100", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            endX = 100.0f
                        )
                    )
            )
            Text(
                text = "endX = 200", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            endX = 200.0f
                        )
                    )
            )
            Text(
                text = "endX = 300", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            endX = 300.0f
                        )
                    )
            )
            Text(
                text = "endX = 400", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            endX = 400.0f
                        )
                    )
            )
            Text(
                text = "endX = 500", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            endX = 500.0f
                        )
                    )
            )
        }
    }

    @Preview(showBackground = true, name = "Gradientes con variaciones (startX + endX)")
    @Composable
    fun Gradientes_Variaciones_startX_endX() {
        Column() {

            Comentario(text = "startX + endX son notorios cuando hay al menos 3 colores")
            Text(
                text = "startX = 100 , endX = 300", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            startX = 100.0f,
                            endX = 300.0f
                        )
                    )
            )
            Text(
                text = "startX = 100 , endX = 400", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            startX = 100.0f,
                            endX = 400.0f
                        )
                    )
            )
            Text(
                text = "startX = 200 , endX = 500", modifier = Modifier
                    .PropiedadesTexto()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Red, Color.Blue, Color.Green),
                            startX = 200.0f,
                            endX = 500.0f
                        )
                    )
            )
        }
    }

}
