package com.nicolascristaldo.tabupalabras.domain.model

data class Team(
    val name: String,
    val score: Int = 0,
    val errors: Int = 0,
    val totalWords: Int = 0
) {
    private fun addPoint(): Team = copy(score = score + 1)
    private fun addError(): Team = copy(errors = errors + 1)
    private fun addWord(): Team = copy(totalWords = totalWords + 1)

    fun addResult(result: Boolean?): Team = when (result) {
        true -> addPoint().addWord()
        false -> addError().addWord()
        else -> addWord()
    }

    fun resetScore(): Team = copy(score = 0, errors = 0, totalWords = 0)
}
