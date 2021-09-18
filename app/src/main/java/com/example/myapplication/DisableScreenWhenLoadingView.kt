package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Preview(showBackground = true)
@Composable
fun DisableScreenPreview() {
    MyApplicationTheme() {
        DisableScreenView()
    }
}

@Composable
fun DisableScreenView() {

    // Esta implmenetación no está pulida, lo tomé prestado de un comentario
    var showLoading by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column() { // displaycontent
            Text(
                text = "Al activarlo se mostrará una ventana sobre todo el contendo restante (después del botón) que bloqueará cualquier interacción del usuario",
                color = Color.White
            )
            Button(onClick = { showLoading = !showLoading }) {
                Text("showLoading=$showLoading")
            }
            if (showLoading) { // disable background screen interaction
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = rememberRipple(bounded = false),
                            onClick = { }
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    DisableScreenView_Content()
                }
            }
        }
    }
}

@Composable
fun DisableScreenView_Content() {
    Text("Cuerpo del App")
}
