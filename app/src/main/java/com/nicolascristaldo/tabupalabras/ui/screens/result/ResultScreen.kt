package com.nicolascristaldo.tabupalabras.ui.screens.result

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.ui.components.ActionButton
import com.nicolascristaldo.tabupalabras.ui.screens.result.components.SummaryRow
import com.nicolascristaldo.tabupalabras.ui.theme.team1Color
import com.nicolascristaldo.tabupalabras.ui.theme.team2Color
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite
import com.nicolascristaldo.tabupalabras.ui.viewmodels.TabuViewModel

@Composable
fun ResultScreen(
    viewModel: TabuViewModel,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(uiState.currentScreen) {
        if (uiState.currentScreen != AppDestinations.Result) {
            navController.navigate(uiState.currentScreen.route)
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Spacer(modifier = Modifier.weight(1f))

        if (uiState.winner != null) {
            Text(
                text = stringResource(R.string.winner_label),
                style = MaterialTheme.typography.titleMedium,
                color = textWhite,
                modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small))
            )
        }

        Text(
            text = uiState.winner?.name ?: stringResource(R.string.tie_label),
            style = MaterialTheme.typography.displayLarge,
            textAlign = TextAlign.Center,
            color = when (uiState.winner) {
                uiState.team1 -> team1Color
                uiState.team2 -> team2Color
                else -> textWhite
            },
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small))
        )

        Spacer(modifier = Modifier.weight(.5f))

        SummaryRow(
            team1 = uiState.team1,
            team2 = uiState.team2,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.weight(1f))

        ActionButton(
            text = stringResource(R.string.return_to_home_button),
            onClick = viewModel::resetGame,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = dimensionResource(R.dimen.padding_large),
                    vertical = dimensionResource(R.dimen.padding_small)
                )
        )
    }
}