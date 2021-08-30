package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.SimpleExpandableListAdapter
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ListasActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            Example2()
        }
    }

    @Preview
    @Composable
    fun Lista() {
        Column {
            Text("Uno")
            Text("dos")
        }
    }

    @Preview
    @Composable
    fun Lista_Modifier() {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Magenta)
        ) {
            Text("uno")
            Text("dos")
        }
    }


    // Lista
    @Composable
    fun Example1() {
        Column {
            repeat(50) {
                Text(text = "Item #$it")
            }
        }
    }

    @Preview
    @Composable
    fun Lista1_UI() {
        Column {
            Lista1(names = listOf("Juan", "Pepe", "Marco"))
        }
    }

    @Composable
    fun Lista1(names: List<String>) {
        for (name in names)
            Text("Hola $name")
    }

    @Preview
    @Composable
    fun Lista2_UI() {
        Lista2(names = listOf("Juan", "Pepe", "Marco"))
    }

    @Composable
    fun Lista2(names: List<String>) {
        Column {
            for (name in names)
                Text("Hola $name")
        }
    }

    @Preview(name = "Lista como parámetro")
    @Composable
    fun ListaValidada_UI() {
        val nameList: List<String> = listOf("Lista", "Definido", "como", "parámetro")
        ListaValidada(messages = nameList)
    }

    @Composable
    fun ListaValidada(messages: List<String>) {
        Column {
            if (messages.isEmpty()) {
                Text("vacia")
            } else {
                messages.forEach { message ->
                    Text(text = message)
                }
            }
        }
    }

    @Composable
    fun ShowUserData(name: String) {
        MaterialTheme {
            Column(
                modifier = Modifier.padding(4.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                Text(text = "-Titulos")
                Spacer(Modifier.height(16.dp))
                Text(text = "primero: $name")
                Text(text = "segundo:")
            }
        }
    }

    @Preview()
    @Composable
    fun PreviewInicial() {
        ShowUserData("mozart2")
    }

    // Lista con scroll
    @Preview
    @Composable
    fun Example2() {
        val scrollState = rememberScrollState()

        Column(
            Modifier
                .background(Color.Gray)
                .verticalScroll(scrollState)
        ) {
            repeat(50) {
                Text(text = "Item #$it")
            }
        }
    }
}