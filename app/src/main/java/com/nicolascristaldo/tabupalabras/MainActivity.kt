package com.nicolascristaldo.tabupalabras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.nicolascristaldo.tabupalabras.data.preferences.PreferencesManager
import com.nicolascristaldo.tabupalabras.ui.TabuPalabrasApp
import com.nicolascristaldo.tabupalabras.ui.theme.TabuPalabrasTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var preferencesManager: PreferencesManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TabuPalabrasTheme {
                TabuPalabrasApp(
                    preferencesManager = preferencesManager
                )
            }
        }
    }
}