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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.myapplication.Comentario


@Preview(showBackground = true, name = "Grandiente linearx (diagonal)2")
@Composable
fun GradienteHorizontal22() {
    Column(
        modifier = Modifier
    ) {

        Text(text = "GRADIENTE LINEARES: horizontal / vertical")
        Row() {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(brush = Brush.horizontalGradient(listOf(Color.Red, Color.Blue)))
            )

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(brush = Brush.verticalGradient(listOf(Color.Red, Color.Blue)))
            )

        }

        Text(text = "startX: mueve el inicio tomando el primer color")
        Row() {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(Color.Red, Color.Blue),
                            startX = -120f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(Color.Red, Color.Blue),
                            startX = 120f
                        )
                    )
            )
        }
        Text(text = "endX: mueve tomando el último color")
        Row() {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(Color.Red, Color.Blue),
                            endX = 90f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(Color.Red, Color.Blue),
                            endX = 220f
                        )
                    )
            )
        }
    }
}

@Preview(showBackground = true, name = "Gradientes 2 colores")
@Composable
fun Gradiente3ColoresPreview() {

    Column(
        modifier = Modifier
    ) {
        Text(text = "GRADIENTES RADIAL:")

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "default")
        Row() {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(2.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color(0xFF030303), Color(0xFF0F1F83))
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(2.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color(0xFF0F1F83), Color(0xFF030303))
                        )
                    )
            )

        }
        Text(text = "center: mueve la posición central")
        Row() {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(2.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color(0xFF030303), Color(0xFF0F1F83)),
                            center = Offset(180f, 0f)
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(2.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color(0xFF030303), Color(0xFF0F1F83)),
                            center = Offset(0f, 90f)
                        )
                    )
            )
        }
        Text(text = "radius: modifica el tamaño del radio")
        Row() {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(2.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color(0xFF030303), Color(0xFF0F1F83)),
                            radius = 250f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(2.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color(0xFF030303), Color(0xFF0F1F83)),
                            radius = 30f
                        )
                    )
            )
        }
    }
}

@Preview(showBackground = true, name = "Gradientes 3 colores")
@Composable
fun Gradiente2ColoresPreview() {

    Column(
        modifier = Modifier
    ) {
        Text(text = "GRADIENTE RADIALES : (otras propiedades")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Gradiente Circulares (Clamp by default)")
        Row() {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color.Red, Color.Green, Color.Blue)
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color.Red, Color.Green, Color.Blue),
                            radius = 60f,
                        )
                    )
            )
        }
        Text(text = "Gradiente Circulares (Mirror)")
        Row() {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color.Red, Color.Green, Color.Blue),
                            tileMode = TileMode.Mirror
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color.Red, Color.Green, Color.Blue),
                            tileMode = TileMode.Mirror,
                            radius = 60f
                        )
                    )
            )
        }

        Text(text = "Gradiente Circulares (Repeated)")
        Row() {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color.Red, Color.Green, Color.Blue),
                            tileMode = TileMode.Repeated
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color.Red, Color.Green, Color.Blue),
                            tileMode = TileMode.Repeated,
                            radius = 60f
                        )
                    )
            )
        }

    }
}

/**
 * https://stackoverflow.com/questions/67598613/android-compose-custom-lineargradient-with-angle-like-gradientdrawable
 */
@Preview(showBackground = true, name = "Grandiente linear (diagonal)")
@Composable
fun GradienteCambioPosicion() {
    Column(
        modifier = Modifier
    ) {


        Text(text = "GRADIENTES DIAGONALES")
        Text(text = "Dirección 1")
        Row() {

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(brush = Brush.linearGradient(listOf(Color.Red, Color.Blue)))
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(
                        brush = Brush.linearGradient(
                            listOf(Color.Red, Color.Blue),
                            start = Offset(120f, 120f),
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(
                        brush = Brush.linearGradient(
                            listOf(Color.Red, Color.Blue),
                            end = Offset(Float.POSITIVE_INFINITY, 120f),
                        )
                    )
            )
        }

        Text(text = "Dirección 2")
        Row() {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(
                        brush = Brush.linearGradient(
                            listOf(Color.Red, Color.Blue),
                            start = Offset(0f, Float.POSITIVE_INFINITY),
                            end = Offset(Float.POSITIVE_INFINITY, 0f)
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(
                        brush = Brush.linearGradient(
                            listOf(Color.Red, Color.Blue),
                            start = Offset(0f, Float.POSITIVE_INFINITY),
                            end = Offset(120f, 120f)
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(
                        brush = Brush.linearGradient(
                            listOf(Color.Red, Color.Blue),
                            start = Offset(0f, Float.POSITIVE_INFINITY),
                            end = Offset(60f, 60f)
                        )
                    )
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GradienteSweepPreview() {
    Column() {
        Text(text = "GRADIENTE SWEEP")
        Text(text = "(default)")
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Brush.sweepGradient(listOf(Color.Cyan, Color.Magenta)))
        )

        Text(text = "(centro modificado)")
        Box(
            modifier = Modifier
                .size(120.dp)
                .padding(5.dp)
                .background(
                    Brush.sweepGradient(
                        listOf(Color.Red, Color.Green, Color.Blue),
                        center = Offset(50.0f, 0.0f)
                    )
                )
        )
    }

}
