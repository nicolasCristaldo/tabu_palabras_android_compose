package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite

@Composable
fun ConfigTopAppBar(
    title: String,
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        IconButton(
            onClick = { navigateBack() },
            modifier = Modifier.align(Alignment.Start)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "back",
                modifier = Modifier.size(40.dp)
            )
        }

        Text(
            text = "Categoría: $title",
            style = MaterialTheme.typography.displaySmall,
            textAlign = TextAlign.Center,
            color = textWhite,
            modifier = Modifier.fillMaxWidth()
        )
    }
}
