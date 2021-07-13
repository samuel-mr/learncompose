package com.example.myapplication

import android.os.Bundle
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
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.*
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }

    @Preview
    @Composable
    fun App() {
        MyApplicationTheme() {
            Scaffold { innerPadding ->
                Example3()
            }
        }
    }

    // Lista
    @Composable
    fun Example1() {
        Column {
            repeat(50) {
                Text(text = "Item #$it")
            }
        }
    }

    // Lista con scroll
    @Composable
    fun Example2() {
        val scrollState = rememberScrollState()

        Column(Modifier.verticalScroll(scrollState)) {
            repeat(50) {
                Text(text = "Item #$it")
            }
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

    @Composable
    fun Example4() {

    }

    @Composable
    fun Example4_ImageItem(index : Int) {
        Row(verticalAlignment = Alignment.CenterVertically)
        {

        }

    }


}
