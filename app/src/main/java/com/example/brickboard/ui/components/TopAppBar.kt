package com.example.brickboard.ui.components

import android.content.res.Configuration
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.brickboard.R
import com.example.brickboard.ui.theme.BrickboardTheme
import com.example.brickboard.ui.theme.accent40
import com.example.brickboard.ui.theme.brickBoardBackground

@Composable
fun SearchTopAppBar(){
    BbSurface(
        modifier = Modifier
            .fillMaxWidth()
            .background(BrickboardTheme.colours.surface)
            .padding(start = 10.dp, end = 10.dp, top = 32.dp, bottom = 20.dp)
    ) {
        val contentColor = BrickboardTheme.colours.onSurface
        Row{
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                Row(horizontalArrangement = Arrangement.Start) {
                    Text(
                        text = "Search",
                        style = BrickboardTheme.typography.title1,
                        color = contentColor
                        )
                }
                SearchFrame()
            }
        }
    }
}

@Composable
fun SearchFrame(
    inputReady :Boolean = false,
    onClick: () -> Unit = {},
){
    val iconTint = if(BrickboardTheme.colours.background == brickBoardBackground) BrickboardTheme.colours.onBackground else accent40
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(4.dp))
        .background(BrickboardTheme.colours.background)
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
                    painter = painterResource(id = R.drawable.icon_search),
                    contentDescription = "search bar",
                    tint = if (inputReady) BrickboardTheme.colours.onBackground else iconTint
                )
            }

    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun SearchTopAppBarPreview() {
    BrickboardTheme {
        SearchTopAppBar()
    }
}