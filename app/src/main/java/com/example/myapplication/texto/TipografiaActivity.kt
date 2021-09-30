package com.example.myapplication.texto

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.style.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

/**
 * Source: https://alexzh.com/jetpack-compose-styling-text/
 */
class TipografiaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            MyApplicationTheme() {
                Demo1()
            }
        }
    }

    @Composable
    fun ___Titulo___(titulo: String) {
        Text(
            text = titulo,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 3.dp)
                .background(Color.Gray)

        )
    }
    @Composable
    fun ___SubTitulo___(titulo: String) {
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
            ___SubTitulo___("fontWeight")
            Text("fontWeight = FontWeight.Thin", fontWeight = FontWeight.Thin)
            Text("fontWeight = FontWeight.ExtraLight", fontWeight = FontWeight.ExtraLight)
            Text("fontWeight = FontWeight.Light", fontWeight = FontWeight.Light)
            Text("fontWeight = FontWeight.Normal", fontWeight = FontWeight.Normal)
            Text("fontWeight = FontWeight.Medium", fontWeight = FontWeight.Medium)
            Text("fontWeight = FontWeight.SemiBold", fontWeight = FontWeight.SemiBold)
            Text("fontWeight = FontWeight.Bold", fontWeight = FontWeight.Bold)
            Text("fontWeight = FontWeight.Black", fontWeight = FontWeight.Black)
            Text("fontWeight = FontWeight.ExtraBold", fontWeight = FontWeight.ExtraBold)
            ___SubTitulo___("(explicit")
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

    @Preview(name = "letterSpacing", showBackground = true)
    @Composable
    fun Demo12() {
        val texto = "Para este subitulo yo micro"
        Column() {
            ___SubTitulo___("sin espaciado (normal)")
            Text(texto)
            ___SubTitulo___("letterSpacing em")
            Text(texto,  style = TextStyle(letterSpacing = 0.1.em))
            Text(texto,  style = TextStyle(letterSpacing = 0.2.em))
            ___SubTitulo___("letterSpacing sp")
            Text(texto,  style = TextStyle(letterSpacing = 0.5.sp))
            Text(texto,  style = TextStyle(letterSpacing = 1.sp))
            Text(texto,  style = TextStyle(letterSpacing = 2.sp))
            Text(texto,  style = TextStyle(letterSpacing = 3.sp))
            Text(texto,  style = TextStyle(letterSpacing = 5.sp))
        }
    }

    @Preview(name = "Fuentes básicas varias", showBackground = true)
    @Composable
    fun Demo1() {


        Column(modifier = Modifier.width(300.dp)) {
            ___SubTitulo___("Color")
            Text("color = Color.Blue", color = Color.Green)
            Text("style = TextStyle(color = Color.Red)", style = TextStyle(color = Color.Red))

            ___SubTitulo___("fontSize .sp")

            Text("fontSize = 5.sp", fontSize = 5.sp)
            Text("fontSize = 10.sp", fontSize = 10.sp)
            Text("fontSize = 15.sp", fontSize = 15.sp)
            Text("fontSize = 20.sp", fontSize = 20.sp)
            Text("fontSize = 25.sp", fontSize = 25.sp)

            ___SubTitulo___("FontStyle")

            Text("fontStyle = FontStyle.Normal", fontStyle = FontStyle.Normal)
            Text("fontStyle = FontStyle.Italic", fontStyle = FontStyle.Italic)

            ___SubTitulo___("textDecoration")
            Text(
                "style = TextStyle(textDecoration = TextDecoration.LineThrough)",
                style = TextStyle(textDecoration = TextDecoration.LineThrough)
            )
            Text(
                "style = TextStyle(textDecoration = TextDecoration.Underline)",
                style = TextStyle(textDecoration = TextDecoration.Underline)
            )
            Text(
                "Multiple decorations:", textDecoration = TextDecoration.combine(
                    listOf(
                        TextDecoration.Underline,
                        TextDecoration.LineThrough
                    )
                )
            )

            ___SubTitulo___("textAlign")

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

            ___SubTitulo___("fontFamily")

            Text(
                "style = TextStyle(fontFamily = FontFamily.Cursive",
                style = TextStyle(fontFamily = FontFamily.Cursive)
            )
            Text("fontFamily = FontFamily.Cursive", fontFamily = FontFamily.Cursive)
            Text("fontFamily = FontFamily.Serif", fontFamily = FontFamily.Serif)
            Text("fontFamily = FontFamily.SansSerif", fontFamily = FontFamily.SansSerif)
            Text("fontFamily = FontFamily.Monospace", fontFamily = FontFamily.Monospace)

            ___SubTitulo___("Multiline")

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

    @Preview(name = "Annotated String", showBackground = true)
    @Composable
    fun Demo3() {
        Column() {

            ___Titulo___("AnnotatedString - Una sola línea")

            ___SubTitulo___("buildAnnotatedString (forma 1)")
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

            ___SubTitulo___("buildAnnotatedString (forma 2)")
            Text(text = buildAnnotatedString {
                append(AnnotatedString("Red", spanStyle = SpanStyle(Color.Red)))
                append(AnnotatedString("Green", spanStyle = SpanStyle(Color.Green)))
                append(AnnotatedString("Blue", spanStyle = SpanStyle(Color.Blue)))
            })
            ___SubTitulo___("buildAnnotatedString (forma 3)")
            Text(
                text = AnnotatedString(text = "Red", spanStyle = SpanStyle(Color.Red)).plus(
                        AnnotatedString(text = "Green", spanStyle = SpanStyle(Color.Green)).plus(
                            AnnotatedString(text = "Blue", spanStyle = SpanStyle(Color.Blue))
                        )
                )
            )

            ___Titulo___("AnnotatedString: Como Párrafo")
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

    @Preview(name = "Styles", showBackground = true)
    @Composable
    fun Demo4() {
        val customStyle: TextStyle = TextStyle(color = Color.Green)
        Text("Hello", style = customStyle)
        Column() {
            Text("Hello", color = Color.Green, textAlign = TextAlign.Center)
            Text("Hello", style = TextStyle(color = Color.Green, textAlign = TextAlign.Center))

            Text(
                text = "Jetpack Compose",
                style = TextStyle(
                    color = Color.Green,
                    fontSize = 24.sp,
                    fontFamily = FontFamily.Monospace,
                    letterSpacing = 4.sp,
                    textAlign = TextAlign.Center,
                    shadow = Shadow(
                        color = Color.Black,
                        offset = Offset(8f, 8f),
                        blurRadius = 4f
                    ),
                    textGeometricTransform = TextGeometricTransform(
                        scaleX = 2.5f,
                        skewX = 1f
                    )
                ),
                modifier = Modifier.width(300.dp)
            )
        }
    }
}
