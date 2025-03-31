package com.nicolascristaldo.tabupalabras.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.data.providers.CardsProvider
import com.nicolascristaldo.tabupalabras.domain.model.TabuCategory
import com.nicolascristaldo.tabupalabras.ui.uistates.TabuUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TabuViewModel @Inject constructor(): ViewModel() {
    private val _uiState = MutableStateFlow(TabuUiState())
    val uiState: StateFlow<TabuUiState> = _uiState.asStateFlow()

    // ******************************   HOME   ******************************

    fun onCategorySelected(category: TabuCategory) {
        _uiState.update {
            _uiState.value.copy(
                categorySelected = category,
                currentScreen = AppDestinations.Config
            )
        }
    }

    // ******************************   CONFIG   ******************************

    fun setTeamNames(team1Name: String, team2Name: String) {
        _uiState.update {
            _uiState.value.copy(
                team1 = _uiState.value.team1.copy(name = team1Name),
                team2 = _uiState.value.team2.copy(name = team2Name)
            )
        }
    }

    fun setRounds(rounds: Int) {
        _uiState.update { _uiState.value.copy(rounds = rounds) }
    }

    fun setMinutes(time: Int) {
        _uiState.update {
            _uiState.value.copy(
                minutesPerRound = time,
                timeLeft = time * 60
            )
        }
    }

    fun startGame() {
        val cards = CardsProvider().cards
        _uiState.update {
            _uiState.value.copy(
                availableCards = cards,
                currentCard = cards.firstOrNull(),
                currentScreen = AppDestinations.Game
            )
        }
    }

    // ******************************   GAME   ******************************

    fun nextCard(correct: Boolean) {
        if (correct) {
            if (_uiState.value.currentTeam == 1) {
                _uiState.update { _uiState.value.copy(team1 = _uiState.value.team1.addPoint()) }
            } else {
                _uiState.update { _uiState.value.copy(team2 = _uiState.value.team2.addPoint()) }
            }
        }
        val nextCard = _uiState.value.availableCards.firstOrNull()
        _uiState.update {
            _uiState.value.copy(
                currentCard = nextCard,
                availableCards = _uiState.value.availableCards.drop(1)
            )
        }
    }

    fun endRound() {
        if (_uiState.value.currentRound < _uiState.value.rounds) {
            _uiState.update { _uiState.value.copy(currentRound = _uiState.value.currentRound + 1) }
            switchTeam()
        }
        else {
            endGame()
        }
    }

    fun switchTeam() {
        _uiState.update {
            _uiState.value.copy(
                currentTeam = if (_uiState.value.currentTeam == 1) 2 else 1,
                timeLeft = _uiState.value.minutesPerRound * 60
            )
        }
    }

    private fun startTimer() = viewModelScope.launch {
        while (_uiState.value.timeLeft > 0){
            delay(1000)
            _uiState.update { _uiState.value.copy(timeLeft = _uiState.value.timeLeft - 1) }
        }

        if (_uiState.value.currentTeam == 0) {
            switchTeam()
        }
    }

    fun endGame() {
        val winner = when {
            _uiState.value.team1.score > _uiState.value.team2.score -> _uiState.value.team1
            _uiState.value.team1.score < _uiState.value.team2.score -> _uiState.value.team2
            else -> null
        }

        _uiState.update { _uiState.value.copy(winner = winner, currentScreen = AppDestinations.Result) }
    }

    // ******************************   RESULT   ******************************

    fun resetGame() {
        _uiState.update {
            _uiState.value.copy(
                currentScreen = AppDestinations.Home,
                categorySelected = null,
                team1 = _uiState.value.team1.copy(score = 0, errors = 0),
                team2 = _uiState.value.team2.copy(score = 0, errors = 0),
            )
        }
    }
}