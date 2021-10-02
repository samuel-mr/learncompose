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
import com.example.appfonts.ui.theme.MyApplicationTheme

@Composable
fun EjemploCodigoView() {
    val fuenteExplicita = FontFamily(
        Font(R.font.aclonica)
    )

    Column() {

        Text(
            text = "Fuente explícita",
            style = TextStyle(fontFamily = fuenteExplicita, fontSize = 20.sp)
        )
        Text(
            text = "typography.body1 (personalizado)",
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "typography.body2 (sin personalizar)",
            style = MaterialTheme.typography.body2
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme() {
        EjemploCodigoView()
    }
}

@Preview(showBackground = true, name = "Elegantes")
@Composable
fun EleganteView() {
    val estilo = TextStyle(fontSize = 32.sp)
    val mensaje = "La carta de la Semana Ana"

    Column(
        Modifier
            .fillMaxWidth()
            .background(backgroundColor)) {
        SuperTexto(mensaje, R.font.dancing_script, estilo)
        SuperTexto(mensaje, R.font.dancing_script_bold, estilo)
        SuperTexto(mensaje, R.font.cookie, estilo)
        SuperTexto(mensaje, R.font.great_vibes, estilo)
        SuperTexto(mensaje, R.font.parisienne, estilo)
        SuperTexto(mensaje, R.font.tangerine, estilo)
        SuperTexto(mensaje, R.font.tangerine_bold, estilo)
        SuperTexto(mensaje, R.font.italianno, estilo)
    }
}


@Preview(showBackground = true, name = "Remarcado")
@Composable
fun RemarcadoView() {
    val estilo = TextStyle(fontSize = 32.sp)
    val mensaje = "La carta de la semana"

    Column(
        Modifier
            .fillMaxWidth()
            .background(backgroundColor)) {
        SuperTexto(mensaje, R.font.shadows_into_light_two, estilo)
        SuperTexto(mensaje, R.font.kalam_light, estilo)
        SuperTexto(mensaje, R.font.kalam, estilo)
        SuperTexto(mensaje, R.font.kalam_bold, estilo)
        SuperTexto(mensaje, R.font.permanent_marker, estilo)
        SuperTexto(mensaje, R.font.amatica_sc, estilo)
        SuperTexto(mensaje, R.font.amatica_sc_bold, estilo)
        SuperTexto(mensaje, R.font.oleo_script, estilo)
        SuperTexto(mensaje, R.font.oleo_script_bold, estilo)
        SuperTexto(mensaje, R.font.oleo_script_swash_caps, estilo)
        SuperTexto(mensaje, R.font.oleo_script_swash_caps_bold, estilo)
        SuperTexto(mensaje, R.font.allan, estilo)
        SuperTexto(mensaje, R.font.allan_bold, estilo)
        SuperTexto(mensaje, R.font.contrail_one, estilo)
        SuperTexto(mensaje, R.font.oregano, estilo)
        SuperTexto(mensaje, R.font.oregano_italic, estilo)
    }
}
