package com.example.brickboard.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

private val lightColourPalette = lightColors(
    primary = brickBoardBlue,
    secondary = brickBoardRed,
    onPrimary = onBrickBoardBlue,
    onSecondary = onBrickBoardRed,
    surface = brickBoardSurface,
    onSurface = brickBoardSurface,
    background = brickBoardBackground,
    onBackground = onBrickBoardBackground
)

val LocalReplacementTypography = staticCompositionLocalOf {
    BrickboardTypography
}

@Composable
fun BrickboardTheme(
    content: @Composable () -> Unit
) {
    val replacementTypography = BrickboardTypography
    CompositionLocalProvider(
        LocalReplacementTypography provides replacementTypography
    ) {
        MaterialTheme(
            content = content,
            colors = lightColourPalette
        )
    }
}

object BrickboardTheme {
    val typography: CustomTypography
        @Composable
        get() = LocalReplacementTypography.current
}