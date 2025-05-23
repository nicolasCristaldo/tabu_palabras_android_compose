package com.nicolascristaldo.tabupalabras.ui.theme

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

fun Modifier.linearGradientBackground(
    startColor: Color,
    endColor: Color
): Modifier {
    return this.background(
        brush = Brush.linearGradient(
            colors = listOf(startColor, endColor),
            start = Offset(0f, 0f),
            end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
        )
    )
}

fun Modifier.verticalGradientBackground(
    startColor: Color,
    endColor: Color
): Modifier {
    return this.background(
        brush = Brush.verticalGradient(
            colors = listOf(startColor, endColor),
            startY = 0f,
            endY = Float.POSITIVE_INFINITY
        )
    )
}