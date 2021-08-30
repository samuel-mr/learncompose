package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.HMobiledata
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import coil.transform.CircleCropTransformation
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.lightGreen
import com.google.accompanist.coil.rememberCoilPainter
import java.lang.Appendable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme() {
                com.example.myapplication.formulario.App()
            }
        }
    }

    @Preview
    @Composable
    fun App_Preview() {
        MyApplicationTheme() {
            App()
        }
    }

    @Composable
    fun App() {

        //val navController =   rememberNavController()
        Scaffold(topBar = { App_Bar() }) {
            App_Body()
        }
    }

    @Composable
    fun App_Bar() {
        TopAppBar(title = { Text(text = "Messaging Application Users") },
            actions = {
                IconButton(onClick = { }) {
                    Icon(Icons.Filled.Home, contentDescription = "Hey")
                }
                IconButton(onClick = { }) {
                    Icon(Icons.Filled.HMobiledata, contentDescription = "Hey")
                }
            })
    }

    data class EscalaMusical constructor(
        val nombre: String,
        val descripcion: String,
        val imageId: Int,
        val isActive: Boolean
    )

    @Composable
    fun App_Body() {
        val lista: List<EscalaMusical> = listOf(
            EscalaMusical("Escala Mayor", "Mayormente usada", R.drawable.profile_dog, true),
            EscalaMusical("Escala Menor", "Da un ambiente tenue", R.drawable.profile_hacker, false),
            EscalaMusical("Escala Mayor", "Mayormente usada", R.drawable.profile_dog, false),
            EscalaMusical("Escala Menor", "Da un ambiente tenue", R.drawable.profile_hacker, false),
            EscalaMusical("Escala Mayor", "Mayormente usada", R.drawable.profile_dog, false),
            EscalaMusical("Escala Menor", "Da un ambiente tenue", R.drawable.profile_hacker, false),
            EscalaMusical("Escala Mayor", "Mayormente usada", R.drawable.profile_dog, true),
            EscalaMusical("Escala Menor", "Da un ambiente tenue", R.drawable.profile_hacker, false),
            EscalaMusical("Escala Mayor", "Mayormente usada", R.drawable.profile_dog, false),
            EscalaMusical("Escala Menor", "Da un ambiente tenue", R.drawable.profile_hacker, false),
            EscalaMusical("Escala Mayor", "Mayormente usada", R.drawable.profile_dog, false),
            EscalaMusical("Escala Menor", "Da un ambiente tenue", R.drawable.profile_hacker, false),
        )

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.LightGray
        ) {
            LazyColumn(
                modifier = Modifier.padding(
                    horizontal = 20.dp,
                    vertical = 5.dp
                )
            ) {
                items(lista) { escala ->
                    Tarjeta(escala = (escala))
                }
            }
        }
    }

    @Composable
    fun Tarjeta(escala: EscalaMusical) {
        Card(
            backgroundColor = Color.White,
            shape = CutCornerShape(topEnd = 15.dp),
            elevation = 10.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .height(90.dp)
            ) {
                ProfilePicture(escala.imageId, escala.isActive)
                ProfileContent(escala.nombre, escala.descripcion, escala.isActive)
            }
        }
    }

    @Composable
    fun ProfilePicture(foto: Int, isActive: Boolean) {
        Surface(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .size(75.dp),
            color = Color.DarkGray,
            shape = CircleShape,
            border = BorderStroke(
                width = 2.dp,
                color = if (isActive) MaterialTheme.colors.lightGreen else Color.Red
            )
        ) {
            Image(
                // painter = rememberCoilPainter(request = "https://picsum.photos/300/300"),
                painter = rememberCoilPainter(request = foto,
                    requestBuilder = {
                        transformations(CircleCropTransformation())
                    }),
                contentDescription = "hoooo",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(70.dp)
            )
        }
    }

    @Composable
    fun ProfileContent(titulo: String, descripcion: String, isActive: Boolean) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(start = 10.dp)
        ) {
            Text(
                text = titulo,
                style = MaterialTheme.typography.h5,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = descripcion, style = MaterialTheme.typography.caption,
                color = Color(0xFF8E8787)
            )
        }
    }
}
 
