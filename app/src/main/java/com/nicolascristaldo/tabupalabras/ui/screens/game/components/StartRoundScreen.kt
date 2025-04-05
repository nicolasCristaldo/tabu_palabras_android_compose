package com.nicolascristaldo.tabupalabras.ui.screens.game.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.ui.components.ActionButton
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite

@Composable
fun StartRoundScreen(
    currentTeam: String,
    teamColor: Color,
    currentRound: Int,
    rounds: Int,
    onStartRound: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Spacer(modifier = Modifier.weight(.2f))
        Text(
            text = stringResource(R.string.round_prefix, currentRound, rounds),
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            color = textWhite
        )

        Spacer(modifier = Modifier.weight(.5f))

        Text(
            text = stringResource(R.string.turn_label),
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            color = textWhite,
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small))
        )

        Text(
            text = currentTeam,
            style = MaterialTheme.typography.displayLarge,
            textAlign = TextAlign.Center,
            color = teamColor
        )

        Spacer(modifier = Modifier.weight(1f))

        ActionButton(
            text = stringResource(R.string.start_round_button),
            onClick = onStartRound,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = dimensionResource(R.dimen.padding_large),
                    vertical = dimensionResource(R.dimen.padding_small)
                )
        )
    }
}