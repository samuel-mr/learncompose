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

class TipografiaActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent{
            MaterialTextStyle()
        }
    }

    @Preview()
    @Composable
    fun SinMaterial(){
            Column {
                Text("Estilo H1")
                Text("Estilo H2")
                Text("Estilo H3")
                Text("Estilo H4")
                Text("Estilo H5")
                Text("Estilo H6")
                Text("Estilo Subtitle1")
                Text("Estilo Subtitle2")
                Text("Estilo body1")
                Text("Estilo body2")
                Text("Texto normal sin estilos")
                Spacer(Modifier.height(6.dp))
                Text(
                    "Este es un titulo que va a sobrepasar las 2 lineas y se va a cortar lo que no se ve",
                    maxLines = 2)
                Text(
                    "Este es un titulo que va a sobrepasar las 2 lineas y se va a poner con puntos suspensivos",
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis)
            }
    }
    @Preview()
    @Composable
    fun MaterialTextStyle(){
        MaterialTheme{
            val typography = MaterialTheme.typography
            Column {
                Text("Estilo H1", style = typography.h1)
                Text("Estilo H2", style = typography.h2)
                Text("Estilo H3", style = typography.h3)
                Text("Estilo H4", style = typography.h4)
                Text("Estilo H5", style = typography.h5)
                Text("Estilo H6", style = typography.h6)
                Text("Estilo Subtitle1", style = typography.subtitle1)
                Text("Estilo Subtitle2", style = typography.subtitle2)
                Text("Estilo body1", style = typography.body1)
                Text("Estilo body2", style = typography.body2)
                Text("Texto normal sin estilos")
                Spacer(Modifier.height(6.dp))
                Text(
                    "Este es un titulo que va a sobrepasar las 2 lineas y se va a cortar lo que no se ve",
                    style = typography.h6,
                    maxLines = 2)
                Text(
                    "Este es un titulo que va a sobrepasar las 2 lineas y se va a poner con puntos suspensivos",
                    style = typography.h6,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis)
            }
        }
    }
}