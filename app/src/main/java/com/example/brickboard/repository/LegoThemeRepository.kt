package com.example.brickboard.repository

import androidx.annotation.DrawableRes
import com.example.brickboard.R
import com.example.brickboard.utils.Tint

data class LegoTheme(
    val name: String,
    @DrawableRes val image: Int,
    val tint: Tint? = null
)

val themeList: List<LegoTheme> =
    listOf(
        LegoTheme("Star Wars",
            R.drawable.themeicon_starwars,
            Tint.RED
        ),
        LegoTheme("City",
            R.drawable.themeicon_city,
            Tint.BLUE
        ),
        LegoTheme("Ideas",
            R.drawable.themeicon_ideas,
            Tint.GREEN
        ),
        LegoTheme("Marvel",
            R.drawable.themeicon_marvel,
            Tint.RED
        ),
        LegoTheme("Harry Potter",
            R.drawable.themeicon_harry_potter,
            Tint.BROWN
        ),
        LegoTheme("Friends",
            R.drawable.themeicon_friends,
            Tint.PINK
        ),
        LegoTheme("Disney",
            R.drawable.themeicon_disney,
            Tint.BLUE
        ),
        LegoTheme("Creator",
            R.drawable.themeicon_creator
        ),
        LegoTheme("Minecraft",
            R.drawable.themeicon_minecraft,
            Tint.GREEN
        ),
        LegoTheme("Ninjago",
            R.drawable.themeicon_ninjago,
            Tint.RED
        ),
        LegoTheme("Seasonal",
            R.drawable.themeicon_seasonal
        ),
        LegoTheme("Speed Champions",
            R.drawable.themeicon_speed_champions,
            Tint.GREY
        ),
        LegoTheme("Super Mario",
            R.drawable.themeicon_super_mario,
            Tint.RED
        ),
        LegoTheme("Technic",
            R.drawable.themeicon_technic
        ),
        LegoTheme("Monkie Kid",
            R.drawable.themeicon_monkie_kid,
            Tint.YELLOW
        ),
        LegoTheme("Icons",
            R.drawable.themeicon_icons
        ),
        LegoTheme("Architecture",
            R.drawable.themeicon_architecture,
            Tint.GREY
        ),
        LegoTheme("Art",
            R.drawable.themeicon_art
        ),
        LegoTheme("Classic",
            R.drawable.themeicon_classic,
            Tint.YELLOW
        ),
    )