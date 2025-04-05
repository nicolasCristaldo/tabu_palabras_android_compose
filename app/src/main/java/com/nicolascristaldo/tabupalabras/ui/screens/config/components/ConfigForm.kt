package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.ui.components.ActionButton
import com.nicolascristaldo.tabupalabras.ui.uistates.TabuUiState

@Composable
fun ConfigForm(
    uiState: TabuUiState,
    onTeam1NameChange: (String) -> Unit,
    onTeam2NameChange: (String) -> Unit,
    onRoundsChange: (Int) -> Unit,
    onMinutesChange: (Int) -> Unit,
    onStartGame: () -> Unit,
    modifier: Modifier = Modifier
) {
    var editingTeam by remember { mutableStateOf<String?>(null) }

    Box(modifier = modifier) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            NameCardsSection(
                team1Name = uiState.team1.name,
                team2Name = uiState.team2.name,
                onTeam1CardClick = { editingTeam = "Equipo Rojo" },
                onTeam2CardClick = { editingTeam = "Equipo Azul" },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.weight(.3f))

            CounterSection(
                title = R.string.rounds_label,
                count = uiState.rounds,
                onRoundsChange = onRoundsChange,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
            )

            CounterSection(
                title = R.string.minutes_label,
                count = uiState.minutesPerRound,
                onRoundsChange = onMinutesChange,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
            )

            Spacer(modifier = Modifier.weight(.7f))

            ActionButton(
                text = stringResource(R.string.start_game_button),
                onClick = onStartGame,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = dimensionResource(R.dimen.padding_large),
                        vertical = dimensionResource(R.dimen.padding_small)
                    )
            )
        }

        if (editingTeam != null) {
            EditNameDialog(
                onTeam1NameChange = onTeam1NameChange,
                onTeam2NameChange = onTeam2NameChange,
                editingTeam = editingTeam,
                changeEditingState = { editingTeam = null }
            )
        }
    }
}

