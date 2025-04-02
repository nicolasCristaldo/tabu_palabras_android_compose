package com.nicolascristaldo.tabupalabras.data.providers

import com.nicolascristaldo.tabupalabras.domain.model.TabuCard

class CardsProvider {
    val cards = listOf(
        TabuCard(
            word = "Hola",
            category = "General",
            forbiddenWords = listOf("Adios", "Chau")
        ),
        TabuCard(
            word = "Perro",
            category = "Animales",
            forbiddenWords = listOf("Gato", "Caballo")
        ),
        TabuCard(
            word = "Gato",
            category = "Animales",
            forbiddenWords = listOf("Perro", "Caballo")
        ),
        TabuCard(
            word = "Caballo",
            category = "Animales",
            forbiddenWords = listOf("Perro", "Gato")
        ),
        TabuCard(
            word = "Pizza",
            category = "Comidas",
            forbiddenWords = listOf("Hamburguesa", "Sushi")
        ),
        TabuCard(
            word = "Hamburguesa",
            category = "Comidas",
            forbiddenWords = listOf("Pizza", "Sushi")
        ),
        TabuCard(
            word = "Sushi",
            category = "Comidas",
            forbiddenWords = listOf("Pizza", "Hamburguesa")
        ),
        TabuCard(
            word = "Película",
            category = "Pelícilas y Series",
            forbiddenWords = listOf("Serie", "Película de TV")
        ),
    )
}