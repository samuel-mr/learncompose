package com.example.myapplication.controles

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.myapplication.ui.theme.MyApplicationTheme

class BadgedBoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {

        }
    }

    @ExperimentalMaterialApi
    @Preview(name = "normal", showBackground = true)
    @Preview(name = "dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    fun Demo1() {
        MyApplicationTheme() {
            Column(modifier = Modifier.size(300.dp)) {
                BadgeBox(badgeContent = { Text("8") }) {
                    Icon(Icons.Filled.Favorite, contentDescription = "")
                }
                BadgeBox(badgeContent = { Text("2") }) {
                    Icon(Icons.Filled.Home, contentDescription = "")
                }
                BadgeBox(badgeContent = { Text("3") }) {
                    Icon(Icons.Filled.Settings, contentDescription = "")
                }
                BadgeBox(badgeContent = { Text("4") }) {
                    Icon(Icons.Filled.Delete, contentDescription = "")
                }
            }
        }
    }

    @ExperimentalMaterialApi
    @Preview(name = "normal", showBackground = true)
    @Preview(name = "dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    fun BadgeBoxDemo() {
        MyApplicationTheme() {
            BottomNavigation {
                BottomNavigationItem(
                    icon = {
                        BadgeBox(badgeContent = { Text("8") }) {
                            Icon(
                                Icons.Filled.Favorite,
                                contentDescription = "Favorite"
                            )
                        }

                    },
                    selected = false,
                    onClick = {})
            }
        }

    }
}
