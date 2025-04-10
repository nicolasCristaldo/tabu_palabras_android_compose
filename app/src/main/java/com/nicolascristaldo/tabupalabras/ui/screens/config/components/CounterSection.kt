package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite

@Composable
fun CounterSection(
    title: Int,
    count: Int,
    onRoundsChange: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = stringResource(title),
            color = textWhite,
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
        )

        CounterRow(
            count = count,
            onValueChange = onRoundsChange
        )
    }
}