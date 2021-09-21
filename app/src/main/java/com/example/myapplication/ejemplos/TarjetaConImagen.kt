package com.example.myapplication.ejemplos

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.material.*
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.myapplication.ui.theme.MyApplicationTheme

@Preview(showBackground = true)
@Composable
fun PhotographerCardPreview() {
    MyApplicationTheme {
        PhotographerCard()
    }
}

@Composable
fun PhotographerCard(modifier : Modifier = Modifier) {

    Row(
        modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colors.surface)
            .clickable(onClick = {})
    ) {
        Surface(
            modifier = Modifier.size(50.dp),
            shape = CircleShape,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
        ) {

        }
        Column(
            modifier = Modifier
                .padding(5.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text("Alfred Sisley", fontWeight = FontWeight.Bold)
            // LocalContentAlpha: define el nivel de opacidad de sub-items
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text("hace 3 minutos", style = MaterialTheme.typography.body2)
            }
        }
    }
}
