package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.google.android.material.chip.Chip

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }

    @Preview
    @Composable
    fun EjemploApp(){
        Ejemplo1() {
            Text("holas")
        }
    }
    @Composable
    fun Ejemplo1(
        modifier: Modifier = Modifier,
        rows: Int = 3,
        content: @Composable () -> Unit
    ) {
        content()
    }



    class FancyModifier(val level: Float) : Modifier.Element

    fun Modifier.fancy(level: Float) = this.then(FancyModifier(level))


    @Preview
    @Composable
    fun Textos() {
        Text(
            text = "Hola!",
            style = TextStyle(color = Color.White),
            modifier = Modifier.fancy(10f)
        )
    }


/*
* https://joebirch.co/android/exploring-jetpack-compose-modifiers/
* https://developer.android.com/codelabs/jetpack-compose-layouts?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fcompose%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fjetpack-compose-layouts#6
*
* */

    @Composable
    fun App() {
        Column(
            modifier = Modifier
                .background(color = Color(0XFFF2F2F2))
                .fillMaxSize() //completa todo el espacio restante (para q el color ocupe todo el resto)
        ) {
            val image: Painter = painterResource(
                id = R.drawable.happy_meal_small
            )
            Image(
                painter = image, contentDescription = "",
                modifier = Modifier.height(300.dp),
                contentScale = ContentScale.Crop
            )
            Column() {
                Text(
                    text = "Ceviche y chicha",
                    fontSize = 30.sp,
                    style = TextStyle(
                        color = Color.Red
                    )
                )
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Text(text = "320 calorías")
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Text(
                    text = "$5.99",
                    fontSize = 15.sp,
                    style = TextStyle(
                        color = Color.Blue
                    )
                )
            }

        }
    }

    @Composable
    fun Example() {

    }/*

    fun Espacio(all: Dp = 0.dp) : LayoutModifier{

    }
*/


}
