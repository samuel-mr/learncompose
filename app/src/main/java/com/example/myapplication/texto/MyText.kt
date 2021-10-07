package com.example.myapplication.texto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontSynthesis
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Purple200

@Preview
@Composable
fun ShowText(){
    Text(text = "Text example")
}

@Preview
@Composable
fun TextColor(){
    Column {
        Text(
            text = "text Purple200",
            color = Purple200 // From File ui.theme Color.kt
        )
        Text(
            text = "text Color.Green",
            color = Color.Green
        )
        Text(
            text = "text 0xFF3700B3",
            color = Color(0xFF3700B3)
        )
    }
}

@Preview
@Composable
fun TextFontSize(){
    Column {
        Text(
            text = "text 20.sp",
            fontSize = 20.sp    //Recommended
        )
        Text(
            text = "text 20.em",
            fontSize = 20.em
        )
    }
}

@Preview
@Composable
fun TextFontWeight(){
    Column {
        Text(text = "text",fontWeight = FontWeight.ExtraLight)
        Text(text = "text",fontWeight = FontWeight.Light)
        Text(text = "text",fontWeight = FontWeight.Normal)
        Text(text = "text",fontWeight = FontWeight.Medium)
        Text(text = "text",fontWeight = FontWeight.SemiBold)
        Text(text = "text",fontWeight = FontWeight.Bold)
        Text(text = "text",fontWeight = FontWeight.Black)
        Text(text = "text",fontWeight = FontWeight.ExtraBold)
    }
}

@Preview
@Composable
fun TextFontFamily(){
    Column {
        Text(text = "text", fontFamily = FontFamily.Default)
        Text(text = "text", fontFamily = FontFamily.Cursive)
        Text(text = "text", fontFamily = FontFamily.Monospace)
        Text(text = "text", fontFamily = FontFamily.SansSerif)
        Text(text = "text", fontFamily = FontFamily.Serif)
    }
}

@Preview
@Composable
fun TextDecoration(){
    Column {
        Text(text = "text", textDecoration = TextDecoration.None)
        Text(text = "text", textDecoration = TextDecoration.LineThrough)
        Text(text = "text", textDecoration = TextDecoration.Underline)
    }
}

@Preview
@Composable
fun TextModifierSize(){
    Column {
        Text(text = "text", modifier = Modifier.size(250.dp))
        Text(text = "text", modifier = Modifier.size(width = 200.dp, height = 100.dp))
    }
}
@Preview
@Composable
fun TextModifierFillMaxWidth(){
    Text(text = "text", modifier = Modifier.fillMaxWidth())
}
@Preview
@Composable
fun TextModifierFillMaxHeight(){
    Text(text = "text", modifier = Modifier.fillMaxHeight())
}

@Preview
@Composable
fun TextModifierFillMaxSize(){
    Text(text = "text", modifier = Modifier.fillMaxSize())
}

@Preview
@Composable
fun TextSize(){
    Text(text = "text abc def ghi jkm.",
        modifier = Modifier.size(100.dp)
    )
}

@Preview
@Composable
fun TextAlignCenter(){
    Text(text = "text abc def ghi jkm.",
        textAlign = TextAlign.Center,
        modifier = Modifier.size(100.dp)
    )
}
@Preview
@Composable
fun TextAlignStart(){
    Text(text = "text abc def ghi jkm.",
        textAlign = TextAlign.Start,
        modifier = Modifier.size(100.dp)
    )
}
@Preview
@Composable
fun TextAlignRight(){
    Text(text = "text abc def ghi jkm.",
        textAlign = TextAlign.Right,
        modifier = Modifier.size(100.dp)
    )
}
@Preview
@Composable
fun TextAlignLeft(){
    Text(text = "text abc def ghi jkm.",
        textAlign = TextAlign.Left,
        modifier = Modifier.size(100.dp)
    )
}

@Preview
@Composable
fun TextAlignJustify(){
    Text(text = "text abc def ghi jkm.",
        textAlign = TextAlign.Justify,
        modifier = Modifier.size(100.dp)
    )
}
@Preview
@Composable
fun TextAlignEnd(){
    Text(text = "text abc def ghi jkm.",
        textAlign = TextAlign.End,
        modifier = Modifier.size(100.dp)
    )
}

@Preview
@Composable
fun TextLineHeight(){
    Column {
        Text(text = "text abc def ghi jkm lnm opq rst.",
            lineHeight = 50.sp,
            modifier = Modifier.width(100.dp)
        )
    }
}

@Preview
@Composable
fun TextMaxLines(){
    Text(text = "text abc def ghi jkm lnm opq rst.",
        modifier = Modifier.width(100.dp),
        maxLines = 1
    )
}

@Preview
@Composable
fun TextOverFlowEllipsis(){
    Text(text = "text abc def ghi jkm lnm opq rst.",
        modifier = Modifier.width(100.dp),
        maxLines = 1 ,
        overflow = TextOverflow.Ellipsis
    )
}

@Preview
@Composable
fun TextOverFlowClip(){
    Text(text = "text abc def ghi jkm lnm opq rst.",
        modifier = Modifier.width(100.dp),
        maxLines = 1 ,
        overflow = TextOverflow.Clip
    )
}

@Preview
@Composable
fun TextOverFlowVisible(){
    Text(text = "text abc def ghi jkm lnm opq rst.",
        modifier = Modifier.width(100.dp),
        maxLines = 1 ,
        overflow = TextOverflow.Visible
    )
}

@Preview
@Composable
fun TextSoftWrap(){
    Box(modifier = Modifier.width(100.dp),) {
        Text(text = "textabcdefghijkmlnmopqrst.",
            softWrap = false
        )
    }
}

@Preview
@Composable
fun TextStyle(){
    Box(modifier = Modifier.width(200.dp).background(Color.White)) {
        Text(text = "textabcdefghijkmlnmopqrst.",
            style = TextStyle
                (Color.Red,
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Italic,
                fontSynthesis = FontSynthesis.Style,
                fontFamily = FontFamily.Serif,
                letterSpacing = 10.sp,
                background = Color.Green,
                textDecoration = TextDecoration.Underline,
                shadow = Shadow(
                    color = Color.Blue,
                    offset = Offset(8f, 8f),
                    blurRadius = 8f
                ),
//                textAlign = TextAlign.Right, // Same behavior than textDirection
                textDirection = TextDirection.Ltr

            )
        )
    }
}