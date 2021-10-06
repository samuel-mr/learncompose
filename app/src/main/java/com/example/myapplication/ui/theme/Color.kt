package com.example.myapplication.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)


/*Todos estos colores se pueden usar directamente*/
val color_variableGlobal = Color(0x9932CD32)



/* Pero para usarlo con MaterialTheme.colors... hay que declararlos así: */
/* https://developer.android.com/jetpack/compose/themes?hl=es-419 */

val superColor_ColorEnSI = Color(0x997A0E6C)
val Colors.MISUPERCOLOR : Color
    @Composable get() = superColor_ColorEnSI
