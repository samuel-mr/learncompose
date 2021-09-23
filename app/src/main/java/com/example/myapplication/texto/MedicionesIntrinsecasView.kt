package com.example.myapplication.texto


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.Comentario
import com.example.myapplication.ui.theme.MyApplicationTheme

@Preview(showBackground = true)
@Composable
fun Texto_MedicionesIntrinsecasPreview() {
    MyApplicationTheme {
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Comentario(text = "Ejemplo de mediciones intrínsecas.", comentario = "IntrinsicSize")
            Comentario(text = "Caso de uso: Se busca que la  linea del medio tenga una altura dinámica, igual al alto de los textos a su lado")

            Text_IntrinsicSize(
                textoInicial = "Una linea",
                textoFinal = "Otra linea"
            )
            Text_IntrinsicSize(
                textoInicial = "Texto con salto\n de linea",
                textoFinal = "Texto sin salto"
            )
            Text_IntrinsicSize(
                textoInicial = "Este es un texto que tiene más de una línea donde se ve que el tamaño de la linea central también es igual al tamaño del texto.",
                textoFinal = "Esto se logra porque el Row que los contiene calcula antes el tamaño esperado de los textos"
            )

        }
    }
}

@Composable
fun Texto_MedicionesIntrinsecasView() {

}

/**
 * 2 textos divididos por una línea donde esta última tiene una altura igual al texto
 */
@Composable
private fun Text_IntrinsicSize(textoInicial: String, textoFinal: String) {
    // El 'alto' del 'Row' será el 'minIntrinsicHeight' máxima de los 2 textos
    // al 'Divider' no lo considera porque su 'minIntrinsicHeight' es igual a 0
    Row(modifier = Modifier.height(IntrinsicSize.Min)) {
        //el minIntrinsicHeight del 'Text' será el del
        Text(
            text = textoInicial,
            modifier = Modifier
                .weight(1f)
                .wrapContentWidth(Alignment.Start)
        )
        // el minIntrinsicHeight  de este es , ya q no ocupa espacio al menos que se le apliquen modifier
        Divider(
            color = Color.Black,
            modifier = Modifier
                .width(1.dp)
                .fillMaxHeight()
        )
        Text(
            text = textoFinal, modifier = Modifier
                .weight(1f)
                .wrapContentWidth(Alignment.End)
        )
    }
}
