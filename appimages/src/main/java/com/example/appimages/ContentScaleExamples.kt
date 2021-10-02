package com.example.appimages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appimages.ui.theme.MyApplicationTheme

@Preview(showBackground = true)
@Composable
fun Default1Preview() {
    MyApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Titulo(text = "Imagenes rectangulares sin modificaciones")
            Comentario(text = "Agregué 4 imágenes, 2 grandes, 2 pequeñas. Las imágenes que superan el ancho se autoescalan proporcionalmente al máximo ancho del dispositivo. Las imágenes pequeñas se muestran tal cual")
            Image(
                painter = painterResource(id = R.drawable.rectangular_grande_odyssey),
                contentDescription = null
            )
            Image(
                painter = painterResource(id = R.drawable.rectangular_peque_o_odyssey),
                contentDescription = null
            )
            Image(
                painter = painterResource(id = R.drawable.rectangular_grande_readdeadredemption),
                contentDescription = null
            )
            Image(
                painter = painterResource(id = R.drawable.rectangular_peque_a_readdeadredemption),
                contentDescription = null,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Default2Preview() {
    MyApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Titulo(text = "Imagenes cuadradas sin modificaciones")
            Comentario(text = "Agregué la misma imagen cuadrada en sus 2 versiones, pequeña y grande")
            Image(
                painter = painterResource(id = R.drawable.cuadrada_grande_assassin),
                contentDescription = null
            )
            Image(
                painter = painterResource(id = R.drawable.cuadrada_peque_a_assassin),
                contentDescription = null
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CropPreview() {
    MyApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Titulo(text = "contentScale: Crop")
            Comentario(
                text = "Escala la foto para que cumpla el tamaño fijado mateniendo el aspect ratio, la parte que no ingrese se recorda\n" +
                        "alignment : indica que parte se debe mostrar.\n" +
                        "Escenario: Cuando quiero que todo el espacio fijado muestre algo de la foto aunq tenga q recordarlo"
            )
            Comentario(text = "Alto y ancho fijo + alignment=TopStart (muestra lado izquierdo)")
            Image(
                painter = painterResource(id = R.drawable.rectangular_grande_odyssey),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopStart,
                modifier = Modifier
                    .height(400.dp)
                    .width(300.dp)
            )
            Comentario(text = "Alto y ancho fijo. alignment=TopEnd (muestra lado derecho)")
            Image(
                painter = painterResource(id = R.drawable.rectangular_grande_odyssey),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopEnd,
                        modifier = Modifier
                            .height(250.dp)
                            .width(300.dp)
            )
            Comentario(text = "Pueden probarse las demás variantes de alignment")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Inside1Preview() {
    MyApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Titulo(text = "contentScale: Inside (con Imagen Grande")
            Comentario(
                text = "Escala la foto para que tanto el alto y ancho ingrese dentro de los límites manteniendo el aspect ratio (escenario: cuando quiero que si o si se muestra toda la foto)" +
                        "alignment : indica la posición de la imagen."
            )
            Comentario(text = "alignment: TopStart")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular_grande_odyssey),
                    contentDescription = null,
                    contentScale = ContentScale.Inside,
                    alignment = Alignment.TopStart,
                    modifier = Modifier
                        .height(270.dp)
                        .width(300.dp)
                        .background(Color.Green)
                )
            }

            Comentario(text = "alignment: Center")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular_grande_odyssey),
                    contentDescription = null,
                    contentScale = ContentScale.Inside,
                    alignment = Alignment.Center,
                    modifier = Modifier
                        .height(270.dp)
                        .width(300.dp)
                        .background(Color.Green)
                )
            }

            Comentario(text = "alignment: BottomEnd (alto = espacio restante)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular_grande_odyssey),
                    contentDescription = null,
                    contentScale = ContentScale.Inside,
                    alignment = Alignment.BottomEnd,
                    modifier = Modifier
                        .width(300.dp)
                        .background(Color.Green)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Inside2Preview() {
    MyApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Titulo(text = "contentScale: Inside (con Imagen Pequeña)")


            Comentario(text = "alignment: BottomEnd (alto = espacio restante)")
//            Box(modifier = Modifier.padding(2.dp) .width(300.dp).background(Color.Green)) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular_grande_readdeadredemption),
                    contentDescription = null,
                    contentScale = ContentScale.Inside,
                    alignment = Alignment.BottomEnd,
                    modifier = Modifier
                        .width(300.dp)
                        .height(150.dp)
                        .background(Color.Green)
                )
//            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun FitPreview() {
    MyApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Titulo(text = "contentScale: Fit")
            Comentario(
                text = "Se comporta igual a contentScale = Inside, pero la diferencia es en como trata la imagen pequeña.\n" +
                        "Escenario: Cuando quiero que tanto imágenes pequeñas o grandes 'encajen' todo su alto y ancho dentro de un espacio, aunq podrán haber espacio sobrante"
            )
            Comentario(text = "[imagen grande] (lo achica proporcionalmente)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular_grande_odyssey),
                    contentDescription = null,
                    contentScale = ContentScale.Fit ,
                    modifier = Modifier
                        .height(270.dp)
                        .width(300.dp)
                        .background(Color.Green)
                )
            }
            Comentario(text = "[imagen pequeña] (lo agranda proporcionalmente)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular_peque_a_readdeadredemption),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .height(270.dp)
                        .width(300.dp)
                        .background(Color.Green)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun fillMaxSizePreview() {
    MyApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Titulo(text = "contentScale: FillHeight")
            Comentario(
                text = "Escala la imagen mateniendo su aspect ratio y se asegura que el alto de la imagen sea igual al alto de su contenedor."
            )
            Comentario(text = "[imagen rectangular grande] (lo achica proporcionalmente al alto)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular_grande_odyssey),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight ,
                    modifier = Modifier
                        .height(150.dp)
                        .width(350.dp)
                        .background(Color.Green)
                )
            }
            Comentario(text = "[imagen rectangular pequeña] (lo agranda proporcionalmente al alto)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular_peque_o_odyssey),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .height(150.dp)
                        .width(350.dp)
                        .background(Color.Green)
                )
            }

            Comentario(text = "[imagen cuadrada grande] (lo achica proporcionalmente al alto)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.cuadrada_grande_assassin),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight ,
                    modifier = Modifier
                        .height(150.dp)
                        .width(350.dp)
                        .background(Color.Green)
                )
            }
            Comentario(text = "[imagen cuadrada pequeña] (lo agranda proporcionalmente al alto)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.cuadrada_peque_a_assassin),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .height(150.dp)
                        .width(350.dp)
                        .background(Color.Green)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun fillWidthPreview() {
    MyApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Titulo(text = "contentScale: FillWidth")
            Comentario(
                text = "Escala la imagen mateniendo su aspect ratio y se asegura que el ancho de la imagen sea igual al ancho de su contenedor."
            )
            Comentario(text = "[imagen rectangular grande] (lo achica proporcionalmente al ancho)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular_grande_odyssey),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth ,
                    modifier = Modifier
                        .height(300.dp)
                        .width(300.dp)
                        .background(Color.Green)
                )
            }

            Comentario(text = "[imagen cuadrada grande] (lo achica proporcionalmente al ancho)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.cuadrada_grande_assassin),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth ,
                    modifier = Modifier
                        .height(350.dp)
                        .width(150.dp)
                        .background(Color.Green)
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun FillBoundsPreview() {
    MyApplicationTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            Titulo(text = "contentScale: FillBounds")
            Comentario(
                text = "Escala la imagen sin mantener su aspect ratio y obliga a llenar el alto y ancho de su contenedor.\n" +
                        "Escenario: no se cuando michi sea util esto, supongo q para imagenes tipo patrones de fondo"
            )
            Comentario(text = "[imagen rectangular] (distorsinado)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.rectangular_grande_odyssey),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds ,
                    modifier = Modifier
                        .height(300.dp)
                        .width(300.dp)
                        .background(Color.Green)
                )
            }

            Comentario(text = "[imagen cuadrada] (distorsinado)")
            Box(modifier = Modifier.padding(2.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.cuadrada_grande_assassin),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds ,
                    modifier = Modifier
                        .height(350.dp)
                        .width(150.dp)
                        .background(Color.Green)
                )
            }

        }
    }
}
