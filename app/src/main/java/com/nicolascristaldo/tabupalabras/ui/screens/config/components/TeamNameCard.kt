package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite

@Composable
fun TeamNameCard(
    name: String,
    color: Color,
    onEditClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = { onEditClick() },
        colors = CardDefaults.cardColors(
            containerColor = color
        ),
        shape = RoundedCornerShape(50.dp),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Edit,
                contentDescription = "edit",
                tint = textWhite,
                modifier = Modifier
                    .size(50.dp)
                    .align(Alignment.CenterStart)
            )

            Text(
                text = name,
                color = textWhite,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}