package com.example.brickboard

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import com.example.brickboard.destinations.BottomNavDestination
import com.example.brickboard.ui.components.BottomNavigationBar
import com.example.brickboard.ui.theme.BrickboardTheme
import org.junit.Rule
import org.junit.Test

class NavigationBarTest {
    @get: Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testNavBarFocus() {
        composeTestRule.setContent {
            BrickboardTheme {
                var state:BottomNavDestination by remember { mutableStateOf(BottomNavDestination.SearchNavItem)}
                BottomNavigationBar(
                    navDestinations = listOf(
                        BottomNavDestination.SearchNavItem,
                        BottomNavDestination.CollectionNavItem,
                        BottomNavDestination.ProfileNavItem),
                    onTabSelected = {
                                    state = it
                    },
                    currentTab = state,
                    false
                )
            }
        }
        composeTestRule.onNodeWithContentDescription("Profile").performClick()
        composeTestRule.onNodeWithContentDescription("Profile").assertIsSelected()
        composeTestRule.onNodeWithContentDescription("Search").performClick()
        composeTestRule.onNodeWithContentDescription("Search").assertIsSelected()
        composeTestRule.onNodeWithContentDescription("Collection").performClick()
        composeTestRule.onNodeWithContentDescription("Collection").performClick()
        composeTestRule.onNodeWithContentDescription("Collection").assertIsSelected()
    }
}