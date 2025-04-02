package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
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

    Box(modifier = modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            TeamNameCard(
                name = uiState.team1.name,
                color = Color.Red,
                onEdit = { editingTeam = "team1" }
            )

            Text(text = "VS")

            TeamNameCard(
                name = uiState.team2.name,
                color = Color.Blue,
                onEdit = { editingTeam = "team2" }
            )

            Text(text = "Rondas")
            CounterRow(
                count = uiState.rounds,
                onValueChange = onRoundsChange
            )

            Text(text = "Tiempo")
            CounterRow(
                count = uiState.minutesPerRound,
                onValueChange = onMinutesChange
            )

            Button(
                onClick = onStartGame,
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(text = "Iniciar Juego")
            }
        }

        if (editingTeam != null) {
            EditNameDialog(
                team1Name = uiState.team1.name,
                team2Name = uiState.team2.name,
                onTeam1NameChange = onTeam1NameChange,
                onTeam2NameChange = onTeam2NameChange,
                editingTeam = editingTeam,
                changeEditingState = { editingTeam = null }
            )
        }
    }
}

@Composable
fun EditNameDialog(
    team1Name: String,
    team2Name: String,
    onTeam1NameChange: (String) -> Unit,
    onTeam2NameChange: (String) -> Unit,
    editingTeam: String?,
    changeEditingState: () -> Unit,
    modifier: Modifier = Modifier
) {
    val focusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current
    val currentName = if (editingTeam == "team1") team1Name else team2Name
    val onNameChange = if (editingTeam == "team1") onTeam1NameChange else onTeam2NameChange

    Dialog(
        onDismissRequest = { changeEditingState() }
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .background(
                    color = if (editingTeam == "team1") Color.Red else Color.Blue,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp)
        ) {
            ConfigTextField(
                value = currentName,
                onValueChange = { onNameChange(it) },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions(
                    onDone = {
                        focusManager.clearFocus()
                        changeEditingState()
                    }
                ),
                modifier = Modifier.focusRequester(focusRequester)
            )
        }

        LaunchedEffect(editingTeam) {
            focusRequester.requestFocus()
        }

        BackHandler {
            focusManager.clearFocus()
            changeEditingState()
        }
    }
}