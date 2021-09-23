package com.example.myapplication.formulario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

@Preview(name = "Formulario con estados", showBackground = true)
@Composable
fun App() {
    MaterialTheme() {
        App_Formulario()
    }
}

@Composable
fun App_Formulario() {

    var showDialog by remember {
        mutableStateOf(false)
    }

    var nombre by remember {
        mutableStateOf("")
    }
    var apellido by remember {
        mutableStateOf("")
    }
    var edad by remember {
        mutableStateOf(34)
    }

    Column(modifier = Modifier.background(Color.LightGray)) {
        Row {
            DisplayComposable("", modifier = Modifier.align(Alignment.CenterVertically))
            TextField(
                value = "widthIn",
                onValueChange = {  },
                modifier = Modifier.widthIn(50.dp)
            )
        }
        Row {
            DisplayComposable("Nombre:", modifier = Modifier.align(Alignment.CenterVertically))
            TextField(
                value = nombre,
                onValueChange = { nombre = it })
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            DisplayComposable("Apellido:")
            TextField(
                value = apellido,
                onValueChange = { apellido = it })
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            DisplayComposable("Edad:")
            TextField(
                value = edad.toString(),
                onValueChange = {
                    val newNumber = it.toIntOrNull()
                    if (newNumber == null)
                        edad = 0
                    else
                        edad = newNumber
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }
        Button(
            onClick = { showDialog = true },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Guardar")
        }

        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                text = {
                    Text(text = "Mensaje de dialogo")
                },
                title = { Text(text = "Titulo") },
                confirmButton = {
                    Button(onClick = {
                        showDialog = false
                    }) {
                        Text(text = "Aceptar")
                    }
                })
        }
    }
}

@Composable
fun DisplayComposable(descripcion: String, modifier: Modifier = Modifier) {
    Text(
        text = descripcion,
        textAlign = TextAlign.Right,
        modifier = modifier
            .width(120.dp)
            .padding(end = 5.dp)
    )
}

