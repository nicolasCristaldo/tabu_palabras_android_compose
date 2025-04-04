package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nicolascristaldo.tabupalabras.ui.components.ActionButton

@Composable
fun CounterRow(
    count: Int,
    onValueChange: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        ActionButton(
            text = "-",
            onClick = { onValueChange(count - 1) },
            enabled = count > 1
        )

        Text(
            text = count.toString(),
            modifier = Modifier
                .padding(horizontal = 32.dp)
                .align(Alignment.CenterVertically)
        )

        ActionButton(
            text = "+",
            onClick = { onValueChange(count + 1) },
            enabled = count < 3
        )
    }
}