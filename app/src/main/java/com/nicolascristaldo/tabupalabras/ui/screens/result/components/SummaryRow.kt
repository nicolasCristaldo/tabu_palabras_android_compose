package com.nicolascristaldo.tabupalabras.ui.screens.result.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.domain.model.Team
import com.nicolascristaldo.tabupalabras.ui.theme.team1Color
import com.nicolascristaldo.tabupalabras.ui.theme.team2Color

@Composable
fun SummaryRow(
    team1: Team,
    team2: Team,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        TeamSummary(
            team = team1,
            color = team1Color,
            modifier = Modifier
                .weight(1f)
                .padding(end = dimensionResource(R.dimen.padding_small))
        )
        TeamSummary(
            team = team2,
            color = team2Color,
            modifier = Modifier
                .weight(1f)
                .padding(start = dimensionResource(R.dimen.padding_small))
        )
    }
}