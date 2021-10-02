package com.example.myapplication.alineacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.myapplication.Comentario
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme

@Preview(showBackground = true, name = "absoluteOffset, absolutePadding")
@Composable
fun App() {
    MyApplicationTheme() {
        Column(Modifier.fillMaxWidth()) {

            Comentario(text = "absoluteOffset: mueve el contenido fuera del espacio asignado (sin importar sus límites originales)")
            Box(
                Modifier
                    .align(Alignment.CenterHorizontally)
                    .background(Color.LightGray)
            ) {
                Text(
                    "absoluteOffset x:30 y:10",
                    Modifier
                        .absoluteOffset(30.dp, 10.dp)
                )
            }
            Spacer(modifier = Modifier.height(100.dp))

            Comentario(text = "Imagen fuera del Card, para lograrlo la imagen debe estar fuera del Card, y todo dentro de un Box")
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.plato_removebg_preview),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .align(Alignment.CenterEnd)
                        .offset(30.dp, 0.dp)
                        .clip(CircleShape).zIndex(2f),
                    contentScale = ContentScale.Crop
                )
                Card(
                    shape = RoundedCornerShape(10.dp),
                    backgroundColor = Color.Green,
                    border = BorderStroke(1.dp, color = Color.Red),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(90.dp)
                        .zIndex(1f)
                ) {
                     Text(text = "Algun contenido")
                }
            }

            Spacer(modifier = Modifier.height(100.dp))
            Comentario(text = "Ejemplo dinámico de como se mueve fuere de los límites")

            var offset by remember { mutableStateOf(0) }

            Text(
                "Clic aqui para mover 'Offset'",
                Modifier
                    .background(Color.LightGray)
                    .clickable { offset += 11 }
                    .absoluteOffset { IntOffset(offset, offset) }
            )
            Spacer(modifier = Modifier.height(50.dp))

            Box(Modifier.background(color = Color.Gray)) {
                Box(
                    Modifier
                        .absolutePadding(left = 40.dp, top = 30.dp, right = 20.dp, bottom = 10.dp)
                        .size(50.dp)
                        .background(Color.Blue)
                )
            }
            Spacer(modifier = Modifier.height(50.dp))

            Box(Modifier.background(color = Color.Gray)) {
                Box(
                    Modifier
                        .padding(40.dp, 30.dp, 20.dp, 10.dp)
                        .size(50.dp)
                        .background(Color.Blue)
                )
            }
        }
    }
}

