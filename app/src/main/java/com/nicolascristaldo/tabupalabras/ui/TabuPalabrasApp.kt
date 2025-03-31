package com.nicolascristaldo.tabupalabras.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nicolascristaldo.tabupalabras.ui.navigation.TabuPalabrasNavHost

@Composable
fun TabuPalabrasApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold { innerPadding ->
        TabuPalabrasNavHost(
            navController = navController,
            modifier = modifier.padding(innerPadding)
        )
    }
}


