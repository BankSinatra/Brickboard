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
    val alarmTitle: TextStyle = TextStyle(
        fontSize = 34.sp,
        fontFamily = soraFontFamily,
        fontWeight = soraSemiBold.weight
    ),
    val largeTitle: TextStyle = TextStyle(
        fontSize = 34.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    val title1: TextStyle = TextStyle(
        fontSize = 28.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    val title2: TextStyle = TextStyle(
        fontSize = 22.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    val title3: TextStyle = TextStyle(
        fontSize = 20.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    val headline: TextStyle = TextStyle(
        fontSize = 17.sp,
        fontFamily = soraFontFamily,
        fontWeight = soraSemiBold.weight
    ),
    val body: TextStyle = TextStyle(
        fontSize = 17.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    val callout: TextStyle = TextStyle(
        fontSize = 16.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    val subHead: TextStyle = TextStyle(
        fontSize = 15.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    ),
    val footnote: TextStyle = TextStyle(
        fontSize = 13.sp,
        fontFamily = soraFontFamily,
        fontWeight = sora.weight
    )
)