package com.example.brickboard.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.brickboard.R
import com.example.brickboard.ui.theme.BrickboardTheme
import com.example.brickboard.ui.theme.brickBoardBackground
import com.example.brickboard.ui.theme.onBrickBoardBackground

@Composable
fun SearchTopAppBar(){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 32.dp, bottom = 20.dp)) {
        Row{
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                Row(horizontalArrangement = Arrangement.Start) {
                    Text(text = "Search", style = BrickboardTheme.typography.title1)
                }
                SearchFrame()
            }
        }
    }
}

@Composable
fun SearchFrame(
    inputReady :Boolean = false,
    onClick: () -> Unit = {}
){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(4.dp))
        .background(brickBoardBackground)
        .clickable(
            enabled = inputReady,
            onClick = onClick
        )
    ){
            Row(
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.search_icon),
                    contentDescription = "search bar",
                    tint = onBrickBoardBackground
                )
            }

    }
}

@Preview(
    showBackground = true
)
@Composable
fun SearchTopAppBarPreview() {
    BrickboardTheme {
        SearchTopAppBar()
    }
}