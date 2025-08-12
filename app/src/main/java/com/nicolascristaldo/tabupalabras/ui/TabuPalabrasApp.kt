package com.nicolascristaldo.tabupalabras.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nicolascristaldo.tabupalabras.data.preferences.PreferencesManager
import com.nicolascristaldo.tabupalabras.ui.navigation.TabuPalabrasNavHost
import com.nicolascristaldo.tabupalabras.ui.theme.verticalGradientBackground
import com.nicolascristaldo.tabupalabras.ui.theme.appBackGroundColor1
import com.nicolascristaldo.tabupalabras.ui.theme.appBackGroundColor2
import com.nicolascristaldo.tabupalabras.ui.viewmodels.TabuViewModel

@Composable
fun TabuPalabrasApp(
    viewModel: TabuViewModel = hiltViewModel(),
    navController: NavHostController = rememberNavController(),
    preferencesManager: PreferencesManager,
    modifier: Modifier = Modifier
) {
    Scaffold { innerPadding ->
        Surface {
            TabuPalabrasNavHost(
                viewModel = viewModel,
                navController = navController,
                preferencesManager = preferencesManager,
                modifier = modifier
                    .padding(innerPadding)
                    .verticalGradientBackground(
                        startColor = appBackGroundColor1,
                        endColor = appBackGroundColor2
                    )
            )
        }
    }
}


