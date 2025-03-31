package com.nicolascristaldo.tabupalabras.domain.model

data class TabuCard(
    val word: String,
    val category: String,
    val forbiddenWords: List<String>
)
