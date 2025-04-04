package com.nicolascristaldo.tabupalabras.ui.screens.game

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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.domain.model.TabuCard
import com.nicolascristaldo.tabupalabras.ui.components.ActionButton
import com.nicolascristaldo.tabupalabras.ui.screens.game.components.RoundGameButton
import com.nicolascristaldo.tabupalabras.ui.theme.cardBackGroundColor
import com.nicolascristaldo.tabupalabras.ui.theme.cardTitleBackGroundColor1
import com.nicolascristaldo.tabupalabras.ui.theme.cardTitleBackGroundColor2
import com.nicolascristaldo.tabupalabras.ui.theme.correctWordButtonColor
import com.nicolascristaldo.tabupalabras.ui.theme.errorButtonColor
import com.nicolascristaldo.tabupalabras.ui.theme.linearGradientBackground
import com.nicolascristaldo.tabupalabras.ui.theme.passWordButtonColor
import com.nicolascristaldo.tabupalabras.ui.theme.team1Color
import com.nicolascristaldo.tabupalabras.ui.theme.team2Color
import com.nicolascristaldo.tabupalabras.ui.theme.textBlack
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite
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
            modifier = modifier.padding(16.dp)
        )
    }
}

@Composable
fun StartRoundScreen(
    currentTeam: String,
    teamColor: Color,
    currentRound: Int,
    rounds: Int,
    onStartRound: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Spacer(modifier = Modifier.weight(.2f))
        Text(
            text = "Ronda $currentRound de $rounds",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            color = textWhite
        )

        Spacer(modifier = Modifier.weight(.5f))

        Text(
            text = "Turno de:",
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            color = textWhite,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = currentTeam,
            style = MaterialTheme.typography.displayLarge,
            textAlign = TextAlign.Center,
            color = teamColor
        )

        Spacer(modifier = Modifier.weight(1f))

        ActionButton(
            text = "¡Empezar!",
            onClick = onStartRound,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 8.dp)
        )
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

        Spacer(modifier = Modifier.weight(.4f))

        currentCard?.let { card ->
            GameCard(
                card = card,
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .fillMaxHeight(0.65f)
            )
        }

        Spacer(modifier = Modifier.weight(.6f))

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
        text = timeLeft.toString(),
        style = MaterialTheme.typography.headlineMedium,
        color = textWhite,
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
        colors = CardDefaults.cardColors(containerColor = cardBackGroundColor),
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
                    .linearGradientBackground(
                        startColor = cardTitleBackGroundColor1,
                        endColor = cardTitleBackGroundColor2
                    )
            ) {
                Text(
                    text = card.word,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.displayMedium,
                    color = textWhite,
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
                        style = MaterialTheme.typography.titleLarge,
                        color = textBlack,
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
        RoundGameButton(
            icon = R.drawable.ic_refresh,
            onClick = onWrong,
            color = passWordButtonColor,
        )

        RoundGameButton(
            icon = R.drawable.ic_silence,
            onClick = onCorrect,
            color = errorButtonColor,
        )

        RoundGameButton(
            icon = R.drawable.ic_correct,
            onClick = onPass,
            color = correctWordButtonColor,
        )
    }
}
