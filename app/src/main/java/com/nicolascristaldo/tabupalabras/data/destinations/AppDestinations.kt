package com.nicolascristaldo.tabupalabras.data.destinations

sealed class AppDestinations(
    val route: String
) {
    data object Home : AppDestinations("home")
    data object Game : AppDestinations("game")
    data object Config : AppDestinations("config")
    data object Result : AppDestinations("result")
}