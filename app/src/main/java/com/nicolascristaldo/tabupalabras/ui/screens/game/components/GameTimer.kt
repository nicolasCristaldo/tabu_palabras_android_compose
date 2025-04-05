package com.nicolascristaldo.tabupalabras.ui.screens.game.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite

@Composable
fun GameTimer(
    timeLeft: Int,
    modifier: Modifier = Modifier
) {
    Text(
        text = timeLeft.toString(),
        style = MaterialTheme.typography.headlineMedium,
        color = textWhite,
        modifier = modifier
    )
}