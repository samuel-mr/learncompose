package com.example.myapplication

import android.os.Bundle
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Colores()
        }
    }
    @Composable
    fun Lista() {
        Column {
            Text("Uno")
            Text("dos")
            Text("tres")
        }
    }

    @Composable
    fun Lista_Modifier() {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text("uno")
            Text("dos")
            Text("tres")
        }
    }

    @Composable
    fun Lista_parametros(messages: List<String>) {
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
    fun ImagenSimple(){
        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = null // texto a mostrar para accesibilidad
        )
    }

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

    @Composable
    fun PreviewInicial() {
        ShowUserData("mozart2")
    }

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

    @Composable
    fun ListaSuperSimple_UI(){
        Column{
            ListaSuperSimple(names =  listOf("Juan", "Pepe", "Marco"))
        }
    }

    @Composable
    fun ListaSuperSimple(names : List<String>){
            for(name in names)
                Text("Hola $name")
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

    @Composable
    fun Modificadores(mymodifier : Modifier = Modifier){
        Surface(color = Color.Red){
            Text(
                text = "Hola!",
                modifier = mymodifier
                    .padding(16.dp)
                    .background(color = Color.Magenta)
            )
        }
    }

    @Preview()
    @Composable
    fun AppSaludar_A() {
        Saludar("classic")
    }

    @Composable
    fun Saludar(name : String) {
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

}
