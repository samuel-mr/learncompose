package com.example.appfonts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.InvertColors
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appfonts.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val appTheme = remember { mutableStateOf(AppThemeState()) }
            BaseView(appThemeState = appTheme.value) {
                App(appTheme)
            }
        }
    }
}

@Composable
fun BaseView(
    appThemeState: AppThemeState,
    content: @Composable () -> Unit
) {
//    val color = when (appThemeState.pallet) {
//        ColorPallet.PURPLE -> Purple700
//        ColorPallet.GREEN -> green700
//        ColorPallet.ORANGE -> orange700
//        ColorPallet.BLUE -> blue700
//    }
    EstilosTheme(darkTheme = appThemeState.darkTheme) {
        content()
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
fun App(appTheme: MutableState<AppThemeState>) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destinos.home) {
        composable(Destinos.home) {
            HomeView(navController = navController, appTheme)
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
            Text(text = body, fontSize = 18.sp, modifier = Modifier.padding(3.dp))
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
        style = estilo,
        modifier = modifier
    )
}

enum class ColorPallet {
    PURPLE, GREEN, ORANGE, BLUE
}
