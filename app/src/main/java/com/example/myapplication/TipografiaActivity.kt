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
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.style.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TipografiaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            Demo1()
        }
    }

    @Composable
    fun ___Titulo___(titulo: String) {
        Text(
            text = titulo,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 3.dp)
                .background(Color.LightGray)

        )
    }

    @Preview(name = "fontWeight", showBackground = true)
    @Composable
    fun Demo5() {
        Column() {
            ___Titulo___("fontWeight")
            Text("fontWeight = FontWeight.Normal", fontWeight = FontWeight.Normal)
            Text("fontWeight = FontWeight.Light", fontWeight = FontWeight.Light)
            Text("fontWeight = FontWeight.SemiBold", fontWeight = FontWeight.SemiBold)
            Text("fontWeight = FontWeight.Black", fontWeight = FontWeight.Black)
            Text("fontWeight = FontWeight.Bold", fontWeight = FontWeight.Bold)
            Text("fontWeight = FontWeight.ExtraBold", fontWeight = FontWeight.ExtraBold)
            Text("fontWeight = FontWeight.ExtraLight", fontWeight = FontWeight.ExtraLight)
            Text("fontWeight = FontWeight.Medium", fontWeight = FontWeight.Medium)
            Text("fontWeight = FontWeight.Thin", fontWeight = FontWeight.Thin)
            Text("fontWeight = FontWeight.W100", fontWeight = FontWeight.W100)
            Text("fontWeight = FontWeight.W200", fontWeight = FontWeight.W200)
            Text("fontWeight = FontWeight.W300", fontWeight = FontWeight.W300)
            Text("fontWeight = FontWeight.W400", fontWeight = FontWeight.W400)
            Text("fontWeight = FontWeight.W500", fontWeight = FontWeight.W500)
            Text("fontWeight = FontWeight.W600", fontWeight = FontWeight.W600)
            Text("fontWeight = FontWeight.W700", fontWeight = FontWeight.W700)
            Text("fontWeight = FontWeight.W800", fontWeight = FontWeight.W800)
            Text("fontWeight = FontWeight.W900", fontWeight = FontWeight.W900)
        }
    }

    @Preview(name = "Fuentes básicas varias", showBackground = true)
    @Composable
    fun Demo1() {


        Column(modifier = Modifier.width(300.dp)) {
            ___Titulo___("Color")
            Text("color = Color.Blue", color = Color.Blue)
            Text("style = TextStyle(color = Color.Red)", style = TextStyle(color = Color.Red))

            ___Titulo___("fontSize")

            Text("fontSize = 5.sp", fontSize = 5.sp)
            Text("fontSize = 10.sp", fontSize = 10.sp)
            Text("fontSize = 15.sp", fontSize = 15.sp)
            Text("fontSize = 20.sp", fontSize = 20.sp)
            Text("fontSize = 25.sp", fontSize = 25.sp)

            ___Titulo___("FontStyle")

            Text("fontStyle = FontStyle.Normal",fontStyle = FontStyle.Normal)
            Text("fontStyle = FontStyle.Italic", fontStyle = FontStyle.Italic)

            ___Titulo___("textDecoration")
            Text(
                "style = TextStyle(textDecoration = TextDecoration.LineThrough)",
                style = TextStyle(textDecoration = TextDecoration.LineThrough)
            )
            Text(
                "style = TextStyle(textDecoration = TextDecoration.Underline)",
                style = TextStyle(textDecoration = TextDecoration.Underline)
            )

            ___Titulo___("textAlign")

            Text(
                "textAlign = TextAlign.Left", textAlign = TextAlign.Left,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                "textAlign = TextAlign.Center", textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                "textAlign = TextAlign.Right", textAlign = TextAlign.Right,
                modifier = Modifier.fillMaxWidth()
            )

            ___Titulo___("fontFamily")

            Text(
                "style = TextStyle(fontFamily = FontFamily.Cursive",
                style = TextStyle(fontFamily = FontFamily.Cursive)
            )
            Text("fontFamily = FontFamily.Cursive", fontFamily = FontFamily.Cursive)
            Text("fontFamily = FontFamily.Serif", fontFamily = FontFamily.Serif)
            Text("fontFamily = FontFamily.SansSerif", fontFamily = FontFamily.SansSerif)
            Text("fontFamily = FontFamily.Monospace", fontFamily = FontFamily.Monospace)

            ___Titulo___("Multiline")

            Text(
                "Este es un titulo que va a sobrepasar las 2 lineas y se va a poner con puntos suspensivos si tiene TextOverflow.Ellipsis",
                maxLines = 2
            )
            Text(
                "Este es un titulo que va a sobrepasar las 2 lineas y se va a poner con puntos suspensivos si tiene TextOverflow.Ellipsis",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }

    @Preview(name = "Material Typography", showBackground = true)
    @Composable
    fun Demo2() {
        MaterialTheme {
            val typography = MaterialTheme.typography
            Column {
                Text("typography.", style = typography.h3, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(6.dp))
                Text(".h1", style = typography.h1)
                Text(".h2", style = typography.h2)
                Text(".h3", style = typography.h3)
                Text(".h4", style = typography.h4)
                Text(".h5", style = typography.h5)
                Text(".h6", style = typography.h6)
                Spacer(Modifier.size(6.dp))
                Text("typography.subtitle1", style = typography.subtitle1)
                Text("typography.subtitle2", style = typography.subtitle2)
                Text("typography.body1", style = typography.body1)
                Text("typography.body2", style = typography.body2)
                Spacer(Modifier.size(6.dp))
                Text("Texto normal sin estilos")
                Spacer(Modifier.size(6.dp))
                Text(
                    "Este es un titulo que va a sobrepasar las 2 lineas y se va a cortar lo que no se ve",
                    style = typography.h6,
                    maxLines = 2
                )
                Text(
                    "Este es un titulo que va a sobrepasar las 2 lineas y se va a poner con puntos suspensivos",
                    style = typography.h6,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }

    @Preview(name = "Estilo en texto", showBackground = true)
    @Composable
    fun Demo3() {
        Text(buildAnnotatedString {
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Blue)) {
                append("H")
            }
            append("ola")

            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                append("M")
            }
            append("undo")
        })
    }

    @Preview(name = "Estilo a nivel de Párrafo", showBackground = true)
    @Composable
    fun Demo4() {
        Text(buildAnnotatedString {
            withStyle(style = ParagraphStyle(lineHeight = 25.sp)) {
                withStyle(style = SpanStyle(color = Color.Blue)) {
                    append("Hola\n")
                }
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                    append("Mundo\n")
                }
                append("Mundial")
            }
        })
    }
}
