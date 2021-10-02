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
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, name = "Fuente: Arima")
@Composable
fun FuenteArimaView() {
    val estilo = TextStyle(fontSize = 18.sp)
    val mensaje = "Note: We review only"

    Column(
        Modifier
            .fillMaxWidth()
            .background(backgroundColor)
    ) {
        SuperTexto(mensaje, R.font.arima_madurai_light, estilo)
        SuperTexto(mensaje, R.font.arima_madurai_extralight, estilo)
        SuperTexto(mensaje, R.font.arima_madurai, estilo)
        SuperTexto(mensaje, R.font.arima_madurai_medium, estilo)
        SuperTexto(mensaje, R.font.arima_madurai_black, estilo)
        SuperTexto(mensaje, R.font.arima_madurai_bold, estilo)
        SuperTexto(mensaje, R.font.arima_madurai_extrabold, estilo)
    }
}

@Preview(showBackground = true, name = "Fuente: Lato")
@Composable
fun Fuente_Lato_View() {
    val estilo = TextStyle(fontSize = 18.sp)
    val mensaje = "Note: We review only"

    Column(
        Modifier
            .fillMaxWidth()
            .background(backgroundColor)
    ) {
        SuperTexto(mensaje, R.font.lato_light, estilo)
        SuperTexto(mensaje, R.font.lato_thin, estilo)
        SuperTexto(mensaje, R.font.lato, estilo)
        SuperTexto(mensaje, R.font.lato_black, estilo)
        SuperTexto(mensaje, R.font.lato_bold, estilo)
    }
}

@Preview(showBackground = true, name = "Fuente: Open Sans")
@Composable
fun Fuente_OpenSans_View() {
    val estilo = TextStyle(fontSize = 18.sp, letterSpacing = 2.sp)
    //val mensaje = "Note: We review only"
    val mensaje = "VEGETARIAN"

    Column(
        Modifier
            .fillMaxWidth()
            .background(backgroundColor)
    ) {
        SuperTexto(mensaje, R.font.open_sans_light, estilo)
        SuperTexto(mensaje, R.font.open_sans, estilo)
        SuperTexto(mensaje, R.font.open_sans_semibold, estilo)
        SuperTexto(mensaje, R.font.open_sans_bold, estilo)
        SuperTexto(mensaje, R.font.open_sans_extrabold, estilo)
        SuperTexto(mensaje, R.font.open_sans_condensed_light, estilo)
        SuperTexto(mensaje, R.font.open_sans_condensed_bold, estilo)
    }
}

@Preview(showBackground = true, name = "Fuente: Roboto Mono")
@Composable
fun Fuente_RobotoMono_View() {
    val estilo = TextStyle(fontSize = 18.sp)
    val mensaje = "Note: We review only"

    Column(
        Modifier
            .fillMaxWidth()
            .background(backgroundColor)
    ) {
        SuperTexto(mensaje, R.font.roboto_mono_thin, estilo)
        SuperTexto(mensaje, R.font.roboto_mono_light, estilo)
        SuperTexto(mensaje, R.font.roboto_mono, estilo)
        SuperTexto(mensaje, R.font.roboto_mono_medium, estilo)
        SuperTexto(mensaje, R.font.roboto_mono_bold, estilo)
    }
}

@Preview(showBackground = true, name = "Fuente: Nunito !")
@Composable
fun Fuente_Nunito_View() {
    val estilo = TextStyle(fontSize = 18.sp)
    val mensaje = "Note: We review only"

    Column(
        Modifier
            .fillMaxWidth()
            .background(backgroundColor)
    ) {
//        Text(mensaje, style = estilo.copy(foregroundCOlor), letterSpacing = 2)
        // Text(text = "spacing", letterSpacing = 3)
        Text(text = "spacing", style = TextStyle(letterSpacing = 2.em))
        SuperTexto(mensaje, R.font.nunito_extralight, estilo)
        SuperTexto(mensaje, R.font.nunito_light, estilo)
        SuperTexto(mensaje, R.font.nunito, estilo)
        SuperTexto(mensaje, R.font.nunito_black, estilo)
        SuperTexto(mensaje, R.font.nunito_semibold, estilo)
        SuperTexto(mensaje, R.font.nunito_bold, estilo)
        SuperTexto(mensaje, R.font.nunito_extrabold, estilo)
    }
}

