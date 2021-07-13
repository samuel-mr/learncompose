package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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

class CompuestoActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent{
            Text("hola")
        }
    }

    @Preview()
    @Composable
    fun Ejemplo1() {
        Ejemplo1_Saludo("Music Classic")
    }

    @Composable
    fun Ejemplo1_Saludo(name: String) {
        Text(
            text = "Hola $name"
        )
    }

    @Preview()
    @Composable
    fun AppSaludar_Reuso() {
        InterfazSinContenido {
            Saludar(name = "mozart")
        }
    }

    @Composable
    fun InterfazSinContenido(content : @Composable () -> Unit) {
        content()
    }
    @Composable
    fun Saludar(name : String) {
        Text(
            text = "Hola $name"
        )
    }
}