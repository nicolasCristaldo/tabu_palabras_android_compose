package com.nicolascristaldo.tabupalabras.ui.screens.result

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.domain.model.Team
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
        Text(
            text = "Ganador: ${uiState.winner?.name}"
        )

        Spacer(modifier = Modifier.weight(1f))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
        ) {
            StatCard(
                team = uiState.team1,
                modifier = Modifier
                    .fillMaxWidth(.4f)
                    .fillMaxHeight(.3f)
            )
            StatCard(
                team = uiState.team2,
                modifier = Modifier
                    .fillMaxWidth(.4f)
                    .fillMaxHeight(.3f)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { viewModel.resetGame() }
        ) {
            Text(
                text = "Volver a pantalla principal"
            )
        }
    }
}

@Composable
fun StatCard(
    team: Team,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 16.dp),
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
        ) {
            Text(
                text = team.name
            )
            Text(
                text = team.score.toString() + " puntos"
            )
            Text(
                text = team.errors.toString() + " Errores"
            )
            Text(
                text = team.totalWords.toString() + " Palabras"
            )
        }
    }
}