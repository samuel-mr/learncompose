package com.example.myapplication.estados

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


@Preview(name = "2 maneras de declarar los 'Estados'")
@Composable
fun TextFieldStates() {
    val textoA = remember { mutableStateOf("I'm MutableState") }
    var textoB by remember { mutableStateOf("Using by") }

    Column {
        Text("Primera forma")
        TextField(value = textoA.value, onValueChange = { textoA.value = it })
        Text("Segunda forma")
        TextField(value = textoB, onValueChange = { textoB = it })
    }
}

@Preview(name = "Estado de Lista y InputText")
@Composable
fun Forma2() {
    val itemState = remember {
        mutableStateListOf<String>("uno", "dos")
    }
    val newNameStateContent = remember {
        mutableStateOf("...")
    }
    Forma2_Items(
        itemState,
        textFieldValue = newNameStateContent.value,
        onAddClick = {
            itemState.add("Nuevo: ${newNameStateContent.value}")
            newNameStateContent.value = ""
        },
        textOnChanged = { newText -> newNameStateContent.value = newText })
}

@Composable
fun Forma2_Items(
    items: List<String>,
    onAddClick: () -> Unit,
    textFieldValue: String,
    textOnChanged: (newName: String) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        for (item in items) {
            Text(text = item)
        }
        Row() {

            TextField(value = textFieldValue, onValueChange = textOnChanged)

            Button(onClick = onAddClick) {
                Text(text = "Agregar")
            }
        }

    }
}

@Preview(name = "Estado de Lista")
@Composable
fun Forma1() {
    val itemState = remember {
        mutableStateListOf<String>("uno", "dos")
    }
    Forma1_Items(itemState)
}

@Composable
fun Forma1_Items(items: SnapshotStateList<String>) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        for (item in items) {
            Text(text = item)
        }

        Button(onClick = { items.add("Nuevo") }) {
            Text(text = "Agregar")
        }
    }
}
