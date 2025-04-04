package com.nicolascristaldo.tabupalabras.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.nicolascristaldo.tabupalabras.R

val KosugiMaru = FontFamily(
    Font(R.font.kosugi_maru, FontWeight.Normal)
)

val SecularOne = FontFamily(
    Font(R.font.secular_one, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = SecularOne,
        fontWeight = FontWeight.Normal,
        fontSize = 46.sp,
        lineHeight = 48.sp
    ),
    displayMedium = TextStyle(
        fontFamily = SecularOne,
        fontWeight = FontWeight.Normal,
        fontSize = 38.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.5.sp
    ),
    displaySmall = TextStyle(
        fontFamily = SecularOne,
        fontWeight = FontWeight.Normal,
        fontSize = 34.sp,
        lineHeight = 32.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = KosugiMaru,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
        lineHeight = 32.sp
    ),
    titleLarge = TextStyle(
        fontFamily = KosugiMaru,
        fontWeight = FontWeight.Normal,
        fontSize = 26.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.5.sp
    ),
    titleMedium = TextStyle(
        fontFamily = SecularOne,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 24.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = KosugiMaru,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = KosugiMaru,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)