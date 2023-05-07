package com.example.brickboard.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.brickboard.destinations.BottomNavDestination
import com.example.brickboard.ui.theme.BrickboardTheme
import com.example.brickboard.ui.theme.accent30
import com.example.brickboard.ui.theme.accent40
import com.example.brickboard.ui.theme.brickBoardBlue
import com.example.brickboard.ui.theme.onBrickBoardDarkSurface

@Composable
fun BottomNavItem(
    navDestination: BottomNavDestination,
    selected: Boolean,
    onSelected: () -> Unit,
    darkTheme: Boolean = false
){
    val unselectedTint = if (darkTheme) accent40 else accent30
    val selectedTint = if (darkTheme) onBrickBoardDarkSurface else brickBoardBlue
    Column(
        modifier = Modifier
            .height(64.dp)
            .selectable(
                selected = selected,
                onClick = onSelected,
                role = Role.Tab,
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            )
            .clearAndSetSemantics { contentDescription = navDestination.label }
            .padding(top = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(id = navDestination.icon),
            contentDescription = navDestination.label,
            tint = if(selected) selectedTint  else unselectedTint
        )
        Text(
            text = navDestination.label,
            style = BrickboardTheme.typography.footnote,
            color = if(selected) selectedTint else unselectedTint
        )
    }
}

@Composable
fun BottomNavigationBar(
    navDestinations: List<BottomNavDestination>,
    onTabSelected: (BottomNavDestination) -> Unit,
    currentTab: BottomNavDestination,
    isDark: Boolean
){
    BbSurface(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth()
    ) {
        Row(
            Modifier.selectableGroup(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            navDestinations.forEach{bottomNavDestination ->
                BottomNavItem(
                    navDestination = bottomNavDestination,
                    selected = currentTab == bottomNavDestination,
                    onSelected = {onTabSelected(bottomNavDestination)},
                    isDark
                )
            }

        }
    }
}

@Preview(showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun BottomNavBarPreview() {
    BrickboardTheme {
        BottomNavigationBar(
            navDestinations = listOf(
                BottomNavDestination.SearchNavItem,
                BottomNavDestination.CollectionNavItem,
                BottomNavDestination.ProfileNavItem),
            onTabSelected = {},
            currentTab = BottomNavDestination.CollectionNavItem,
            isSystemInDarkTheme()
        )
    }
}