package com.nicolascristaldo.tabupalabras.domain.model

data class TabuCard(
    val word: String,
    val categories: String,
    val forbiddenWords: List<String>
)