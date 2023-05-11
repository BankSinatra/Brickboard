package com.example.brickboard.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.brickboard.R
import com.example.brickboard.ui.theme.BrickboardTheme
import com.example.brickboard.utils.stringToHSLColor

@Composable
fun ThemeGridItem(
    title: String,
    @DrawableRes imageResource: Int,
    onClick : () -> Unit = {}
){
    val colourLong = stringToHSLColor(title)
    Box(
        modifier = Modifier
            .clickable(onClick = onClick)
            .size(160.dp, 110.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(colourLong).copy(alpha = 0.7f))

        )
        Text(
            text = title,
            color = Color.White,
            style = BrickboardTheme.typography.headline,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 16.dp)

        )
    }
}

@Preview
@Composable
fun ThemeGridItemPreview(){
    BrickboardTheme() {
        ThemeGridItem(
            title = "Star Wars™",
            imageResource = R.drawable.themeicon_starwars
        )
    }
}