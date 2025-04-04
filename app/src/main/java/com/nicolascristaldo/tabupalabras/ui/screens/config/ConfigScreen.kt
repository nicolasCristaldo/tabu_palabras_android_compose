package com.nicolascristaldo.tabupalabras.ui.screens.config

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.ui.screens.config.components.ConfigForm
import com.nicolascristaldo.tabupalabras.ui.screens.config.components.ConfigTopAppBar
import com.nicolascristaldo.tabupalabras.ui.viewmodels.TabuViewModel

@Composable
fun ConfigScreen(
    viewModel: TabuViewModel,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(uiState.currentScreen) {
        if (uiState.currentScreen != AppDestinations.Config) {
            navController.navigate(uiState.currentScreen.route)
        }
    }

    Column(
        modifier = modifier
    ) {
        ConfigTopAppBar(
            title = uiState.categorySelected?.name ?: "Configuración del juego",
            navigateBack = navController::popBackStack,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        ConfigForm(
            uiState = uiState,
            onTeam1NameChange = { viewModel.setTeamNames(it, uiState.team2.name) },
            onTeam2NameChange = { viewModel.setTeamNames(uiState.team1.name, it) },
            onRoundsChange = viewModel::setRounds,
            onMinutesChange = viewModel::setMinutes,
            onStartGame = viewModel::startGame,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }
}


