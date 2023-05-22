package com.example.brickboard.ui.components

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
import androidx.compose.ui.unit.dp
import com.example.brickboard.repository.LegoTheme
import com.example.brickboard.ui.theme.BrickboardTheme
import com.example.brickboard.utils.stringToTint

@Composable
fun ThemeGridItem(
    theme: LegoTheme,
    onClick: () -> Unit = {}
){
    val colourLong = theme.tint ?: stringToTint(theme.name)
    Box(
        modifier = Modifier
            .size(160.dp, 110.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable(onClick = onClick)
    ) {
        Image(
            painter = painterResource(id = theme.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(colourLong.hex).copy(alpha = 0.7f))

        )
        Text(
            text = theme.name,
            color = Color.White,
            style = BrickboardTheme.typography.headline,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 16.dp)

        )
    }
}