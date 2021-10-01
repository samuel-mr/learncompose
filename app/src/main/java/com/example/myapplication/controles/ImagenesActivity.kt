package com.example.myapplication.controles

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

class ImagenesActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent{
            Text("hola")
        }
    }

    @Preview
    @Composable
    fun ImagenSimple(){
        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = null // texto a mostrar para accesibilidad
        )
    }

    @Preview
    @Composable
    fun ImagenAjustado(){
        Column(
            modifier = Modifier.padding(16.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.header),
                contentDescription =  null,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth() // llena todu el ancho
                    .clip(shape = RoundedCornerShape(4.dp)),//redondear esquinas
                contentScale = ContentScale.Crop // debe llenar el ancho, pero se recordará la altura si es necesario
            )
        }
    }
}
