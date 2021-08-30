package com.example.myapplication

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

class BordesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {

        }
    }

    @Preview
    @Composable
    fun DemoBordes() {
        Column(
            modifier = Modifier.background(
                Color.White
            )){

            Text(
                text = "120 x 30",
                modifier = Modifier
                    .width(120.dp)
                    .height(30.dp)
            )
            Text(
                text = "120 x 30 border",
                modifier = Modifier
                    .border(border = BorderStroke(1.dp, Color.Red))
                    .width(120.dp)
                    .height(30.dp)
            )
            Text(
                text = "120 x 30 border.10",
                modifier = Modifier
                    .border(border = BorderStroke(10.dp, Color.Blue))
                    .width(120.dp)
                    .height(30.dp)
            )
            Text(
                text = "120 x 30 border.10",
                modifier = Modifier
                    .width(120.dp)
                    .height(30.dp)
                    .border(border = BorderStroke(10.dp, Color.Red))
            )
            Text(
                text = "120 x 30 size",
                modifier = Modifier
                    .border(border = BorderStroke(1.dp, Color.Blue))
                    .size(width = 120.dp, height = 30.dp)
            )
        }
    }

}