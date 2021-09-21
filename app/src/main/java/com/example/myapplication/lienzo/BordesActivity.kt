package com.example.myapplication.lienzo

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.myapplication.Comentario

class BordesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {

        }
    }

    fun Modifier.tamañoParaBordes() = this
        .width(150.dp)
        .height(30.dp)

    @Preview
    @Composable
    fun DemoBordes() {
        Column(
            modifier = Modifier.background(
                Color.White
            )
        ) {
            Comentario("dimensiones: 150 x 30")

            Text(
                text = "BorderStroke 1",
                modifier = Modifier
                    .tamañoParaBordes()
                    .border(border = BorderStroke(1.dp, Color.Red))
            )
            Text(
                text = "BorderStroke 3",
                modifier = Modifier
                    .tamañoParaBordes()
                    .border(border = BorderStroke(3.dp, Color.Blue))
            )
            Text(
                text = "BorderStroke 6",
                modifier = Modifier
                    .tamañoParaBordes()
                    .border(border = BorderStroke(6.dp, Color.Red))
            )
            Box(
                modifier = Modifier
                    .tamañoParaBordes()
                    .border(
                        width = 1.dp,
                        color = Color.Green,
                        shape = RoundedCornerShape(5.dp)
                    )
            ) {
                Text("Box + border.Shape")
            }

        }
    }

}
