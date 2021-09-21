package com.example.myapplication.formulario

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme


@Preview
@Composable
fun Example2_Preview() {
    MyApplicationTheme() {
        Example2()
    }
}
@Preview
@Composable
fun Example3_Preview() {
    MyApplicationTheme() {
        Example3()
    }
}
@Preview
@Composable
fun Example4_Preview() {
    MyApplicationTheme() {
        Example4()
    }
}


// Muestra el Body directamente
@Composable
fun Example1() {
    Scaffold { innerPadding ->
        Text(text = "Body", modifier = Modifier.padding(innerPadding))
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
    Text(text = "Body in Composable", modifier = modifier)
}

//TopBar: y dentro solo un texto con h3 (osea, no tiene estilos Material)
@Composable
fun Example3() {
    Scaffold(
        topBar = {
            Text(
                text = "in topBar",
                style = MaterialTheme.typography.h3
            )
        }
    ) { innerPadding ->
        Example3_Body(Modifier.padding(innerPadding))
    }
}

@Composable
fun Example3_Body(modifier: Modifier = Modifier) {
    Text(text = "Body in Composable", modifier = modifier)
}

// TopBar: dentro con TopAppBar (q tiene los estilos de Material)
@Composable
fun Example4() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "topBar = TopAppBar")
                },
                actions = {
                    IconButton(onClick = {}) {
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
    Text(text = "Body in Composable", modifier = modifier)
}
