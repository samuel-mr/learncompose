package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
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
        Text(
            text = "Muestra solo un margen izquierdo. Para esto el box tiene la propiedad boder.shape personalizada",
            modifier = Modifier.background(Color.LightGray)
        )
        Spacer(modifier = Modifier.height(10.dp))
        BoxWithMarginPersonalized()
    }

}

@Composable
private fun BoxWithMarginPersonalized() {
    Box(modifier = Modifier
        .background(Color.LightGray)
        .size(200.dp, 200.dp)
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
        Text("Solo margen izquierdo")
    }
}
