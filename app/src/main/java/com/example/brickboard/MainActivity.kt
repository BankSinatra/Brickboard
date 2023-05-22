package com.example.brickboard

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.brickboard.destinations.BottomNavDestination
import com.example.brickboard.ui.components.BottomNavigationBar
import com.example.brickboard.ui.components.SearchTopAppBar
import com.example.brickboard.ui.screens.search.SearchRoot
import com.example.brickboard.ui.theme.BrickboardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BrickboardTheme {
                Scaffold(
                    topBar = {SearchTopAppBar()},
                    bottomBar = { BottomNavigationBar(
                        navDestinations = listOf(
                            BottomNavDestination.SearchNavItem,
                            BottomNavDestination.CollectionNavItem,
                            BottomNavDestination.ProfileNavItem),
                        onTabSelected = {},
                        currentTab = BottomNavDestination.SearchNavItem,
                        isSystemInDarkTheme()
                    )},
                    backgroundColor = BrickboardTheme.colours.background
                ){ innerPadding ->
                    SearchRoot(innerPadding)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun GreetingPreview() {
    BrickboardTheme {
        Greeting("Android")
    }
}