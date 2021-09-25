package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Preview(showBackground = true)
@Composable
fun CustomShapePreview() {
    MyApplicationTheme() {
        CustomShapeApp()
    }
}

/**
 * Source: https://foso.github.io/Jetpack-Compose-Playground/cookbook/how_to_create_custom_shape/
 */
@Composable
fun CustomShapeApp() {
    Column {
        Comentario(
            text = "Muestra solo un margen izquierdo. Para esto el box tiene la propiedad boder.shape personalizada",
        )
        MargenPersonalizado_Manual()

        Comentario(
            text = "Lo mismo pero extraido a una clase",
        )
        MargenPersonalizado_ClaseExtraida_ejemplo1()
        Comentario(
            text = "Custom",
        )
        MargenPersonalizado_ClaseExtraida_ejemplo2()
        MargenPersonalizado_ClaseExtraida_ejemplo3()
    }
}

@Composable
private fun MargenPersonalizado_Manual() {
    Box(modifier = Modifier
        .background(Color.LightGray)
        .size(width = 200.dp, height = 50.dp)
        .border(
            width = 16.dp,
            color = Color.Red,
            shape = object : Shape {
                override fun createOutline(
                    size: Size,
                    layoutDirection: LayoutDirection,
                    density: Density
                ): Outline {
                    return Outline.Generic(
                        // Just left border
                        Path().apply {
                            moveTo(0f, 0f)
                            lineTo(0f, size.height)
                            lineTo(16f, size.height)
                            lineTo(16f, 0f)
                            close()
                        }
                    )
                }
            }
        )
    ) {
        Text("Margen izquierdo personalziado")
    }
}

@Composable
fun MargenPersonalizado_ClaseExtraida_ejemplo1() {
    Box(
        Modifier
            .size(100.dp, 50.dp)
            .border(
                width = 16.dp,
                color = Color.Blue,
                shape = OnlyLeftColorShape()
            )
    ) {
        Text("Clase extraida")
    }
}

/**
 * Forma customizada extraida a una clase
 */
class OnlyLeftColorShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(
            // Just left border
            Path().apply {
                moveTo(0f, 0f)
                lineTo(0f, size.height)
                lineTo(16f, size.height)
                lineTo(16f, 0f)
                close()
            }
        )
    }
}


@Composable
fun MargenPersonalizado_ClaseExtraida_ejemplo2() {
    Box(Modifier.border(width = 1.dp, color = Color.Red)) {
        Box(
            Modifier
                .size(100.dp, 50.dp)
                .border(
                    width = 16.dp,
                    color = Color.Blue,
                    shape = OnlyLeftColorShape_Reducido()
                )
        ) {
            Text("Hola")
        }
    }
}

/**
 * Forma customizada extraida a una clase
 */
class OnlyLeftColorShape_Reducido : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(
            // Just left border
            Path().apply {
                moveTo(0f, 20f)
                lineTo(0f, size.height - 20f)
                lineTo(16f, size.height -20f)
                lineTo(16f, 20f)
                close()
            }
        )
    }
}

@Composable
fun MargenPersonalizado_ClaseExtraida_ejemplo3() {
    Box(
        Modifier
            .size(100.dp, 50.dp)
            .border(
                width = 16.dp,
                color = Color.Blue,
                shape = OnlyLeftColorShape_Reducido()
            )
    ) {
        Box(
            Modifier
                .border(width = 1.dp, color = Color.Red)
                .fillMaxSize()) {
            Text("Hola")
        }
    }
}
