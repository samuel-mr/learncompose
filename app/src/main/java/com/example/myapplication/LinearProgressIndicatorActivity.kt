package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

class LinearProgressIndicatorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Demo1(){
        var progress by remember { mutableStateOf(0.1f) }
        val animatedProgress = animateFloatAsState(
            targetValue = progress,
            animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
        ).value

        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Spacer(Modifier.height(30.dp))
            Text("Infinito")
            LinearProgressIndicator()

            Spacer(Modifier.height(30.dp))
            Text("Hacer clic para aumentar o disminuir")
            LinearProgressIndicator(progress = animatedProgress)
            Spacer(Modifier.height(30.dp))
            OutlinedButton(
                onClick = {
                    if (progress < 1f) progress += 0.1f
                }
            ) {
                Text("Increase")
            }

            OutlinedButton(
                onClick = {
                    if (progress > 0f) progress -= 0.1f
                }
            ) {
                Text("Decrease")
            }
        }
    }
}