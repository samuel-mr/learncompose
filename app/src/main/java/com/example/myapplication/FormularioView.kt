package com.example.myapplication.formulario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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

    val showDialog = remember {
        mutableStateOf(false)
    }

    val nombre = remember {
        mutableStateOf("")
    }
    val apellido = remember {
        mutableStateOf("")
    }
    val edad = remember {
        mutableStateOf(34)
    }

    Column(modifier = Modifier.background(Color.LightGray)) {
        Row {
            DisplayComposable("Nombre:", modifier = Modifier.align(Alignment.CenterVertically))
            TextField(
                value = nombre.value,
                onValueChange = { newText -> nombre.value = newText })
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            DisplayComposable("Apellido:")
            TextField(
                value = apellido.value,
                onValueChange = { newText -> apellido.value = newText })
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            DisplayComposable("Edad:")
            TextField(
                value = edad.value.toString(),
                onValueChange = { newText ->
                    val newNumber = newText.toIntOrNull()
                    if (newNumber != null)
                        edad.value = newNumber
                    else edad.value = 0
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }
        Button(
            onClick = { showDialog.value = true },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Guardar")
        }

        if (showDialog.value) {
            AlertDialog(
                onDismissRequest = { showDialog.value = false },
                text = {
                    Text(text = "Mensaje de dialogo")
                },
                title = { Text(text = "Titulo") },
                confirmButton = {
                    Button(onClick = {
                        showDialog.value = false
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

