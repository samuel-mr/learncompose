package com.example.myapplication

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

class Alineacion2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo1()
        }
    }

    @Preview(showBackground = true, name = "Alineaciones en los diferentes extremos de la pantalla")
    @Composable
    fun Demo1() {
        Surface(
            color = Color.DarkGray,
            modifier = Modifier.fillMaxSize()
        ) {
            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.TopStart)
            ) {
                Text("TopStart")
            }
            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.TopCenter)
            ) {
                Text("TopCenter")
            }
            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.TopEnd)
            ) {
                Text("TopEnd")
            }


            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.CenterStart)
            ) {
                Text("CenterStart")
            }
            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.Center)
            ) {
                Text("Center")
            }
            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.CenterEnd)
            ) {
                Text("CenterEnd")
            }



            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.BottomStart)
            ) {
                Text("BottomStart")
            }
            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.BottomCenter)
            ) {
                Text("BottomCenter")
            }
            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.BottomEnd)
            ) {
                Text("BottomEnd")
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun FillMax_Individual() {
        val spacerModifier: Modifier = Modifier.height(4.dp)

        Column(
            modifier = Modifier
                .background(
                    Color.White
                )
                .width(200.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .size(100.dp)
            ) {
                Text(
                    text = ".fillMaxHeight",
                    modifier = Modifier
                        .background(Color.Magenta)
                        .fillMaxHeight()
                )
            }

            Spacer(modifier = spacerModifier)

            Box(
                modifier = Modifier
                    .background(Color.Blue)
                    .size(100.dp)
            ) {
                Text(
                    text = ".fillMaxWidth",
                    modifier = Modifier
                        .background(Color.Magenta)
                        .fillMaxWidth()
                )
            }

            Spacer(modifier = spacerModifier)

            Text(
                text = "30%",
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxWidth(0.3f)
            )
            Text(
                text = "50%",
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxWidth(0.5f)
            )
            Text(
                text = "70%",
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxWidth(0.7f)
            )
            Text(
                text = "100%",
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxWidth(1f)
            )

            Spacer(modifier = spacerModifier)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "33%",
                    modifier = Modifier
                        .background(Color.Cyan)
                )
                Text(
                    text = "33%",
                    modifier = Modifier
                        .background(Color.Blue)
                )
                Text(
                    text = "33%",
                    modifier = Modifier
                        .background(Color.Cyan)
                )
            }

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Then_Property() {
        Column(
            Modifier
                .size(200.dp, 200.dp)
                .background(Color.Green)
        ) {
            Button(
                modifier = Modifier
                    .wrapContentWidth()
                    .then(Modifier.align(Alignment.CenterHorizontally)),
                onClick = {}
            ) {
                Text("function then + align")
            }
            Button(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                onClick = {}
            ) {
                Text("function align")
            }
        }
    }
}
