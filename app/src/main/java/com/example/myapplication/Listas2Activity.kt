package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.SimpleExpandableListAdapter
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Listas2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            App()
        }
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
}

@Preview(showBackground = true)
@Composable
fun Seleccionable() {

    val option1 = Color.Red
    val option2 = Color.Blue

    var selectedOption by remember { mutableStateOf(option1) }

    Column {
        Text("Selected: $selectedOption")
        Row {
            listOf(option1, option2).forEach { color ->
                val selected = selectedOption == color
                Box(
                    Modifier
                        .size(100.dp)
                        .background(color = color)
                        .border(
                            1.dp,
                            color = if (selected) Color.Red else Color.White,
                            shape = RectangleShape
                        )
                        .selectable(
                            selected = selected,
                            onClick = { selectedOption = color }
                        )
                )
            }
        }
    }
}
