package com.example.appfonts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.InvertColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun HomeView(navController: NavHostController, appTheme: MutableState<AppThemeState>) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Fuentes") }, actions = {
                IconButton(onClick = {
                    appTheme.value = appTheme.value.copy(darkTheme = !appTheme.value.darkTheme)
                }) {
                    Icon(imageVector = Icons.Default.InvertColors, contentDescription = null)
                }
            })
        },
        content = {
            HomeViewContent(navController = navController)
        })
}

@Composable
fun HomeViewContent(navController: NavHostController) {
    Column(Modifier.wrapContentSize(align = Alignment.Center)) {

        NavButton(
            navController = navController,
            destinationView = Destinos.elegantes,
            "Elegantes"
        )
        NavButton(
            navController = navController,
            destinationView = Destinos.remarcado,
            "Remacado"
        )
        NavButton(
            navController = navController,
            destinationView = Destinos.fuente_arima,
            "Fuente: Arima"
        )
        NavButton(
            navController = navController,
            destinationView = Destinos.fuente_lato,
            "Fuente: Lato"
        )
        NavButton(
            navController = navController,
            destinationView = Destinos.fuente_opensans,
            "Fuente: OpenSans"
        )
        NavButton(
            navController = navController,
            destinationView = Destinos.fuente_robotomono,
            "Fuente: Roboto Mono"
        )
        NavButton(
            navController = navController,
            destinationView = Destinos.desenfadado,
            "Desenfadado"
        )
        NavButton(
            navController = navController,
            destinationView = Destinos.exotico,
            "Exótico"
        )
    }
}
