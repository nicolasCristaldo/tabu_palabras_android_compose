package com.nicolascristaldo.tabupalabras.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.data.preferences.PreferencesManager
import com.nicolascristaldo.tabupalabras.ui.screens.config.ConfigScreen
import com.nicolascristaldo.tabupalabras.ui.screens.game.GameScreen
import com.nicolascristaldo.tabupalabras.ui.screens.home.HomeScreen
import com.nicolascristaldo.tabupalabras.ui.screens.result.ResultScreen
import com.nicolascristaldo.tabupalabras.ui.viewmodels.TabuViewModel

@Composable
fun TabuPalabrasNavHost(
    viewModel: TabuViewModel,
    navController: NavHostController,
    preferencesManager: PreferencesManager,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = AppDestinations.Home.route,
        modifier = modifier
    ) {
        composable(route = AppDestinations.Home.route) {
            HomeScreen(
                onCategorySelected = viewModel::onCategorySelected,
                navController = navController,
                preferencesManager = preferencesManager
            )
        }

        composable(route = AppDestinations.Config.route) {
            ConfigScreen(
                viewModel = viewModel,
                navController = navController,
                modifier = Modifier.fillMaxSize()
            )
        }

        composable(route = AppDestinations.Game.route) {
            GameScreen(
                viewModel = viewModel,
                navController = navController,
                modifier = Modifier.fillMaxSize()
            )
        }

        composable(route = AppDestinations.Result.route) {
            ResultScreen(
                viewModel = viewModel,
                navController = navController,
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_medium))
                    .fillMaxSize()
            )
        }
    }
}