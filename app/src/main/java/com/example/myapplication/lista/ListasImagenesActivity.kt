package com.example.myapplication.lista

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.google.accompanist.coil.rememberCoilPainter

class ListasImagenesActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent{
            App()
        }
    }

    /*
    * SOURCE: https://developer.android.com/codelabs/jetpack-compose-layouts?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fcompose%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fjetpack-compose-layouts#5
    * */
    @Preview
    @Composable
    fun App() {
        MyApplicationTheme() {
            Example4()
        }
    }

    // Lista perezosa (solo carga lo que se ve)
    @Composable
    fun Example3() {
        var scrollState = rememberLazyListState()

        LazyColumn(state = scrollState) {
            items(50) {
                Text(text = "Item #$it")
            }
        }
    }

    // Lista perezosa con imagenes
    // (no funciona aun, sale error: java.lang.NoSuchMethodError java.lang.NoSuchMethodError)
    @Composable
    fun Example4() {
        var scrollState = rememberLazyListState()

        LazyColumn(state = scrollState){
            items(50){
                Example4_ImageItem(it)
            }
        }

    }

    @Composable
    fun Example4_ImageItem(index: Int) {
        Row(verticalAlignment = Alignment.CenterVertically)
        {
            Image(
                painter = rememberCoilPainter(request = "https://developer.android.com/images/brand/Android_Robot.png"),
                contentDescription = "Logo de Android",
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "Item #$index", style= MaterialTheme.typography.subtitle1)
        }
    }
}
