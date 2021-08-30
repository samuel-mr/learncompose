package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.tooling.preview.Preview

class BotonesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            EstadoExternoAlBoton()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun BotonesBasico() {
        Column() {

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Uno")
                Text(text = "Dos")
                Text(text = "Tres")
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Red)
            ) {
                Text("backgroundColor = Color.Red")
            }
        }
    }

    @Preview
    @Composable
    fun ButtonBarApp() {
        ButtonBar(onOk = { }, onCancel = {})
    }

    @Composable
    fun ButtonBar(
        onOk: () -> Unit,
        onCancel: () -> Unit,
        modifierOk: Modifier = Modifier,
        modifierCancel: Modifier = Modifier
    ) {
        Row() {
            Button(onOk, modifierOk) {
                Text("Ok")
            }
            Button(onCancel, modifierCancel) {
                Text("Cancelar")
            }
        }
    }

    @Preview
    @Composable
    fun BotonBasico() {
        var counter: Int by remember {
            mutableStateOf(0)
        }
        Column {
            Button(onClick = { counter++ }) {
                Text(text = "Cliked $counter times")
            }
            if (counter == 1) {
                Text(text = "has clikeado 1 vez!")
            }
        }
    }

    @Preview
    @Composable
    fun EstadoExternoAlBoton() {
        var counterState: Int by remember {
            mutableStateOf(0)
        }
        Column() {
            Button2(
                count = counterState,
                updateCount = { x ->
                    counterState = x
                }
            )
            if (counterState == 1) {
                Text(text = "has clikeado 1 vez!")
            }
        }
    }

    @Composable
    fun Button2(count: Int, updateCount: (Int) -> Unit) {
        Button(onClick = { updateCount(count + 1) }) {
            Text(text = "clicked $count times")
        }
    }
}
