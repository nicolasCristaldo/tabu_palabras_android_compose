package com.nicolascristaldo.tabupalabras.data.providers

import com.nicolascristaldo.tabupalabras.domain.model.TabuCard

class CardsProvider {
    val cards = listOf(
        TabuCard(
            word = "Hola",
            category = "General",
            forbiddenWords = listOf("Adios", "Chau", "Hola", "Adios", "Chau")
        ),
        TabuCard(
            word = "Perro",
            category = "Animales",
            forbiddenWords = listOf("Gato", "Caballo", "Perro", "Gato", "Caballo")
        ),
        TabuCard(
            word = "Gato",
            category = "Animales",
            forbiddenWords = listOf("Perro", "Caballo", "Gato", "Perro", "Caballo")
        ),
        TabuCard(
            word = "Caballo",
            category = "Animales",
            forbiddenWords = listOf("Perro", "Gato", "Caballo", "Gato", "Perro")
        ),
        TabuCard(
            word = "Pizza",
            category = "Comidas",
            forbiddenWords = listOf("Hamburguesa", "Sushi", "Pizza", "Sushi", "Hamburguesa")
        ),
        TabuCard(
            word = "Hamburguesa",
            category = "Comidas",
            forbiddenWords = listOf("Pizza", "Sushi", "Hamburguesa", "Sushi", "Pizza")
        ),
        TabuCard(
            word = "Sushi",
            category = "Comidas",
            forbiddenWords = listOf("Pizza", "Hamburguesa", "Sushi", "Hamburguesa", "Pizza")
        ),
        TabuCard(
            word = "Película",
            category = "Pelícilas y Series",
            forbiddenWords = listOf("Serie", "Película de TV", "Película", "Serie", "Película de TV")
        ),
    )
}