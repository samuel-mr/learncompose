package com.example.myapplication.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val lightGreen200 = Color(0x9932CD32)

/* https://developer.android.com/jetpack/compose/themes?hl=es-419 */
val Colors.lightGreen : Color
    @Composable get() = lightGreen200