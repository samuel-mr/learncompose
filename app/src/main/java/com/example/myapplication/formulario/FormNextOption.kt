package com.example.myapplication.formulario

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.constrain
import com.example.myapplication.Comentario
import com.example.myapplication.ui.theme.MyApplicationTheme

data class Data(var country: String, var capital: String)

@Preview(showBackground = true)
@Composable
fun FormNextOptionPreview() {
    MyApplicationTheme {
        FormNextOptionView()
    }
}

object ChildAspectRatio : LayoutModifier {
    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints
    ): MeasureResult {
        val placeable = measurable.measure(constraints)
        val size = kotlin.math.max(placeable.width, placeable.height)
            .let { constraints.constrain(IntSize(it, it)) }
        return layout(size.width, size.height) {
            placeable.placeRelative(0, 0)
        }
    }
}
@Composable
fun FormNextOptionView() {
    // TODO : falta arreglar q funcione el mutable State:
    data class Data(var country: String, var capital: String)

    var uiState by remember { mutableStateOf(Data("Greece", "Athens")) }

    val focusManager = LocalFocusManager.current
    val context = LocalContext.current

    Column(modifier = Modifier.then(ChildAspectRatio)) {
        Comentario(text = "[navegación entre controles] Muestra cajas con opción 'Next' para ir de un control a otro")
        TextField(   value = uiState.country,
            onValueChange = { uiState.country = it },
            placeholder = { Text(text = "ho") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions(
                onNext = { focusManager.moveFocus(FocusDirection.Down) }
            ),
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = uiState.capital,
            onValueChange = { uiState.capital = it },
            singleLine = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                Toast.makeText(
                    context,
                    "Finalizado!",
                    Toast.LENGTH_SHORT
                ).show()
            }),
            modifier = Modifier.fillMaxWidth()
        )
    }
}
