package com.example.brickboard.utils

import kotlin.math.abs

enum class Tint(val hex: Long){
    RED(0xF20D11),
    ORANGE(0xFA7D09),
    YELLOW(0xB0B40E),
    GREEN(0x50A909),
    BLUE(0x0B48E6),
    INDIGO(0x4B0082),
    VIOLET(0x8F00FF),
    BROWN(0x997D33),
    GREY(0x737373),
    PINK(0xCE6AF1),
}

fun stringToTint(string: String): Tint{
    val values = Tint.values()
    val hashCode = string.hashCode()
    val index = abs(hashCode) % values.size
    return values[index]
}