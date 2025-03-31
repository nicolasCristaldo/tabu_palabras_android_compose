package com.nicolascristaldo.tabupalabras.domain.model

data class Team(
    val name: String,
    val score: Int = 0,
    val errors: Int = 0,
    val totalWords: Int = 1
) {
    fun addPoint(): Team {
        return copy(score = score + 1)
    }

    fun addError(): Team {
        return copy(errors = errors + 1)
    }
}
