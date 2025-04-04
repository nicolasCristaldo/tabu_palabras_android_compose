package com.nicolascristaldo.tabupalabras.ui.screens.game.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nicolascristaldo.tabupalabras.ui.theme.textWhite

@Composable
fun RoundGameButton(
    icon: Int,
    onClick: () -> Unit,
    color: Color,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { onClick() },
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 30.dp,
            pressedElevation = 45.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = textWhite
        ),
        contentPadding = PaddingValues(0.dp),
        modifier = modifier.size(75.dp)
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(55.dp)
        )
    }
}