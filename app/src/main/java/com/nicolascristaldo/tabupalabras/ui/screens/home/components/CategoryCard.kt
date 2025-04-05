package com.nicolascristaldo.tabupalabras.ui.screens.home.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.domain.model.TabuCategory
import com.nicolascristaldo.tabupalabras.ui.theme.linearGradientBackground
import com.nicolascristaldo.tabupalabras.ui.theme.textBlack

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
                .linearGradientBackground(
                    startColor = category.colors[0],
                    endColor = category.colors[1]
                )
        ) {
            Text(
                text = category.emoji,
                fontSize = dimensionResource(R.dimen.emoji_font_size).value.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxWidth()
            )
            Text(
                text = category.name,
                style = MaterialTheme.typography.titleMedium,
                color = textBlack,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(dimensionResource(R.dimen.padding_small))
                    .fillMaxWidth()
            )
        }
    }
}