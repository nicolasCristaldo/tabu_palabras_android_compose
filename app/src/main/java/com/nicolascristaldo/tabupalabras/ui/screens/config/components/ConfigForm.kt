package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.ui.components.ActionButton
import com.nicolascristaldo.tabupalabras.ui.theme.team1Color
import com.nicolascristaldo.tabupalabras.ui.theme.team2Color
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
                title = "Rondas",
                count = uiState.rounds,
                onRoundsChange = onRoundsChange,
                modifier = Modifier.padding(8.dp)
            )

            CounterSection(
                title = "Minutos",
                count = uiState.minutesPerRound,
                onRoundsChange = onMinutesChange,
                modifier = Modifier.padding(8.dp)
            )

            Spacer(modifier = Modifier.weight(.7f))

            ActionButton(
                text = "Iniciar Juego",
                onClick = onStartGame,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp, vertical = 8.dp)
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
                .height(75.dp)
                .fillMaxWidth()
        )

        Image(
            painter = painterResource(R.drawable.ic_versus),
            contentDescription = null,
            modifier = Modifier
                .padding(8.dp)
                .size(100.dp)
        )

        TeamNameCard(
            name = team2Name,
            color = team2Color,
            onEditClick = onTeam2CardClick,
            modifier = Modifier
                .height(75.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun CounterSection(
    title: String,
    count: Int,
    onRoundsChange: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(8.dp)
        )

        CounterRow(
            count = count,
            onValueChange = onRoundsChange
        )
    }
}

@Composable
fun EditNameDialog(
    onTeam1NameChange: (String) -> Unit,
    onTeam2NameChange: (String) -> Unit,
    editingTeam: String?,
    changeEditingState: () -> Unit,
    modifier: Modifier = Modifier
) {
    val focusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current
    val onNameChange = if (editingTeam == "Equipo Rojo") onTeam1NameChange else onTeam2NameChange

    Dialog(
        onDismissRequest = { changeEditingState() }
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .background(
                    color = if (editingTeam == "Equipo Rojo") team1Color else team2Color,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp)
        ) {
            ConfigTextField(
                onValueChange = {
                    if(it.isEmpty()) { onNameChange(editingTeam!!) }
                    else { onNameChange(it) }
                },
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