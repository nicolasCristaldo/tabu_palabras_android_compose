package com.nicolascristaldo.tabupalabras.ui.screens.game

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import com.nicolascristaldo.tabupalabras.domain.model.TabuCard
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
            currentRound = uiState.currentRound,
            rounds = uiState.rounds,
            onStartRound = viewModel::startTimer,
            modifier = modifier
        )
    }
}

@Composable
fun StartRoundScreen(
    currentTeam: String,
    currentRound: Int,
    rounds: Int,
    onStartRound: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
    ) {
        Text(
            text = "Turno de $currentTeam"
        )

        Text(
            text = "Ronda $currentRound de $rounds"
        )

        Button(
            onClick = { onStartRound() }
        ) {
            Text(
                text = "¡Empezar!"
            )
        }
    }
}

@Composable
fun PlayScreen(
    timeLeft: Int,
    currentCard: TabuCard?,
    onCorrect: () -> Unit,
    onWrong: () -> Unit,
    onPass: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        GameTimer(
            timeLeft = timeLeft,
            modifier = Modifier.padding(top = 32.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        currentCard?.let { card ->
            GameCard(
                card = card,
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .fillMaxHeight(0.65f)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        GameButtons(
            onCorrect = onCorrect,
            onWrong = onWrong,
            onPass = onPass,
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun GameTimer(
    timeLeft: Int,
    modifier: Modifier = Modifier
) {
    Text(
        text = "Tiempo restante: $timeLeft",
        modifier = modifier
    )
}

@Composable
fun GameCard(
    card: TabuCard,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(32.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Blue),
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .background(color = Color.Magenta)
            ) {
                Text(
                    text = card.word,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            card.forbiddenWords.forEach { forbiddenWord ->
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(7f / card.forbiddenWords.size)
                ) {
                    Text(
                        text = forbiddenWord,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Composable
fun GameButtons(
    onCorrect: () -> Unit,
    onWrong: () -> Unit,
    onPass: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
    ) {
        Button(
            onClick = { onPass() }
        ) {
            Icon(
                imageVector = Icons.Filled.Refresh,
                contentDescription = "Pasar"
            )
        }
        Button(
            onClick = { onWrong() },
        ) {
            Icon(
                imageVector = Icons.Filled.Close,
                contentDescription = "Error"
            )
        }
        Button(
            onClick = { onCorrect() },
        ) {
            Icon(
                imageVector = Icons.Filled.CheckCircle,
                contentDescription = "Correcto"
            )
        }
    }
}
