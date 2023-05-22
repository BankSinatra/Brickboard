package com.example.brickboard.ui.screens.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.brickboard.repository.themeList
import com.example.brickboard.ui.components.ThemeGridItem
import com.example.brickboard.ui.theme.BrickboardTheme

@Composable
fun SearchRoot(
    paddingValues: PaddingValues = PaddingValues(8.dp)
){
    Column(
        modifier = Modifier.padding(paddingValues),
    ) {
        Text(
            text = "Themes",
            style = BrickboardTheme.typography.title1,
            color = BrickboardTheme.colours.primary,
            modifier = Modifier.padding(start = 8.dp, top = 8.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 160.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
        ){
            itemsIndexed(themeList){ _, theme ->
                ThemeGridItem(theme = theme)
            }
        }
    }
}