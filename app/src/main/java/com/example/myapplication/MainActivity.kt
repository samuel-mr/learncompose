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
import com.example.myapplication.ejemplos.App
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.lightGreen
import com.google.accompanist.coil.rememberCoilPainter
import java.lang.Appendable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme() {
                App()
            }
        }
    }
}

/**
 * Agrega un comentario para describir el comportamiento de algo
 */
@Composable
fun Comentario(text: String, comentario: String? = null) {
    Row() {
        Text(
            text = text,
            style = TextStyle(fontSize = 12.sp, color = Color.Gray),
            modifier = Modifier.padding(top = 5.dp, bottom = 2.dp)
        )
        if (!comentario.isNullOrEmpty()) {
            Spacer(modifier = Modifier.weight(1f))
            Text(text = comentario)
        }
    }
}
