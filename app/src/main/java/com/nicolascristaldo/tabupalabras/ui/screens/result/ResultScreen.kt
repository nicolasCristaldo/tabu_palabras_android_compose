package com.nicolascristaldo.tabupalabras.ui.screens.result

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.domain.model.Team
import com.nicolascristaldo.tabupalabras.ui.components.ActionButton
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
                text = "Ganador:",
                style = MaterialTheme.typography.titleMedium,
                color = textWhite,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        Text(
            text = uiState.winner?.name ?: "Empate",
            style = MaterialTheme.typography.displayLarge,
            textAlign = TextAlign.Center,
            color = when (uiState.winner) {
                uiState.team1 -> team1Color
                uiState.team2 -> team2Color
                else -> textWhite
            },
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Spacer(modifier = Modifier.weight(.5f))

        SummaryRow(
            team1 = uiState.team1,
            team2 = uiState.team2,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.weight(1f))

        ActionButton(
            text = "Volver al inicio",
            onClick = viewModel::resetGame,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 8.dp)
        )
    }
}

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
                .padding(end = 8.dp)
        )
        TeamSummary(
            team = team2,
            color = team2Color,
            modifier = Modifier
                .weight(1f)
                .padding(start = 8.dp)
        )
    }
}

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
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = team.score.toString() + " puntos",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = team.errors.toString() + " Errores",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = team.totalWords.toString() + " Palabras",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 8.dp)
        )
    }
}