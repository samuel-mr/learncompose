package com.example.myapplication.texto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

/**
 * Source: https://ngengesenior.medium.com/how-to-usevisualtransformation-to-create-phone-number-textfield-and-others-in-jetpack-compose-f7a62f8fbe95
 */
class CameroonNumberVisualTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        // Make the string XXX-XXX-XXX
        val trimmed = if (text.text.length >= 9) text.text.substring(0..8) else text.text
        var output = ""
        for (i in trimmed.indices) {
            output += trimmed[i]
            if (i % 3 == 2 && i != 8) output += "-"
        }


        /**
         * The offset works such that the translator ignores hyphens. Conversions
         * from original to transformed text works like this
        - 3rd character in the original text is the 4th in the transformed text
        - The 6th character in the original becomes the 8th
        In reverse, the conversion is such that
        - 10th Character in transformed becomes the 8th in original
        - 4th in transformed becomes 3rd in original
         */

        val cameroonNumberTranslator = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                // [offset [0 - 2] remain the same]
                if (offset <= 2) return offset
                // [3 - 5] transformed to [4 - 6] respectively
                if (offset <= 5) return offset + 1
                // [6 - 8] transformed to [8 - 10] respectively
                if (offset <= 8) return offset + 2
                return 11
            }

            override fun transformedToOriginal(offset: Int): Int {

                if (offset <= 2) return offset
                if (offset <= 6) return offset - 1
                if (offset <= 10) return offset - 2
                return 9

            }

        }

        return TransformedText(
            AnnotatedString(output),
            cameroonNumberTranslator
        )

    }

}

@Preview(showBackground = true)
@Composable
fun CameroonNumberTest() {

    var number by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
    ) {

        Text(text = "Número ingresado: $number")

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = number, onValueChange = {
                number = it
            }, modifier = Modifier.fillMaxWidth(),
            visualTransformation = CameroonNumberVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            maxLines = 1
        )

    }
}
