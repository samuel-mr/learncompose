package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Preview(showBackground = true)
@Composable
fun TextoPersonalizoPreview() {
    MyApplicationTheme() {
        TextoPersonalizoApp()
    }
}

/**
 * Source: https://developer.android.com/reference/kotlin/androidx/compose/foundation/text/package-summary#BasicTextField(androidx.compose.ui.text.input.TextFieldValue,kotlin.Function1,androidx.compose.ui.Modifier,kotlin.Boolean,kotlin.Boolean,androidx.compose.ui.text.TextStyle,androidx.compose.foundation.text.KeyboardOptions,androidx.compose.foundation.text.KeyboardActions,kotlin.Boolean,kotlin.Int,androidx.compose.ui.text.input.VisualTransformation,kotlin.Function1,androidx.compose.foundation.interaction.MutableInteractionSource,androidx.compose.ui.graphics.Brush,kotlin.Function1)
 */
@Composable
fun TextoPersonalizoApp() {
    var value by rememberSaveable { mutableStateOf("") }
    var waterMarkText by rememberSaveable { mutableStateOf("name@domain.com") }

    // TextField está implementado con los estilos de Material
    // Por lo que si se quiere un campo de teto más personalizable se debe usar BasicTextField
    BasicTextField(
        value = value,
        onValueChange = {
            value = it
            if (it.isNullOrEmpty()) {
                waterMarkText = "myEmail@domain.com"
            } else {
                if (it.contains('@')) {
                    waterMarkText = ""
                } else {
                    waterMarkText = "@domain.com"
                }
            }
        },
        decorationBox = { innerTextField ->
            // Because the decorationBox is used, the whole Row gets the same behaviour as the
            // internal input field would have otherwise. For example, there is no need to add a
            // Modifier.clickable to the Row anymore to bring the text field into focus when user
            // taps on a larger text field area which includes paddings and the icon areas.
            Row(
                Modifier
                    .background(Color.LightGray, RoundedCornerShape(percent = 30))
                    .padding(16.dp)
            ) {
                Icon(Icons.Default.MailOutline, contentDescription = null)
                Spacer(Modifier.width(16.dp))
                innerTextField()
                CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                    Text(text = waterMarkText, modifier = Modifier.padding(horizontal = 5.dp))
                }
            }
        }
    )
}
