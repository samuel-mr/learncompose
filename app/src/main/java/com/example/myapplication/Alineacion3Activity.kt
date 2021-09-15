package com.example.myapplication.alineacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

@Preview(showBackground = true, name = "absoluteOffset, absolutePadding")
@Composable
fun App() {
    Column() {
        Text(
            "Layout offset",
            Modifier
                .size(200.dp)
                .wrapContentSize(Alignment.Center)
                .absoluteOffset(50.dp, 70.dp)
        )

        var offset by remember { mutableStateOf(0) }

        Text(
            "Clic aqui para mover 'Offset'",
            Modifier
                .background(Color.LightGray)
                .clickable { offset += 11 }
                .absoluteOffset { IntOffset(offset, offset) }
        )
        Spacer(modifier = Modifier.height(50.dp))

        Box(Modifier.background(color = Color.Gray)) {
            Box(
                Modifier
                    .absolutePadding(left = 40.dp, top = 30.dp, right = 20.dp, bottom = 10.dp)
                    .size(50.dp)
                    .background(Color.Blue)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))

        Box(Modifier.background(color = Color.Gray)) {
            Box(
                Modifier
                    .padding(40.dp, 30.dp, 20.dp, 10.dp)
                    .size(50.dp)
                    .background(Color.Blue)
            )
        }
    }
}

