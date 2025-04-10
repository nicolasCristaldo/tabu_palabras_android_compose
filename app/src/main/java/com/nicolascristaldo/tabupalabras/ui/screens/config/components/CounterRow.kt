package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.ui.components.ActionButton
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite

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
            text = stringResource(R.string.counter_decrement),
            onClick = { onValueChange(count - 1) },
            enabled = count > 1
        )

        Text(
            text = count.toString(),
            color = textWhite,
            modifier = Modifier
                .padding(horizontal = dimensionResource(R.dimen.padding_large))
                .align(Alignment.CenterVertically)
        )

        ActionButton(
            text = stringResource(R.string.counter_increment),
            onClick = { onValueChange(count + 1) },
            enabled = count < 3
        )
    }
}