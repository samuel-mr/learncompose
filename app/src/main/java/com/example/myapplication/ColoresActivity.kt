package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

class ColoresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
        }
    }

    @Preview
    @Composable
    fun Gradientes() {
        val gradient_simple1 = Brush.horizontalGradient(
            colors = listOf(Color(0xFFb92b27), Color(0XFF1565C0))
        )
        val gradient_simple2 = Brush.horizontalGradient(
            colors = listOf(Color(0xFFb92b27), Color(0XFF1565C0))
        )
        val gradient_simple3 = Brush.horizontalGradient(
            colors = listOf(Color(0xFF373B44), Color(0XFF4286f4))
        )
        val gradient_simple4 = Brush.horizontalGradient(
            colors = listOf(Color(0xFFf12711), Color(0XFFf5af19))
        )
        val gradienBrush0 = Brush.horizontalGradient(
            colors = listOf(Color.Red, Color.Blue, Color.Green)
        )
        val gradienBrush1 = Brush.horizontalGradient(
            colors = listOf(Color.Red, Color.Blue, Color.Green),
            startX = 0.0f,
            endX = 200.0f
        )
        val gradienBrush2 = Brush.horizontalGradient(
            colors = listOf(Color.Red, Color.Blue, Color.Green),
            startX = 0.0f,
            endX = 500.0f
        )
        val gradienBrush3 = Brush.horizontalGradient(
            colors = listOf(Color.Red, Color.Blue, Color.Green),
            startX = 0.0f,
            endX = 1000.0f
        )

        Column() {
            Text("Red,Blue,Green",
                Modifier
                    .background(brush = gradient_simple1)
                    .padding(5.dp))
            Text("Sunset",
                Modifier
                    .background(brush = gradient_simple2)
                    .padding(5.dp))
            Text("DarkOcean",
                Modifier
                    .background(brush = gradient_simple3)
                    .padding(5.dp))
            Text("Flare",
                Modifier
                    .background(brush = gradient_simple4)
                    .padding(5.dp))
            Text(
                "Gradiente solo colores",
                Modifier
                    .background(brush = gradienBrush0)
                    .padding(5.dp)
            )
            Text(
                "start=0, End=200",
                Modifier
                    .background(brush = gradienBrush1)
                    .padding(5.dp)
            )
            Text(
                "start=0, End=500",
                Modifier
                    .background(brush = gradienBrush2)
                    .padding(5.dp)
            )
            Text(
                "start=0, End=1000",
                Modifier
                    .background(brush = gradienBrush3)
                    .padding(5.dp)
            )
        }
    }


    @Preview
    @Composable
    fun Colores() {
        Column {
            Surface(color = Color.Yellow) {
                Text("Amarillo")
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

    @Preview
    @Composable
    fun ModificadoresApp() {
        Modificadores()
    }

    @Composable
    fun Modificadores(modifier: Modifier = Modifier) {
        Surface(color = Color.Red) {
            Text(
                text = "Hola!",
                modifier = modifier
                    .padding(16.dp)
                    .background(color = Color.Magenta)
            )
        }
    }


    @Preview
    @Composable
    fun CompuestoApp(){

        Column(modifier = Modifier.fillMaxSize().wrapContentSize()) {

            // Create a linear gradient that shows red in the top left corner
            // and blue in the bottom right corner
            val linear = Brush.linearGradient(listOf(Color.Red, Color.Blue))

            Box(modifier = Modifier.size(120.dp).background(linear))

            Spacer(modifier = Modifier.size(20.dp))

            // radial gradient: verde en el centro, magente en el exterior (que será un cuadrado)
            val radial = Brush.radialGradient(listOf(Color.Green, Color.Magenta))
            Box(modifier = Modifier.size(120.dp).background(radial))

            Spacer(modifier = Modifier.size(20.dp))

            // sweepGradient: aun no se como definirlo porque la documentaci
            val sweep = Brush.sweepGradient(listOf(Color.Cyan, Color.Magenta))
            Box(modifier = Modifier.size(120.dp).background(sweep))
        }
    }
}