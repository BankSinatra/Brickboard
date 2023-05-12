package com.example.brickboard.repository

import androidx.annotation.DrawableRes
import com.example.brickboard.R

data class LegoTheme(
    val name: String,
    @DrawableRes val image: Int
)

val themeList: List<LegoTheme> =
    listOf(
        LegoTheme("Star Wars",
            R.drawable.themeicon_starwars
        )
    )