package com.nicolascristaldo.tabupalabras.data.providers

import com.nicolascristaldo.tabupalabras.domain.model.TabuCategory
import com.nicolascristaldo.tabupalabras.ui.theme.actionsCategoryColor1
import com.nicolascristaldo.tabupalabras.ui.theme.actionsCategoryColor2
import com.nicolascristaldo.tabupalabras.ui.theme.animalsCategoryColor1
import com.nicolascristaldo.tabupalabras.ui.theme.animalsCategoryColor2
import com.nicolascristaldo.tabupalabras.ui.theme.argentinaCategoryColor1
import com.nicolascristaldo.tabupalabras.ui.theme.argentinaCategoryColor2
import com.nicolascristaldo.tabupalabras.ui.theme.foodCategoryColor1
import com.nicolascristaldo.tabupalabras.ui.theme.foodCategoryColor2
import com.nicolascristaldo.tabupalabras.ui.theme.generalCategoryColor1
import com.nicolascristaldo.tabupalabras.ui.theme.generalCategoryColor2
import com.nicolascristaldo.tabupalabras.ui.theme.historyCategoryColor1
import com.nicolascristaldo.tabupalabras.ui.theme.historyCategoryColor2
import com.nicolascristaldo.tabupalabras.ui.theme.entertainmentCategoryColor1
import com.nicolascristaldo.tabupalabras.ui.theme.entertainmentCategoryColor2
import com.nicolascristaldo.tabupalabras.ui.theme.musicCategoryColor1
import com.nicolascristaldo.tabupalabras.ui.theme.musicCategoryColor2
import com.nicolascristaldo.tabupalabras.ui.theme.professionsCategoryColor1
import com.nicolascristaldo.tabupalabras.ui.theme.professionsCategoryColor2
import com.nicolascristaldo.tabupalabras.ui.theme.sportsCategoryColor1
import com.nicolascristaldo.tabupalabras.ui.theme.sportsCategoryColor2

class CategoriesProvider {
    private val categories = listOf(
        TabuCategory(
            name = "General",
            colors = listOf(generalCategoryColor1, generalCategoryColor2),
            emoji = "\uD83C\uDF0E"
        ),
        TabuCategory(
            name= "Animales",
            colors = listOf(animalsCategoryColor1, animalsCategoryColor2),
            emoji = "\uD83D\uDC36"
        ),
        TabuCategory(
            name = "Comidas",
            colors = listOf(foodCategoryColor1, foodCategoryColor2),
            emoji = "\uD83C\uDF54"
        ),
        TabuCategory(
            name = "Películas y series",
            colors = listOf(entertainmentCategoryColor1, entertainmentCategoryColor2)
            , emoji = "\uD83C\uDF7F"
        ),
        TabuCategory(
            name = "Argentina",
            colors = listOf(argentinaCategoryColor1, argentinaCategoryColor2),
            emoji = "\uD83C\uDDE6\uD83C\uDDF7"
        ),
        TabuCategory(
            name = "Deportes",
            colors = listOf(sportsCategoryColor1, sportsCategoryColor2),
            emoji = "\uD83C\uDFC0"
        ),
        TabuCategory(
            name = "Profesiones",
            colors = listOf(professionsCategoryColor1, professionsCategoryColor2),
            emoji = "\uD83D\uDCBC"
        ),
        TabuCategory(
            name = "Acciones",
            colors = listOf(actionsCategoryColor1, actionsCategoryColor2),
            emoji = "\uD83C\uDFC3\u200D➡\uFE0F"
        ),
        TabuCategory(
            name = "Historia",
            colors = listOf(historyCategoryColor1, historyCategoryColor2),
            emoji = "\uD83D\uDCDC"
        ),
        TabuCategory(
            name = "Música",
            colors = listOf(musicCategoryColor1, musicCategoryColor2),
            emoji = "\uD83C\uDFB5"
        )
    )
    fun getCategories(): List<TabuCategory> = categories

    fun getCategory(name: String): TabuCategory? = categories.find { it.name == name }
}