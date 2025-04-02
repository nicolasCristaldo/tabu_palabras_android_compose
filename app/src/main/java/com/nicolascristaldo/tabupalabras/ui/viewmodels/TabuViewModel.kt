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
                currentScreen = AppDestinations.Game,
                currentRound = 1,
                currentTeam = 1,
                turnsPlayedInRound = 0,
                timeLeft = _uiState.value.minutesPerRound * 60,
                isPlaying = false
            )
        }
    }

    // ******************************   GAME   ******************************

    fun nextCard(result: Boolean?) {
        val currentTeam = _uiState.value.currentTeam
        val nextCard = _uiState.value.availableCards.firstOrNull()

        if (currentTeam == 1) {
            _uiState.update { _uiState.value.copy(team1 = _uiState.value.team1.addResult(result)) }
        } else {
            _uiState.update { _uiState.value.copy(team2 = _uiState.value.team2.addResult(result)) }
        }

        _uiState.update {
            _uiState.value.copy(
                currentCard = nextCard,
                availableCards = _uiState.value.availableCards.drop(1)
            )
        }
    }

    fun startTimer() = viewModelScope.launch {
        _uiState.update { _uiState.value.copy(isPlaying = true) }

        while (_uiState.value.timeLeft > 0){
            delay(1000)
            _uiState.update { _uiState.value.copy(timeLeft = _uiState.value.timeLeft - 1) }
        }

        if (_uiState.value.timeLeft == 0) {
            val turnsPlayed = _uiState.value.turnsPlayedInRound + 1

            if (turnsPlayed == 2 && _uiState.value.currentRound >= _uiState.value.rounds) {
                endGame()
            }
            else { switchTeam() }
        }
    }

    private fun switchTeam() {
        val turnsPlayed = _uiState.value.turnsPlayedInRound + 1

        _uiState.update {
            _uiState.value.copy(
                currentTeam = if (_uiState.value.currentTeam == 1) 2 else 1,
                timeLeft = _uiState.value.minutesPerRound * 60,
                isPlaying = false,
                turnsPlayedInRound = turnsPlayed
            )
        }

        if (turnsPlayed == 2) {
            endRound()
        }
    }

    private fun endRound() {
        if (_uiState.value.currentRound < _uiState.value.rounds) {
            _uiState.update {
                _uiState.value.copy(
                    currentRound = _uiState.value.currentRound + 1,
                    turnsPlayedInRound = 0,
                    currentTeam = 1
                )
            }
        }
        else { endGame() }
    }

    private fun endGame() {
        val team1 = _uiState.value.team1
        val team2 = _uiState.value.team2
        val winner = when {
            team1.score > team2.score -> team1
            team1.score < team2.score -> team2
            team1.errors < team2.errors -> team1
            team1.errors > team2.errors -> team2
            team1.totalWords < team2.totalWords -> team1
            team1.totalWords > team2.totalWords -> team2
            else -> null
        }

        _uiState.update {
            _uiState.value.copy(
                winner = winner,
                currentScreen = AppDestinations.Result
            )
        }
    }

    // ******************************   RESULT   ******************************

    fun resetGame() {
        _uiState.update {
            _uiState.value.copy(
                currentScreen = AppDestinations.Home,
                categorySelected = null,
                team1 = _uiState.value.team1.resetScore(),
                team2 = _uiState.value.team2.resetScore(),
                winner = null,
                isPlaying = false,
                currentRound = 1,
                currentTeam = 1,
                turnsPlayedInRound = 0,
                timeLeft = _uiState.value.minutesPerRound * 60, // Reinicia timeLeft
                availableCards = emptyList(),
                currentCard = null
            )
        }
    }
}