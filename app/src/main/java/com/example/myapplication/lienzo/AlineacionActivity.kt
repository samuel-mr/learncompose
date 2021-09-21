package com.example.myapplication.lienzo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

class AlineacionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Horizontal_Centrado()
        }
    }

    @Preview
    @Composable
    fun Vertical_Centrado() {
        Column(
            modifier = Modifier
                .size(width = 200.dp, height = 300.dp)
                .background(Color.Yellow),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Inicio")
            Text("Center")
            Text("Fin")
        }
    }

    @Preview
    @Composable
    fun Vertical_SpaceBetween() {
        Column(
            modifier = Modifier
                .size(width = 200.dp, height = 300.dp)
                .background(Color.Yellow),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Inicio")
            Text("SpaceBetween")
            Text("Fin")
        }
    }

    @Preview
    @Composable
    fun Vertical_SpaceAround() {
        Column(
            modifier = Modifier
                .size(width = 200.dp, height = 300.dp)
                .background(Color.Yellow),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text("Inicio")
            Text("SpaceAround")
            Text("Fin")
        }
    }

    @Preview
    @Composable
    fun Vertical_SpaceEvenly() {
        Column(
            modifier = Modifier
                .size(width = 200.dp, height = 300.dp)
                .background(Color.Yellow),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Inicio")
            Text("SpaceEvenly")
            Text("Fin")
        }
    }

    @Preview
    @Composable
    fun Horizontal_Centrado() {
        Row(
            modifier = Modifier
                .size(width = 300.dp, height = 200.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Inicio")
            Text("Center")
            Text("Tres")
        }
    }

    @Preview
    @Composable
    fun Horizontal_Start() {
        Row(
            modifier = Modifier
                .size(width = 300.dp, height = 200.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Inicio")
            Text("Start")
            Text("Tres")
        }
    }

    @Preview
    @Composable
    fun Horizontal_End() {
        Row(
            modifier = Modifier
                .size(width = 300.dp, height = 200.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Inicio")
            Text("Start")
            Text("Tres")
        }
    }

    @Preview
    @Composable
    fun Horizontal_SpaceBetween() {
        Row(
            modifier = Modifier
                .size(width = 300.dp, height = 200.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Inicio")
            Text("SpaceBetween")
            Text("Tres")
        }
    }

    @Preview
    @Composable
    fun Horizontal_SpaceAround() {
        Row(
            modifier = Modifier
                .size(width = 300.dp, height = 200.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Inicio")
            Text("SpaceAround")
            Text("Fin")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Horizontal_SpaceEvenly() {
        Row(
            modifier = Modifier
                .size(width = 300.dp, height = 150.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Inicio")
            Text("SpaceEvenly")
            Text("Fin")
        }
    }

    @Preview
    @Composable
    fun Columnas_Varios() {

        Column(
            modifier = Modifier
                .size(width = 300.dp, height = 200.dp)
                .background(Color.Yellow)
        ) {
            Text(
                text = "Column: horizontalAlignment",
                fontSize = 20.sp,
                modifier = Modifier.padding(5.dp)
            )
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Alignment.Start")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Alignment.CenterHorizontally")
            }
            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Alignment.End")
            }
        }
    }

    @Preview
    @Composable
    fun Filas_Varios() {

        Column(
            Modifier
                .size(width = 1200.dp, height = 200.dp)
        ) {
            Text(
                text = "Row: verticalAlignment",
                fontSize = 20.sp,
                modifier = Modifier.padding(5.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Yellow)
            ) {
                Row(
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Text("Alignment.Top")
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Text("Alignment.CenterVertically")
                }
                Row(
                    verticalAlignment = Alignment.Bottom,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Text("Alignment.Bottom")
                }
            }
        }
    }

    @Preview()
    @Composable
    fun Demo21() {
        Surface(
            color = Color.DarkGray,
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom
            ) {
                HorizontalColoredBar(Color.Red)
                HorizontalColoredBar(Color.Blue)
                HorizontalColoredBar(Color.Yellow)
            }
        }
    }

    @Composable
    fun HorizontalColoredBar(color: Color) {
        Surface(
            modifier = Modifier
                .width(50.dp)
                .height(100.dp),
            color = color
        ) {

        }
    }
}
