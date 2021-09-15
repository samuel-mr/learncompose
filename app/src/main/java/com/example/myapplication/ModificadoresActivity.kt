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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

class ModificadoresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {

        }
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

}
