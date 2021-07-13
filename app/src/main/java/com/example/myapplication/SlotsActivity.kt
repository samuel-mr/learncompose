package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme


class SlotsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            App()
        }
    }


    @Preview
    @Composable
    fun App() {
        MyApplicationTheme() {
            Example4()
        }
    }


    // Muestra el Body directamente
    @Composable
    fun Example1() {
        Scaffold { innerPadding ->
            Text(text = "Hi there!", modifier = Modifier.padding(innerPadding))
        }
    }

    // Extrae el body en un Composable
    @Composable
    fun Example2() {
        Scaffold { innerPadding ->
            Example2_BodyContent(Modifier.padding(innerPadding))
        }
    }

    @Composable
    fun Example2_BodyContent(modifier: Modifier = Modifier) {
        Column(modifier = modifier) {
            Text(text = "Hola")
            Text(text = "Mundo")
        }
    }

    //TopBar: y dentro solo un texto con h3 (osea, no tiene estilos Material)
    @Composable
    fun Example3() {
        Scaffold(
            topBar = {
                Text(
                    text = "Hey",
                    style = MaterialTheme.typography.h3
                )
            }
        ) { innerPadding ->
            Example3_Body(Modifier.padding(innerPadding))
        }
    }

    @Composable
    fun Example3_Body(modifier: Modifier = Modifier) {
        Column(modifier = modifier) {
            Text(text = "armónico")
            Text(text = "melódico")
        }
    }

    // TopBar: dentro con TopAppBar (q tiene los estilos de Material)
    @Composable
    fun Example4() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "Titulo")
                    },
                    actions = {
                        IconButton(onClick = {}){
                            Icon(Icons.Filled.Home, contentDescription = null)
                        }
                    }
                )
            }
        ) { innerPadding ->
            Example4_Body(Modifier.padding(innerPadding))
        }
    }

    @Composable
    fun Example4_Body(modifier: Modifier = Modifier) {
        Column(modifier = modifier) {
            Text("uno")
            Text("dos")
        }
    }


}