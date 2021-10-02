package com.example.appfonts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, name = "Desenfadado")
@Composable
fun DesenfadadoView() {
    val estilo = TextStyle(fontSize = 24.sp)
    val mensaje = "Este es un Mensaje para La Gente"
    Column(
        Modifier
            .fillMaxWidth()
            .background(backgroundColor)
    ) {
        SuperTexto(mensaje, R.font.rock_salt, estilo)
    }
}

@Preview(showBackground = true, name = "Exóticos")
@Composable
fun ExoticoView() {
    val estilo = TextStyle(fontSize = 24.sp)
    val mensaje = "Estos son Los Cuentos Del más Allá"

    Column(
        Modifier
            .fillMaxWidth()
            .background(backgroundColor)
    ) {
        SuperTexto(mensaje, R.font.mystery_quest, estilo)
        SuperTexto(mensaje, R.font.sirin_stencil, estilo)
        SuperTexto(mensaje, R.font.sriracha, estilo)
        SuperTexto(mensaje, R.font.lancelot, estilo)
        SuperTexto(mensaje, R.font.glass_antiqua, estilo)
        SuperTexto(mensaje, R.font.caesar_dressing, estilo)
        SuperTexto(mensaje, R.font.modern_antiqua, estilo)
        SuperTexto(mensaje, R.font.risque, estilo)
        SuperTexto(mensaje, R.font.nova_cut, estilo)
        SuperTexto(mensaje, R.font.nova_slim, estilo)
        SuperTexto(mensaje, R.font.irish_grover, estilo)
        SuperTexto(mensaje, R.font.bigelow_rules, estilo)
        SuperTexto(mensaje, R.font.macondo_swash_caps, estilo)
    }
}
