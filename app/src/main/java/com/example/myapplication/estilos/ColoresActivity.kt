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

class ColoresActivity : ComponentActivity() {
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

    /**
     * https://cssgradient.io/gradient-backgrounds/
     * https://uigradients.com/
     */
    @Preview(showBackground = true)
    @Composable
    fun Gradientes() {
        val ROJO_SANGRE = 0xFFb92b27
        val AZUL_DODGER = 0XFF1565C0

        Column() {
            Texto_Gradiente(
                "Red, Blue", Brush.horizontalGradient(
                    colors = listOf(Color(ROJO_SANGRE), Color(AZUL_DODGER))
                )
            )
            Texto_Gradiente(
                "Blue 1, Blue 2", Brush.horizontalGradient(
                    colors = listOf(Color(0xFF2B4D82), Color(0xFF2890AC))
                )
            )
            Texto_Gradiente(
                "Ibiza sunset", Brush.horizontalGradient(
                    colors = listOf(Color(0xFFee0979), Color(0xFFff6a00))
                )
            )
            Texto_Gradiente(
                "DarkOcean", Brush.horizontalGradient(
                    colors = listOf(Color(0xFF373B44), Color(0XFF4286f4))
                )
            )
            Texto_Gradiente(
                "Flare", Brush.horizontalGradient(
                    colors = listOf(Color(0xFFf12711), Color(0XFFf5af19))
                )
            )
        }
    }

    @Preview(showBackground = true, name = "Gradientes con variaciones (startX)")
    @Composable
    fun Gradientes_Variaciones_StartX() {
        Column() {
            Texto_Gradiente(
                "startX = 0", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    startX = 0.0f
                )
            )
            Texto_Gradiente(
                "startX = 100", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    startX = 100.0f
                )
            )
            Texto_Gradiente(
                "startX = 200", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    startX = 200.0f
                )
            )
            Texto_Gradiente(
                "startX = 300", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    startX = 300.0f
                )
            )
            Texto_Gradiente(
                "startX = 400", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    startX = 400.0f
                )
            )
            Texto_Gradiente(
                "startX = 500", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    startX = 500.0f
                )
            )
        }
    }

    @Preview(showBackground = true, name = "Gradientes con variaciones (endX)")
    @Composable
    fun Gradientes_Variaciones_endX() {
        Column() {
            Texto_Gradiente(
                "endX = 0", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    endX = 0.0f
                )
            )
            Texto_Gradiente(
                "endX = 100", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    endX = 100.0f
                )
            )
            Texto_Gradiente(
                "endX = 200", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    endX = 200.0f
                )
            )
            Texto_Gradiente(
                "endX = 300", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    endX = 300.0f
                )
            )
            Texto_Gradiente(
                "endX = 400", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    endX = 400.0f
                )
            )
            Texto_Gradiente(
                "endX = 500", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    endX = 500.0f
                )
            )
        }
    }

    @Preview(showBackground = true, name = "Gradientes con variaciones (startX + endX)")
    @Composable
    fun Gradientes_Variaciones_startX_endX() {
        Column() {
            Texto_Gradiente(
                "startX = 100 , endX = 300", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    startX = 100.0f,
                    endX = 300.0f
                )
            )
            Texto_Gradiente(
                "startX = 100 , endX = 400", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    startX = 100.0f,
                    endX = 400.0f
                )
            )
            Texto_Gradiente(
                "startX = 200 , endX = 500", Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color.Blue, Color.Green),
                    startX = 200.0f,
                    endX = 500.0f
                )
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Colores() {
        Column {
            Surface() {
                Text(text = ".toArgb()= ${Color.Yellow.toArgb()}")
            }
            Surface(color = Color.Yellow) {
                Text("Amarillo")
            }
            Surface(color = Color.Yellow.copy(alpha = 0.6f)) {
                Text("Amarillo 60%")
            }
            Surface(color = Color.Yellow.copy(alpha = 0.4f)) {
                Text("Amarillo 40%")
            }
            Surface(color = Color.Yellow.copy(alpha = 0.2f)) {
                Text("Amarillo 20%")
            }
            Surface(color = Color.Red) {
                Text("Rojo")
            }
            Surface(color = Color.Cyan) {
                Text("Cyan")
            }
            Surface(color = Color(0xFF95bb65)) {
                Text("Personalizado")
            }
        }
    }

    /**
     * https://stackoverflow.com/questions/67598613/android-compose-custom-lineargradient-with-angle-like-gradientdrawable
     */
    @Preview(showBackground = true, name = "Grandiente linear (diagonal)")
    @Composable
    fun Grandiente_Linear() {
        Column(
            modifier = Modifier
                .size(width = 200.dp, height = 400.dp)
                .wrapContentSize()
        ) {

            val linear_default = Brush.linearGradient(listOf(Color.Red, Color.Blue))

            val linear_angle45 = Brush.linearGradient(
                listOf(Color.Red, Color.Blue),
                start = Offset(0f, Float.POSITIVE_INFINITY),
                end = Offset(Float.POSITIVE_INFINITY, 0f)
            )
            val linear_angle90 = Brush.linearGradient(
                listOf(Color.Red, Color.Blue),
                start = Offset(0f, Float.POSITIVE_INFINITY),
                end = Offset(0f, 0f)
            )

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(linear_default)
            ) {
                Text("default")
            }
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(linear_angle45)
            ) {
                Text("45°")
            }
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .padding(5.dp)
                    .background(linear_angle90)
            ) {
                Text("90°")
            }

        }
    }

    @Preview(showBackground = true, name = "Gradientes extra")
    @Composable
    fun CompuestoApp() {

        Column(
            modifier = Modifier
                .size(width = 200.dp, height = 300.dp)
                .wrapContentSize()
        ) {

            // radial gradient: verde en el centro, magente en el exterior (que será un cuadrado)
            val radial = Brush.radialGradient(listOf(Color.Green, Color.Magenta))
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(radial)
            )

            Spacer(modifier = Modifier.size(20.dp))

            // sweepGradient: aun no se como definirlo porque la documentaci
            val sweep = Brush.sweepGradient(listOf(Color.Cyan, Color.Magenta))
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(sweep)
            )
        }
    }
}
