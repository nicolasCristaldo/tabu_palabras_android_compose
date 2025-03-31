package com.nicolascristaldo.tabupalabras.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.ui.screens.config.ConfigScreen
import com.nicolascristaldo.tabupalabras.ui.screens.game.GameScreen
import com.nicolascristaldo.tabupalabras.ui.screens.home.HomeScreen
import com.nicolascristaldo.tabupalabras.ui.screens.result.ResultScreen

@Composable
fun TabuPalabrasNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = AppDestinations.Home.route,
        modifier = modifier
    ) {
        composable(route = AppDestinations.Home.route) {
            HomeScreen()
        }
        composable(route = AppDestinations.Game.route) {
            GameScreen()
        }
        composable(route = AppDestinations.Config.route) {
            ConfigScreen()
        }
        composable(route = AppDestinations.Result.route) {
            ResultScreen()
        }
    }
}