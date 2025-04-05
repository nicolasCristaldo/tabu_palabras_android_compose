package com.nicolascristaldo.tabupalabras.ui.screens.game.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.domain.model.TabuCard

@Composable
fun PlayScreen(
    timeLeft: Int,
    currentCard: TabuCard?,
    onCorrect: () -> Unit,
    onWrong: () -> Unit,
    onPass: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        GameTimer(
            timeLeft = timeLeft,
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_large))
        )

        Spacer(modifier = Modifier.weight(.4f))

        currentCard?.let { card ->
            GameCard(
                card = card,
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .fillMaxHeight(0.65f)
            )
        }

        Spacer(modifier = Modifier.weight(.6f))

        GameButtons(
            onCorrect = onCorrect,
            onWrong = onWrong,
            onPass = onPass,
            modifier = Modifier
                .padding(bottom = dimensionResource(R.dimen.padding_large))
                .fillMaxWidth()
        )
    }
}