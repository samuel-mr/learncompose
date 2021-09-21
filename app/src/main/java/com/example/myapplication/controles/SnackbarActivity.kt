package com.example.myapplication.controles

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

class SnackbarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Demo() {
        Column() {
            val snackbarVisibleState = remember { mutableStateOf(true) }

            Button(onClick = { snackbarVisibleState.value = !snackbarVisibleState.value }) {
                if (snackbarVisibleState.value) {
                    Text("Hide Snackbar")
                } else {
                    Text("Show Snackbar")
                }
            }
            if (snackbarVisibleState.value) {
                Snackbar(

                    action = {
                        Button(onClick = {}) {
                            Text("MyAction")
                        }
                    },
                    modifier = Modifier.padding(8.dp)
                ) { Text(text = "This is a snackbar!") }
            }
        }
    }
}
