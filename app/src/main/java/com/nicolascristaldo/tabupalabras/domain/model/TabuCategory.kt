package com.nicolascristaldo.tabupalabras.domain.model

import androidx.compose.ui.graphics.Color

data class TabuCategory(
    val name: String,
    val colors: List<Color>,
    val emoji: String
)
