package com.example.myapplication.lienzo

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultBlendMode
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Preview(showBackground = true)
@Composable
fun CustomShapePreviewX() {
    MyApplicationTheme() {
        Column() {
            Forma1()
            Forma2()
        }
    }
}

private fun Modifier.tamañoGeneral() = this
    .width(200.dp)
    .height(100.dp)
    .padding(16.dp)

@Composable
fun Forma1() {
    Canvas(Modifier.tamañoGeneral()) {
        val path = Path()
        path.moveTo(size.width, 0f)
        path.lineTo(size.width, size.height)
        path.lineTo(0f, size.height)

        drawPath(
            path = path,
            brush = SolidColor(Color.LightGray)
        )
    }
}


@Composable
fun Forma2() {
    Canvas(Modifier.tamañoGeneral()) {
        val path = Path()
        path.moveTo(0f, 0f)
        path.lineTo(0f, size.height)
        path.lineTo(size.width / 4, 5f) // Pimera punta superior
        path.lineTo(size.width / 2, size.height)
        path.lineTo(size.width / 1.5f, 5f) // Segunda punta superior
        path.lineTo(size.width, size.height)
        path.lineTo(size.width, 0f) // como último punto este cerrará hacia el inicio

        val cornerRadius: Float = 45f

        drawArc(
            color = Color.Red,
            startAngleDegrees = 90.0f,
            sweepAngleDegrees = -90.0f,
            useCenter = true,
            topLeft = Offset.Zero,
            size = 200.dp,
            alpha = 1.0f,
            style = Fill,
            colorFilter = null,
            blendMode = DefaultBlendMode
            /* rect = Rect(
             left = -cornerRadius,
             top = -cornerRadius,
             right = cornerRadius,
             bottom = cornerRadius
         ),*/
        )


        drawPath(
            path = path,
            brush = SolidColor(Color.LightGray)
        )


    }
}
