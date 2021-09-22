package com.example.myapplication.controles

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.Comentario

class BotonesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            EstadoExternoAlBoton()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun BotonesBasico() {
        Column() {
            Comentario("Normal")
            Row() {
                Button(onClick = { /*TODO*/ }) {
                    Text("Normal")
                }
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text("OutlinedButton")
                }
                TextButton(onClick = { /*TODO*/ }) {
                    Text("Text Button")
                }
            }
            Comentario("Normal (disabled)")
            Row() {
                Button(onClick = { /*TODO*/ }, enabled = false) {
                    Text("Normal")
                }
                OutlinedButton(onClick = { /*TODO*/ }, enabled = false) {
                    Text("OutlinedButton")
                }
                TextButton(onClick = { /*TODO*/ }, enabled = false) {
                    Text("Text Button")
                }
            }

            Comentario("override local Theme")

            MaterialTheme(
                //override the shape
                shapes = MaterialTheme.shapes.copy(small = CutCornerShape(8.dp)),
                //Override the typography.button using the merge method
                typography = MaterialTheme.typography.copy(
                    button = MaterialTheme.typography.button.merge(TextStyle(fontSize = 12.sp))
                ),
                //override the colors define in the material theme
                colors = MaterialTheme.colors.copy(
                    // para Boton normal
                    primary = Color.Green,
                    onPrimary = Color.LightGray,

                    //para OutlinedButton
                    surface = Color.DarkGray,
                    onSurface = Color.LightGray
                )
            ) {
                Row() {
                    Button(onClick = { }) {
                        Text("Normal")
                    }
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text("OutlinedButton")
                    }
                    TextButton(onClick = { }) {
                        Text("Text Button")
                    }
                }
            }

            // colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray)


            Comentario("Button + Iconos")
            Row {
                Button(onClick = { /* Do something! */ }) {
                    Icon(
                        Icons.Filled.Favorite,
                        contentDescription = null,
                        modifier = Modifier.size(ButtonDefaults.IconSize)
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text("Button + Icon")
                }
                IconButton(onClick = { }) {
                    Icon(Icons.Filled.Search, "")
                }
                IconButton(onClick = { }) {
                    Icon(Icons.Filled.Search, "", tint = Color.Green)
                }
            }

            Comentario("ButtonDefaults: para personalizar colores, etc")
            Row() {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Black,
                        contentColor = Color.LightGray
                    )
                ) {
                    Icon(Icons.Default.MailOutline, contentDescription = null)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFF274A00),
                        contentColor = Color(0xFF17E68D)
                    )
                ) {
                    Icon(Icons.Default.MailOutline, contentDescription = null)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFF274A00),
                        contentColor = Color(0xFF17E68D)
                    )
                ) {
                    Icon(Icons.Default.MailOutline, contentDescription = null)
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text("Send")
                }
            }
            Comentario("contentColorFor: obtiene color complementario, solo funciona para los MaterialTheme")
            Row() {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.background,
                        contentColor = contentColorFor(MaterialTheme.colors.background)
                    )
                ) {
                    Icon(Icons.Default.MailOutline, contentDescription = null)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.secondary,
                        contentColor = contentColorFor(MaterialTheme.colors.secondary)
                    )
                ) {
                    Icon(Icons.Default.MailOutline, contentDescription = null)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.error,
                        contentColor = contentColorFor(MaterialTheme.colors.error)
                    )
                ) {
                    Icon(Icons.Default.MailOutline, contentDescription = null)
                }
            }
            Comentario("LocalContentColor: pendiente averiguar como aplicarlo")

            Comentario("BottomNavigation (color contenido auto-adaptable")
            val spotifyNavItemState = remember { mutableStateOf("HOME") }
            BottomNavigation(backgroundColor = MaterialTheme.colors.secondaryVariant) {
                BottomNavigationItem(
                    icon = { Icon(imageVector = Icons.Outlined.Home, contentDescription = null) },
                    selected = spotifyNavItemState.value == "HOME",
                    onClick = { spotifyNavItemState.value = "HOME" },
                    label = { Text(text = "Hola") },
                )
            }
            BottomNavigation() {
                BottomNavigationItem(
                    icon = { Icon(imageVector = Icons.Outlined.Home, contentDescription = null) },
                    selected = spotifyNavItemState.value == "HOME",
                    onClick = { spotifyNavItemState.value = "HOME" },
                    label = { Text(text = "Hola") },
                )
            }

        }
    }

    @Preview
    @Composable
    fun ButtonBarApp() {
        ButtonBar(onOk = { }, onCancel = {})
    }

    @Composable
    fun ButtonBar(
        onOk: () -> Unit,
        onCancel: () -> Unit,
        modifierOk: Modifier = Modifier,
        modifierCancel: Modifier = Modifier
    ) {
        Row() {
            Button(onOk, modifierOk) {
                Text("Ok")
            }
            Button(onCancel, modifierCancel) {
                Text("Cancelar")
            }
        }
    }

    @Preview
    @Composable
    fun BotonBasico() {
        var counter: Int by remember {
            mutableStateOf(0)
        }
        Column {
            Button(onClick = { counter++ }) {
                Text(text = "Cliked $counter times")
            }
            if (counter == 1) {
                Text(text = "has clikeado 1 vez!")
            }
        }
    }

    @Preview
    @Composable
    fun EstadoExternoAlBoton() {
        var counterState: Int by remember {
            mutableStateOf(0)
        }
        Column() {
            Button2(
                count = counterState,
                updateCount = { x ->
                    counterState = x
                }
            )
            if (counterState == 1) {
                Text(text = "has clikeado 1 vez!")
            }
        }
    }

    @Composable
    fun Button2(count: Int, updateCount: (Int) -> Unit) {
        Button(onClick = { updateCount(count + 1) }) {
            Text(text = "clicked $count times")
        }
    }
}
