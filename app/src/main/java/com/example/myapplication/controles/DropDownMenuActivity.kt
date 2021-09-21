package com.example.myapplication.controles

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class DropDownMenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {

        }
    }

    @Preview(showBackground = true, name = "Dropdown menu, con lista y opcion desabilitada")
    @Composable
    fun App(){
        MyApplicationTheme() {
            DropdownDemo()
        }
    }

    @Composable
    fun DropdownDemo() {
        var expanded by remember { mutableStateOf(false) }
        val items = listOf("A", "B", "C", "D", "E", "F")
        val disabledValue = "B"
        var selectedIndex by remember { mutableStateOf(0) }
        Box(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopStart)) {
            Text(items[selectedIndex],
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(onClick = { expanded = true })
                    .background(Color.Gray)
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red)
            ) {
                items.forEachIndexed { index, s ->
                    DropdownMenuItem(onClick = {
                        selectedIndex = index
                        expanded = false
                    }) {
                        val disabledText = if (s == disabledValue) {
                            " (Disabled)"
                        } else {
                            ""
                        }
                        Text(text = s + disabledText)
                    }
                }
            }
        }
    }
}
