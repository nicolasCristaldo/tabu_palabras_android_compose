package com.nicolascristaldo.tabupalabras.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.navigation.NavController
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.data.destinations.AppDestinations
import com.nicolascristaldo.tabupalabras.data.providers.CategoriesProvider
import com.nicolascristaldo.tabupalabras.domain.model.TabuCategory
import com.nicolascristaldo.tabupalabras.ui.screens.home.components.CategoryCard
import com.nicolascristaldo.tabupalabras.ui.screens.home.components.HomeHeader

@Composable
fun HomeScreen(
    onCategorySelected: (TabuCategory) -> Unit,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val categories = CategoriesProvider().getCategories()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        HomeHeader(
            modifier = Modifier
                .padding(horizontal = dimensionResource(R.dimen.padding_medium))
                .fillMaxWidth()
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {
            items(categories.size) { index ->
                val category = categories[index]
                CategoryCard(
                    category = category,
                    onClick = {
                        onCategorySelected(category)
                        navController.navigate(AppDestinations.Config.route)
                    },
                    modifier = Modifier
                        .padding(dimensionResource(R.dimen.padding_small))
                        .height(dimensionResource(R.dimen.category_card_height))
                        .fillMaxWidth()
                )
            }
        }
    }
}