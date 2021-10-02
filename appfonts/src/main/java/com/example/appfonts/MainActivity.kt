package com.example.appfonts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appfonts.ui.theme.MyApplicationTheme

import android.graphics.ColorMatrix
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    App()
                }
            }
        }
    }
}


object Destinos {
    const val home = "home"
    const val elegantes = "elegantes"
    const val remarcado = "remarcado"

    const val fuente_arima = "fuentearima"
    const val fuente_lato = "fuente_lato"
    const val fuente_opensans = "fuente_opensans"
    const val fuente_robotomono = "fuente_robotomono"

    const val desenfadado = "desenfadado"
    const val exotico = "exotico"
}

@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destinos.home) {
        composable(Destinos.home) {
            HomeView(navController = navController)
        }
        composable(Destinos.elegantes) {
            EleganteView()
        }
        composable(Destinos.remarcado) {
            RemarcadoView()
        }
        composable(Destinos.fuente_arima) {
            FuenteArimaView()
        }
        composable(Destinos.fuente_lato) {
            Fuente_Lato_View()
        }
        composable(Destinos.fuente_opensans) {
            Fuente_OpenSans_View()
        }
        composable(Destinos.fuente_robotomono) {
            Fuente_RobotoMono_View()
        }
        composable(Destinos.desenfadado) {
            DesenfadadoView()
        }
        composable(Destinos.exotico) {
            ExoticoView()
        }
    }
}

@Composable
fun HomeView(navController: NavHostController) {
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

@Composable
fun NavButton(
    navController: NavHostController,
    destinationView: String,
    body: String,
    comment: String? = null
) {
    Button(
        onClick = { navController.navigate(destinationView) },
        modifier = Modifier
            .padding(horizontal = 5.dp, vertical = 2.dp)
            .fillMaxWidth()
    ) {
        Row() {
            Text(text = body, fontSize = 12.sp, modifier = Modifier.padding(3.dp))
            Spacer(modifier = Modifier.weight(1f))
            if (comment != null) {
                Text(text = comment)
            }
        }

    }
}

@Composable
fun SuperTexto(texto: String, fuente: Int, estilo: TextStyle, modifier: Modifier = Modifier) {
    Text(
        text = texto,
        fontFamily = FontFamily(Font(fuente)),
        style = estilo.copy(color = foregroundCOlor),
        modifier = modifier
    )
}

val backgroundColor = Color.Black
val foregroundCOlor = Color.White
