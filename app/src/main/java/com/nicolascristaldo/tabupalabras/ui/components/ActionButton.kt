package com.nicolascristaldo.tabupalabras.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.nicolascristaldo.tabupalabras.ui.theme.buttonBackgroundColor
import com.nicolascristaldo.tabupalabras.ui.theme.buttonContentColor
import com.nicolascristaldo.tabupalabras.ui.theme.disabledButtonBackgroundColor
import com.nicolascristaldo.tabupalabras.ui.theme.disabledButtonContentColor

@Composable
fun ActionButton(
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors().copy(
            containerColor = buttonBackgroundColor,
            contentColor = buttonContentColor,
            disabledContainerColor = disabledButtonBackgroundColor,
            disabledContentColor = disabledButtonContentColor
        ),
        enabled = enabled,
        modifier = modifier
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleMedium
        )
    }
}