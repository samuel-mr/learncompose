package com.example.appimages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BordesRedondeadosPreview(){
    Box(
        modifier = Modifier.padding(16.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.nature_sea),
            contentDescription =  null,
            modifier = Modifier
                .height(300.dp)
                .width(300.dp)
                .clip(shape = RoundedCornerShape(30.dp)), //redondear esquinas
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BordesRedondeadosPreview2(){
    Box(
        modifier = Modifier.padding(16.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.nature_sea),
            contentDescription =  null,
            modifier = Modifier
                .height(300.dp)
                .width(300.dp)
                .clip(shape = CircleShape), //redondear esquinas
            contentScale = ContentScale.Crop
        )
    }
}
