package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.ui.theme.team1Color
import com.nicolascristaldo.tabupalabras.ui.theme.team2Color

@Composable
fun NameCardsSection(
    team1Name: String,
    team2Name: String,
    onTeam1CardClick: () -> Unit,
    onTeam2CardClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        TeamNameCard(
            name = team1Name,
            color = team1Color,
            onEditClick = onTeam1CardClick,
            modifier = Modifier
                .height(dimensionResource(R.dimen.team_card_height))
                .fillMaxWidth()
        )

        Image(
            painter = painterResource(R.drawable.ic_versus),
            contentDescription = null,
            modifier = Modifier
                .padding(dimensionResource(R.dimen.padding_small))
                .size(dimensionResource(R.dimen.versus_icon_size))
        )

        TeamNameCard(
            name = team2Name,
            color = team2Color,
            onEditClick = onTeam2CardClick,
            modifier = Modifier
                .height(dimensionResource(R.dimen.team_card_height))
                .fillMaxWidth()
        )
    }
}