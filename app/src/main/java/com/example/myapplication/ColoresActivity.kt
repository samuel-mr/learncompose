package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

class ColoresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
        }
    }


    @Preview()
    @Composable
    fun Colores(){
        Column{
            Surface(color = Color.Yellow){
                Text("Amarillo")
            }
            Surface(color = Color.Red){
                Text("Rojo")
            }
            Surface(color = Color.Cyan){
                Text("Cyan")
            }
        }
    }

    @Preview
    @Composable
    fun ModificadoresApp(){
        Modificadores()
    }

    @Composable
    fun Modificadores(modifier : Modifier = Modifier){
        Surface(color = Color.Red){
            Text(
                text = "Hola!",
                modifier = modifier
                    .padding(16.dp)
                    .background(color = Color.Magenta)
            )
        }
    }

}