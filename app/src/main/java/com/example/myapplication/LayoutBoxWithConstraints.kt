package com.example.myapplication.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview()
@Composable
fun Demo1() {
    BoxWithConstraints {
        val rectangleHeight = 100.dp
        if (maxHeight < rectangleHeight * 2) {
            Box(
                Modifier
                    .size(50.dp, rectangleHeight)
                    .background(Color.Blue)
            )
        } else {
            Column {
                Box(
                    Modifier
                        .size(50.dp, rectangleHeight)
                        .background(Color.Blue)
                )
                Box(
                    Modifier
                        .size(50.dp, rectangleHeight)
                        .background(Color.Gray)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoxWithConstraintsDemo() {
    Column(modifier = Modifier.height(404.dp)) {
        Column(modifier = Modifier.background(Color.Green)) {
            MyBoxWithConstraintsDemo()
        }

        Text("Here we set the size to 200.dp", modifier = Modifier.padding(top = 20.dp))
        Column(
            modifier = Modifier
                .background(Color.Green)
                .size(width = 200.dp, height = 200.dp)
        ) {
            MyBoxWithConstraintsDemo()
        }
    }
}

@Composable
private fun MyBoxWithConstraintsDemo() {
    BoxWithConstraints {
        //You can use this scope to get the minWidth, maxWidth, minHeight, maxHeight in dp and constraints
        val boxWithConstraintsScope = this

        val screenWidth = with(LocalDensity.current) {
            constraints.maxWidth.toDp()
        }
        val screenHeight = with(LocalDensity.current){
            constraints.maxHeight.toDp()
        }

        Column {
            if (boxWithConstraintsScope.maxHeight >= 255.dp) {
                Text(
                    "This is only visible when the maxHeight is >= 255.dp",
                    style = TextStyle(fontSize = 20.sp)
                )
            }
            Text("minHeight: ${boxWithConstraintsScope.minHeight}")
            Text("maxHeight: ${boxWithConstraintsScope.maxHeight}, ${screenHeight.value}")
            Text("minWidth: ${boxWithConstraintsScope.minWidth}")
            Text("maxWidth: ${boxWithConstraintsScope.maxWidth}, ${screenWidth.value}")
        }
    }
}
