package com.nicolascristaldo.tabupalabras.ui.screens.result.components

import androidx.compose.foundation.layout.Column
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
import com.nicolascristaldo.tabupalabras.domain.model.Team
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite

@Composable
fun TeamSummary(
    team: Team,
    color: Color,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = team.name,
            style = MaterialTheme.typography.titleMedium,
            color = color,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_medium))
        )
        Text(
            text = stringResource(R.string.points_suffix, team.score.toString()),
            style = MaterialTheme.typography.bodyMedium,
            color = textWhite,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small))
        )
        Text(
            text = stringResource(R.string.errors_suffix, team.errors.toString()),
            style = MaterialTheme.typography.bodyMedium,
            color = textWhite,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small))
        )
        Text(
            text = stringResource(R.string.words_suffix, team.totalWords.toString()),
            style = MaterialTheme.typography.bodyMedium,
            color = textWhite,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small))
        )
    }
}