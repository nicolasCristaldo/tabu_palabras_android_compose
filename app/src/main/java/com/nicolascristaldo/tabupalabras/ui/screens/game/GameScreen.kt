package com.nicolascristaldo.tabupalabras.ui.screens.game

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.navigation.NavController
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.ui.screens.game.components.PlayScreen
import com.nicolascristaldo.tabupalabras.ui.screens.game.components.StartRoundScreen
import com.nicolascristaldo.tabupalabras.ui.theme.team1Color
import com.nicolascristaldo.tabupalabras.ui.theme.team2Color
import com.nicolascristaldo.tabupalabras.ui.viewmodels.TabuViewModel

@Composable
fun GameScreen(
    viewModel: TabuViewModel,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(uiState.currentScreen) {
        if (uiState.currentScreen != AppDestinations.Game) {
            navController.navigate(uiState.currentScreen.route)
        }
    }

    if (uiState.isPlaying) {
        PlayScreen(
            timeLeft = uiState.timeLeft,
            currentCard = uiState.currentCard,
            onCorrect = { viewModel.nextCard(true) },
            onWrong = { viewModel.nextCard(false) },
            onPass = { viewModel.nextCard(null) },
            modifier = modifier
        )
    }
    else {
        StartRoundScreen(
            currentTeam = if (uiState.currentTeam == 1) uiState.team1.name else uiState.team2.name,
            teamColor = if (uiState.currentTeam == 1) team1Color else team2Color,
            currentRound = uiState.currentRound,
            rounds = uiState.rounds,
            onStartRound = viewModel::startTimer,
            modifier = modifier.padding(dimensionResource(R.dimen.padding_medium))
        )
    }
}

