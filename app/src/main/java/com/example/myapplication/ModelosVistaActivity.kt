package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Appendable

class ModelosVistaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }

    @Composable
    fun App(viewModel: MainViewModel = MainViewModel()) {
        val textoState = viewModel.textFieldState.observeAsState("")
        AppItem(
            texto = textoState.value,
            onTextChanged = { newText -> viewModel.onTextChanged(newText) })
    }

    @Composable
    fun AppItem(texto: String, onTextChanged: (newString: String) -> Unit) {
        Column {
            Text(text = "Ingresar Texto")
            TextField(value = texto, onValueChange = onTextChanged)
        }
    }

    class MainViewModel : ViewModel() {
        val textFieldState = MutableLiveData("")

        fun onTextChanged(newText: String) {
            textFieldState.value = newText

        }
    }
}

