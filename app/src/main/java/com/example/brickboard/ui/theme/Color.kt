package com.example.brickboard.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

val brickBoardBlue = Color(0xFF1B60D1)
val darkBrickBoarBlue = Color(0xFF7594C7)
val onBrickBoardBlue = Color(0xFFFFFFFF)
val brickBoardRed = Color(0xFFFF4E33)
val onBrickBoardRed = Color(0xFFFFFFFF)

val accent60 = Color(0xFF262A2C)
val accent50 = Color(0xFF4B5358)
val accent40 = Color(0xFF717D84)
val accent30 = Color(0xFF9CA5AB)
val accent20 = Color(0xFFC8CDD0)
val accent10 = Color(0xFFE4E5E9)

val brickBoardBackground = Color(0xFFF1F5F9)
val onBrickBoardBackground = Color(0xFF010915)
val brickBoardSurface = Color(0xFFFFFFFF)
val onBrickBoardSurface = Color(0xFF000000)

val brickBoardDarkBackground = Color(0xFF161314)
val onBrickBoardDarkBackground = Color(0xFFFFFFFF)
val brickBoardDarkSurface = Color(0xFF262628)
val onBrickBoardDarkSurface = Color(0xFFFFFFFF)

class BrickboardColours(
    primary: Color,
    primaryVariant: Color,
    secondary: Color,
    background: Color,
    surface: Color,
    onPrimary: Color,
    onSecondary: Color,
    onBackground: Color,
    onSurface: Color,
    isLight: Boolean
){
    var primary by mutableStateOf(primary)
        internal set
    var primaryVariant by mutableStateOf(primaryVariant)
        internal set
    var secondary by mutableStateOf(secondary)
        internal set
    var background by mutableStateOf(background)
        internal set
    var surface by mutableStateOf(surface)
        internal set
    var onPrimary by mutableStateOf(onPrimary)
        internal set
    var onSecondary by mutableStateOf(onSecondary)
        internal set
    var onBackground by mutableStateOf(onBackground)
        internal set
    var onSurface by mutableStateOf(onSurface)
        internal set
    var isLight by mutableStateOf(isLight)
        internal set

    fun copy(
        primary: Color = this.primary,
        primaryVariant: Color = this.primaryVariant,
        secondary: Color = this.secondary,
        background: Color = this.background,
        surface: Color = this.surface,
        onPrimary : Color = this.onPrimary,
        onSecondary : Color = this.onSecondary,
        onBackground: Color = this.onBackground,
        onSurface: Color = this.onSurface,
        isLight: Boolean = this.isLight,
    ) = BrickboardColours(
        primary,
        primaryVariant,
        secondary,
        background,
        surface,
        onPrimary,
        onSecondary,
        onBackground,
        onSurface,
        isLight
    )
    fun updateColorsFrom(other: BrickboardColours) {
        primary = other.primary
        primaryVariant= other.primaryVariant
        secondary = other.secondary
        background = other.background
        surface= other.surface
        onPrimary = other.onPrimary
        onSecondary = other.onSecondary
        onBackground= other.onBackground
        onSurface= other.onSurface
        isLight = other.isLight
    }

}