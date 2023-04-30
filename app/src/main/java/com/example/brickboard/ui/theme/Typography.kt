package com.example.brickboard.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.brickboard.R

val sora = Font(R.font.sora, FontWeight.Normal)
val soraSemiBold = Font(R.font.sora_semibold, FontWeight.SemiBold)

val soraFontFamily = FontFamily(listOf(sora, soraSemiBold))

@Immutable
data class BrickboardTypography(
    val alarmTitle: TextStyle,
    val largeTitle: TextStyle,
    val title1: TextStyle,
    val title2: TextStyle,
    val title3: TextStyle,
    val headline: TextStyle,
    val body: TextStyle,
    val callout: TextStyle,
    val subHead: TextStyle,
    val footnote: TextStyle
)

// Set of Material typography styles to start with
val Typography = BrickboardTypography(
    alarmTitle = TextStyle(
        fontSize = 34.sp,
        fontFamily = soraFontFamily,
        fontWeight = soraSemiBold.weight
    ),
    largeTitle = TextStyle(
        fontSize = 34.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    title1 = TextStyle(
        fontSize = 28.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    title2 = TextStyle(
        fontSize = 22.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    title3 = TextStyle(
        fontSize = 20.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    headline = TextStyle(
        fontSize = 17.sp,
        fontFamily = soraFontFamily,
        fontWeight = soraSemiBold.weight
    ),
    body = TextStyle(
        fontSize = 17.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    callout = TextStyle(
        fontSize = 16.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    subHead = TextStyle(
        fontSize = 15.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    footnote = TextStyle(
        fontSize = 13.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    )
)