package com.example.myapplication.estilos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

class Lista(lista : List<Any>){

}
val listaGradientes =  listOf(
    listOf(
        Color(0XffFBAB7E),
        Color(0XffF7CE68),
    ),
    listOf(
        Color(0XffFAD961),
        Color(0XffF76B1C),
    ),
    listOf(
        Color(0Xff4158D0),
        Color(0XffC850C0),
        Color(0XffFFCC70)
    ),
    listOf(
        Color(0XffFBDA61),
        Color(0XffFF5ACD)
    ), listOf(
        Color(0Xff00DBDE),
        Color(0XffFC00FF)
    ), listOf(
        Color(0Xff0093E9),
        Color(0Xff80D0C7)
    ), listOf(
        Color(0XffF4D03F),
        Color(0Xff16A085)
    ), listOf(
        Color(0Xff21D4FD),
        Color(0XffB721FF)
    ), listOf(
        Color(0Xff74EBD5),
        Color(0Xff9FACE6)
    ), listOf(
        Color(0XffFF3CAC),
        Color(0Xff784BA0),
        Color(0Xff2B86C5)
    )
)

@Preview(name = "Gradientes suaves")
@Composable
fun GradientesDiagonalPreview() {
    Column() {
        listaGradientes.forEach {
            FondoDiagonal(it)
        }
    }
}


@Preview(name = "Gradientes suaves")
@Composable
fun GradientesHorizontalPreview() {
    Column() {
        listaGradientes.forEach {
            FondoHorizontal(it)
        }
    }
}

@Composable
fun FondoDiagonal(lista: List<Color>) {
    Box(
        modifier = Modifier
            .size(width = 100.dp, height = 100.dp)
            .padding(1.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = lista
                )
            )
    )
}

@Composable
fun FondoDiagonal_90degrees(lista: List<Color>) {
    Box(
        modifier = Modifier
            .size(width = 100.dp, height = 100.dp)
            .padding(1.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = lista,
                    start = Offset(0f, Float.POSITIVE_INFINITY),
                    end = Offset(Float.POSITIVE_INFINITY, 0f)
                )
            )
    )
}


@Composable
fun FondoHorizontal(lista: List<Color>) {
    Box(
        modifier = Modifier
            .size(width = 100.dp, height = 100.dp)
            .background(
                brush = Brush.horizontalGradient(
                    colors = lista
                )
            )
    )
}

@Composable
fun FondoVertical(lista: List<Color>) {
    Box(
        modifier = Modifier
            .size(width = 100.dp, height = 100.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = lista
                )
            )
    )
}
