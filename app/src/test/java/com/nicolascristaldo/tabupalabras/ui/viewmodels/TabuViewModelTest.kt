package com.nicolascristaldo.tabupalabras.ui.viewmodels

import androidx.compose.ui.graphics.Color
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.data.providers.CardsProvider
import com.nicolascristaldo.tabupalabras.domain.model.TabuCard
import com.nicolascristaldo.tabupalabras.domain.model.TabuCategory
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class TabuViewModelTest {
    private lateinit var cardsProvider: CardsProvider
    private lateinit var viewModel: TabuViewModel

    @Before
    fun onBefore() {
        cardsProvider = mockk<CardsProvider>()
        Dispatchers.setMain(Dispatchers.Unconfined)
        viewModel = TabuViewModel(cardsProvider)
    }

    @After
    fun onAfter() {
        Dispatchers.resetMain()
    }

    @Test
    fun `onCategorySelected updates categorySelected and currentScreen`() {
        //given
        val category = TabuCategory(
            name = "General",
            colors = listOf(Color.Red),
            emoji = "\uD83C\uDF0E"
        )

        //when
        viewModel.onCategorySelected(category)

        //then
        assertEquals(category, viewModel.uiState.value.categorySelected)
        assertEquals(AppDestinations.Config, viewModel.uiState.value.currentScreen)
    }

    @Test
    fun `setTeamNames updates team names in uiState`() {
        //given
        val team1Name = "Team 1"
        val team2Name = "Team 2"

        //when
        viewModel.setTeamNames(team1Name, team2Name)

        //then
        assertEquals(team1Name, viewModel.uiState.value.team1.name)
        assertEquals(team2Name, viewModel.uiState.value.team2.name)
    }

    @Test
    fun `setRounds updates rounds in uiState`() {
        //given
        val rounds = 3

        //when
        viewModel.setRounds(rounds)

        //then
        assertEquals(rounds, viewModel.uiState.value.rounds)
    }

    @Test
    fun `setMinutes updates minutesPerRound and timeLeft`() {
        //given
        val minutes = 2
        val time = minutes * 60

        //when
        viewModel.setMinutes(minutes)

        //then
        assertEquals(minutes, viewModel.uiState.value.minutesPerRound)
        assertEquals(time, viewModel.uiState.value.timeLeft)
    }

    @Test
    fun `startGame updates availableCards, currentCard, currentScreen, currentRound, currentTeam, turnsPlayedInRound, timeLeft and isPlaying`() = runTest {
        //given
        val cards = listOf(
            TabuCard("Lámpara", "General", listOf("Luz", "Bombilla", "Encender", "Mesa", "Iluminar")),
            TabuCard("Puente", "General", listOf("Río", "Cruz", "Estructura", "Conectar", "Caminar")),
            TabuCard("Espejo", "General", listOf("Reflejo", "Cristal", "Imagen", "Baño", "Ver"))
        )
        val category = TabuCategory(
            name = "General",
            colors = listOf(Color.Red),
            emoji = "\uD83C\uDF0E"
        )

        every { cardsProvider.getCardsByCategory("General") } returns cards

        viewModel.onCategorySelected(category)
        viewModel.setRounds(1)
        viewModel.setMinutes(2)

        //when
        viewModel.startGame()

        //then
        with(viewModel.uiState.value) {
            assertEquals(cards, availableCards)
            assertEquals(cards.firstOrNull(), currentCard)
            assertEquals(AppDestinations.Game, currentScreen)
            assertEquals(1, currentRound)
            assertEquals(1, currentTeam)
            assertEquals(0, turnsPlayedInRound)
            assertEquals(120, timeLeft)
            assertEquals(false, isPlaying)
        }
    }

    @Test
    fun `nextCard updates availableCards, currentCard, team1 and team2`() = runTest {
        //given
        val cards = listOf(
            TabuCard("Lámpara", "General", listOf("Luz", "Bombilla", "Encender", "Mesa", "Iluminar")),
            TabuCard("Puente", "General", listOf("Río", "Cruz", "Estructura", "Conectar", "Caminar")),
            TabuCard("Espejo", "General", listOf("Reflejo", "Cristal", "Imagen", "Baño", "Ver")),
            TabuCard("Silla", "General", listOf("Sentar", "Mueble", "Respaldo", "Mesa", "Asiento")),
            TabuCard("Escalera", "General", listOf("Subir", "Bajar", "Peldaños", "Altura", "Edificio")),
            TabuCard("Teclado", "General", listOf("Escribir", "Ordenador", "Letras", "Botones", "Computadora"))
        )
        val category = TabuCategory(
            name = "General",
            colors = listOf(Color.Red),
            emoji = "\uD83C\uDF0E"
        )

        every { cardsProvider.getCardsByCategory("General") } returns cards

        viewModel.onCategorySelected(category)
        viewModel.setRounds(1)
        viewModel.setMinutes(2)
        viewModel.startGame()

        //when
        viewModel.nextCard(true)
        viewModel.nextCard(false)
        viewModel.nextCard(null)

        //then
        with(viewModel.uiState.value) {
            assertEquals(cards.drop(3), availableCards)
            assertEquals(cards.drop(3).firstOrNull(), currentCard)
            assertEquals(1, team1.score)
            assertEquals(1, team1.errors)
            assertEquals(4, team1.totalWords)
            assertEquals(0, team2.score)
            assertEquals(0, team2.errors)
            assertEquals(1, team2.totalWords)
        }
    }

    @Test
    fun `nextCard reloads cards when availableCards is empty`() = runTest {
        //given
        val cards = listOf(
            TabuCard("Lámpara", "General", listOf("Luz", "Bombilla", "Encender", "Mesa", "Iluminar"))
        )
        val newCards = listOf(
            TabuCard("Puente", "General", listOf("Río", "Cruz", "Estructura", "Conectar", "Caminar"))
        )
        val category = TabuCategory(
            name = "General",
            colors = listOf(Color.Red),
            emoji = "\uD83C\uDF0E"
        )

        every { cardsProvider.getCardsByCategory("General") } returnsMany listOf(cards, newCards)

        viewModel.onCategorySelected(category)
        viewModel.startGame()
        viewModel.nextCard(true)

        //when
        viewModel.nextCard(null)

        //then
        with(viewModel.uiState.value) {
            assertEquals(newCards, availableCards)
            assertEquals(newCards.firstOrNull(), currentCard)
        }
    }

    @Test
    fun `resetGame updates currentScreen, categorySelected, isPlaying, currentRound, currentTeam, turnsPlayedInRound, timeLeft, availableCards and currentCard`() = runTest {
        //given
        val cards = listOf(
            TabuCard("Lámpara", "General", listOf("Luz", "Bombilla", "Encender", "Mesa", "Iluminar")),
         )
        val category = TabuCategory(
            name = "General",
            colors = listOf(Color.Red),
            emoji = "\uD83C\uDF0E"
        )

        every { cardsProvider.getCardsByCategory("General") } returns cards

        viewModel.onCategorySelected(category)
        viewModel.setRounds(1)
        viewModel.setMinutes(2)
        viewModel.startGame()

        //when
        viewModel.resetGame()

        //then
        with(viewModel.uiState.value) {
            assertEquals(AppDestinations.Home, currentScreen)
            assertEquals(null, categorySelected)
            assertEquals(false, isPlaying)
            assertEquals(1, currentRound)
            assertEquals(1, currentTeam)
            assertEquals(0, turnsPlayedInRound)
            assertEquals(120, timeLeft)
            assertEquals(emptyList<TabuCard>(), availableCards)
            assertEquals(null, currentCard)
        }
    }

    @Test
    fun `resetScore updates team1, team2 and winner`() {
        //given
        val cards = listOf(
            TabuCard("Lámpara", "General", listOf("Luz", "Bombilla", "Encender", "Mesa", "Iluminar")),
            TabuCard("Puente", "General", listOf("Río", "Cruz", "Estructura", "Conectar", "Caminar")),
            TabuCard("Espejo", "General", listOf("Reflejo", "Cristal", "Imagen", "Baño", "Ver")),
            TabuCard("Silla", "General", listOf("Sentar", "Mueble", "Respaldo", "Mesa", "Asiento")),
            TabuCard("Escalera", "General", listOf("Subir", "Bajar", "Peldaños", "Altura", "Edificio")),
            TabuCard("Teclado", "General", listOf("Escribir", "Ordenador", "Letras", "Botones", "Computadora")),
            TabuCard("Silla", "General", listOf("Sentar", "Mueble", "Respaldo", "Mesa", "Asiento")),
            TabuCard("Escalera", "General", listOf("Subir", "Bajar", "Peldaños", "Altura", "Edificio")),
            TabuCard("Teclado", "General", listOf("Escribir", "Ordenador", "Letras", "Botones", "Computadora")),
            TabuCard("Silla", "General", listOf("Sentar", "Mueble", "Respaldo", "Mesa", "Asiento")),
        )
        val category = TabuCategory(
            name = "General",
            colors = listOf(Color.Red),
            emoji = "\uD83C\uDF0E"
        )

        every { cardsProvider.getCardsByCategory("General") } returns cards

        //when
        viewModel.onCategorySelected(category)
        viewModel.setRounds(1)
        viewModel.setMinutes(1)
        viewModel.startGame()
        viewModel.startTimer()
        viewModel.nextCard(true)
        viewModel.nextCard(false)
        viewModel.nextCard(null)

        //then
        with(viewModel.uiState.value) {
            assertEquals(cards.drop(3), availableCards)
            assertEquals(cards.drop(3).firstOrNull(), currentCard)
            assertEquals(1, team1.score)
            assertEquals(1, team1.errors)
            assertEquals(4, team1.totalWords)
            assertEquals(0, team2.score)
            assertEquals(0, team2.errors)
            assertEquals(1, team2.totalWords)
        }
    }
}