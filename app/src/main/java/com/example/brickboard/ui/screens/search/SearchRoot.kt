package com.example.brickboard.ui.screens.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.brickboard.ui.theme.BrickboardTheme

@Composable
fun SearchRoot(
    paddingValues: PaddingValues = PaddingValues(8.dp)
){
    Column(
        modifier = Modifier.padding(paddingValues)
    ) {
        Text(
            text = "Themes",
            style = BrickboardTheme.typography.title1,
            color = BrickboardTheme.colours.primary,
            modifier = Modifier.padding(start = 8.dp, top = 8.dp)
        )
    }
}