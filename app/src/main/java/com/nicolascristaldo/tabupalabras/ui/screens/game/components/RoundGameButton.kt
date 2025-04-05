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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nicolascristaldo.tabupalabras.R
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
            defaultElevation = dimensionResource(R.dimen.game_button_elevation_default),
            pressedElevation = dimensionResource(R.dimen.game_button_elevation_pressed)
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = textWhite
        ),
        contentPadding = PaddingValues(0.dp),
        modifier = modifier.size(dimensionResource(R.dimen.game_button_size))
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(dimensionResource(R.dimen.game_button_icon_size))
        )
    }
}