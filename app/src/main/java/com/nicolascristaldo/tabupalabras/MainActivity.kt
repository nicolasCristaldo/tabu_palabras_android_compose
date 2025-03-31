package com.nicolascristaldo.tabupalabras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.nicolascristaldo.tabupalabras.ui.TabuPalabrasApp
import com.nicolascristaldo.tabupalabras.ui.theme.TabuPalabrasTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TabuPalabrasTheme {
                TabuPalabrasApp()
            }
        }
    }
}