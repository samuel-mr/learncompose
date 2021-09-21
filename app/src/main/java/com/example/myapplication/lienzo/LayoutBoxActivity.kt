package com.example.myapplication.lienzo

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

class LayoutBoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {

        }
    }

    @Preview(showBackground = true, name = "Como se usa un Box")
    @Composable
    fun Demo() {
        Box(
            Modifier
                .size(500.dp, 200.dp)
                .background(Color.Yellow)
        ) {
            Text("Primer texto")
            Text("texto superpuesto", modifier = Modifier.padding(start = 30.dp))
            Text(
                "texto super oculto",
                modifier = Modifier
                    .padding(top = 30.dp)
                    .align(Alignment.TopCenter)
            )
            Box(
                Modifier
                    .align(Alignment.TopCenter)
                    .fillMaxHeight()
                    .width(40.dp)
                    .background(Color.Blue.copy(alpha = 0.8f))
            )
            Text("Texto en Centro de un BOX", modifier = Modifier.align(Alignment.Center))
            Box(
                Modifier
                    .align(Alignment.BottomEnd)
                    .size(50.dp, 50.dp)
                    .background(Color.Red)
            )
        }
    }

    @Preview(showBackground = true, name = "Box con varios colores superpuestos ")
    @Composable
    fun Demo2() {
        Box {
            Box(
                Modifier
                    .size(400.dp, 400.dp)
                    .background(Color.Cyan)
            )
            Box(
                Modifier
                    .matchParentSize()
                    .padding(top = 20.dp, bottom = 20.dp)
                    .background(Color.Yellow)
            )
            Box(
                Modifier
                    .matchParentSize()
                    .padding(40.dp)
                    .background(Color.Magenta)
            )
            Box(
                Modifier
                    .align(Alignment.Center)
                    .size(300.dp, 300.dp)
                    .background(Color.Green)
            )
            Box(
                Modifier
                    .align(Alignment.TopStart)
                    .size(150.dp, 150.dp)
                    .background(Color.Red)
            )
            Box(
                Modifier
                    .align(Alignment.BottomEnd)
                    .size(150.dp, 150.dp)
                    .background(Color.Blue)
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Ejemplo3(){
        Column {
            // The child with no weight will have the specified size.
            Box(Modifier.size(40.dp, 80.dp).background(Color.Magenta))
            // Has weight, the child will occupy half of the remaining height.
            Box(Modifier.width(40.dp).weight(1f).background(Color.Yellow))
            // Has weight and does not fill, the child will occupy at most half of the remaining height.
            // Therefore it will occupy 80.dp (its preferred height) if the assigned height is larger.
            Box(
                Modifier.size(40.dp, 80.dp)
                    .weight(1f, fill = false)
                    .background(Color.Green)
            )
        }
    }
}
