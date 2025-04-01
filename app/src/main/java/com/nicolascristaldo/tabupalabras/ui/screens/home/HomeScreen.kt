package com.nicolascristaldo.tabupalabras.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.data.providers.CategoriesProvider
import com.nicolascristaldo.tabupalabras.domain.model.TabuCategory
import com.nicolascristaldo.tabupalabras.ui.theme.categoryCardBackGround
import com.nicolascristaldo.tabupalabras.ui.viewmodels.TabuViewModel

@Composable
fun HomeScreen(
    viewModel: TabuViewModel,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsState()
    val categories = CategoriesProvider().getCategories()

    LaunchedEffect(uiState.currentScreen) {
        if (uiState.currentScreen != AppDestinations.Home) {
            navController.navigate(uiState.currentScreen.route)
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        HomeHeader(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {
            items(categories.size) { index ->
                val category = categories[index]
                CategoryCard(
                    category = category,
                    onClick = { viewModel.onCategorySelected(category) },
                    modifier = Modifier
                        .padding(8.dp)
                        .height(170.dp)
                        .fillMaxWidth()
                )
            }
        }
    }
}

@Composable
fun HomeHeader(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier.size(170.dp)
        )
        Text(
            text = "Tabú palabras",
            fontSize = 38.sp,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
fun CategoryCard(
    category: TabuCategory,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = { onClick() },
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .categoryCardBackGround(
                    startColor = category.colors[0],
                    endColor = category.colors[1]
                )
        ) {
            Text(
                text = category.emoji,
                fontSize = 36.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxWidth()
            )
            Text(
                text = category.name,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)
                    .fillMaxWidth()
            )
        }
    }
}
