package com.nicolascristaldo.tabupalabras.ui.screens.game.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.domain.model.TabuCard
import com.nicolascristaldo.tabupalabras.ui.theme.cardBackGroundColor
import com.nicolascristaldo.tabupalabras.ui.theme.cardTitleBackGroundColor1
import com.nicolascristaldo.tabupalabras.ui.theme.cardTitleBackGroundColor2
import com.nicolascristaldo.tabupalabras.ui.theme.linearGradientBackground
import com.nicolascristaldo.tabupalabras.ui.theme.textBlack
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite

@Composable
fun GameCard(
    card: TabuCard,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(32.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = dimensionResource(R.dimen.card_elevation_default)),
        colors = CardDefaults.cardColors(containerColor = cardBackGroundColor),
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
                    .linearGradientBackground(
                        startColor = cardTitleBackGroundColor1,
                        endColor = cardTitleBackGroundColor2
                    )
            ) {
                Text(
                    text = card.word,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.displayMedium,
                    color = textWhite,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            card.forbiddenWords.forEach { forbiddenWord ->
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(7f / card.forbiddenWords.size)
                ) {
                    Text(
                        text = forbiddenWord.uppercase(),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleLarge,
                        color = textBlack,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}