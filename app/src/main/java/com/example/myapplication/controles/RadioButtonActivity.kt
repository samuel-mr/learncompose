package com.example.myapplication.controles

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

class RadioButtonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {

        }
    }


    @Preview(showBackground = true, name = "Lista vertical de RadioButtons 2")
    @Composable
    fun RadioButtonSample() {
        val radioOptions = listOf("A", "B", "C")
        val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[1]) }
        Column {
            radioOptions.forEach { text ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = (text == selectedOption),
                            onClick = {
                                onOptionSelected(text)
                            }
                        )
                        .padding(horizontal = 16.dp)
                ) {
                    RadioButton(
                        selected = (text == selectedOption),
                        onClick = { onOptionSelected(text) }
                    )
                    Text(
                        text = text,
                        style = MaterialTheme.typography.body1.merge(),
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }
            }

            RadioButton(selected =false,onClick = {})
            RadioButton(selected =false, onClick = {})
        }
    }
}
