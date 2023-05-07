package com.example.brickboard.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

private fun lightPalette() = BrickboardColours(
    primary = brickBoardBlue,
    primaryVariant = darkBrickBoarBlue,
    secondary = brickBoardRed,
    onPrimary = onBrickBoardBlue,
    onSecondary = onBrickBoardRed,
    surface = brickBoardSurface,
    onSurface = onBrickBoardSurface,
    background = brickBoardBackground,
    onBackground = onBrickBoardBackground,
    isLight =  true
)

private fun darkPalette() = BrickboardColours(
    primary = brickBoardBlue,
    primaryVariant = darkBrickBoarBlue,
    secondary = brickBoardRed,
    onPrimary = onBrickBoardBlue,
    onSecondary = onBrickBoardRed,
    surface = brickBoardDarkSurface,
    onSurface = onBrickBoardDarkSurface,
    background = brickBoardDarkBackground,
    onBackground = onBrickBoardDarkBackground,
    isLight =  false
)

val LocalReplacementTypography = staticCompositionLocalOf {
    BrickboardTypography()
}

val LocalReplacementColours = compositionLocalOf {
    lightPalette()
}


@Composable
fun BrickboardTheme(
    typography: BrickboardTypography = BrickboardTheme.typography,
    colours: BrickboardColours = BrickboardTheme.colours,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val currentColor = remember { if (darkTheme) darkPalette() else colours }
    val rememberedColors = remember { currentColor.copy() }.apply { updateColorsFrom(currentColor) }

    CompositionLocalProvider(
        LocalReplacementColours provides rememberedColors,
        LocalReplacementTypography provides typography,
    ) {
        ProvideTextStyle(typography.body, content = content)
    }
}

object BrickboardTheme {
    val typography: BrickboardTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalReplacementTypography.current

    val colours: BrickboardColours
        @Composable
        @ReadOnlyComposable
        get() = LocalReplacementColours.current

}