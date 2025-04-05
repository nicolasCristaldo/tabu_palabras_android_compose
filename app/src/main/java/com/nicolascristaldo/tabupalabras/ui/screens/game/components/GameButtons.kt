package com.nicolascristaldo.tabupalabras.ui.screens.game.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.ui.theme.correctWordButtonColor
import com.nicolascristaldo.tabupalabras.ui.theme.errorButtonColor
import com.nicolascristaldo.tabupalabras.ui.theme.passWordButtonColor

@Composable
fun GameButtons(
    onCorrect: () -> Unit,
    onWrong: () -> Unit,
    onPass: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
    ) {
        RoundGameButton(
            icon = R.drawable.ic_refresh,
            onClick = onWrong,
            color = passWordButtonColor,
        )

        RoundGameButton(
            icon = R.drawable.ic_silence,
            onClick = onCorrect,
            color = errorButtonColor,
        )

        RoundGameButton(
            icon = R.drawable.ic_correct,
            onClick = onPass,
            color = correctWordButtonColor,
        )
    }
}