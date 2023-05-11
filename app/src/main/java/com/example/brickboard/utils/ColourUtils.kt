package com.example.brickboard.utils

import java.util.Random
import kotlin.math.abs
import kotlin.math.roundToInt

fun stringToHSLColor(seedString: String): Long {
    // Create a random number generator using the string as a seed
    val random = Random(seedString.hashCode().toLong())

    // Generate random values for hue and saturation
    val hue = random.nextInt(360)
    val saturation = random.nextInt(101)

    // Generate a random lightness value between 0 and 67
    val lightness = random.nextInt(68)

    // Convert HSL values to RGB
    val h = hue / 60.0
    val s = saturation / 100.0
    val l = lightness / 100.0

    val c = (1 - abs(2 * l - 1)) * s
    val x = c * (1 - abs(h % 2 - 1))
    val m = l - c / 2

    var r = 0
    var g = 0
    var b = 0
    when {
        h < 1 -> {
            r = (255 * (c + m)).roundToInt()
            g = (255 * (x + m)).roundToInt()
        }
        h < 2 -> {
            r = (255 * (x + m)).roundToInt()
            g = (255 * (c + m)).roundToInt()
        }
        h < 3 -> {
            g = (255 * (c + m)).roundToInt()
            b = (255 * (x + m)).roundToInt()
        }
        h < 4 -> {
            g = (255 * (x + m)).roundToInt()
            b = (255 * (c + m)).roundToInt()
        }
        h < 5 -> {
            r = (255 * (x + m)).roundToInt()
            b = (255 * (c + m)).roundToInt()
        }
        else -> {
            r = (255 * (c + m)).roundToInt()
            b = (255 * (x + m)).roundToInt()
        }
    }

    // Convert RGB to hexadecimal string
    val hexColor = (r * 65536 + g * 256 + b)

    return hexColor.toLong()
}