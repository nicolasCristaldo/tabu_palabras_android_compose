package com.nicolascristaldo.tabupalabras.ui.uistates

import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.domain.model.TabuCard
import com.nicolascristaldo.tabupalabras.domain.model.TabuCategory
import com.nicolascristaldo.tabupalabras.domain.model.Team

data class TabuUiState(
    val currentScreen: AppDestinations = AppDestinations.Home,
    val categorySelected: TabuCategory? = null,
    val team1: Team = Team(name = "Equipo Rojo"),
    val team2: Team = Team(name = "Equipo Azul"),
    val rounds: Int = 1,
    val minutesPerRound: Int = 1,
    val availableCards: List<TabuCard> = emptyList(),
    val isPlaying: Boolean = false,
    val timeLeft: Int = 60,
    val currentRound: Int = 1,
    val turnsPlayedInRound: Int = 0,
    val currentCard: TabuCard? = null,
    val currentTeam: Int = 1,
    val winner: Team? = null
) {
    fun isValidName(name: String): Boolean = name.isNotBlank() && name.length <= 20
}
