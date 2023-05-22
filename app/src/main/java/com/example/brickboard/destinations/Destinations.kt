package com.example.brickboard.destinations

import androidx.annotation.DrawableRes
import com.example.brickboard.R

abstract class Destination(route: String){

}

sealed class BottomNavDestination(val route: String, val label: String, @DrawableRes val icon: Int): Destination(route){
    object SearchNavItem: BottomNavDestination("search", "Search", R.drawable.search_tab_icon)
    object CollectionNavItem: BottomNavDestination("collection", "Collection", R.drawable.icon_collections)
    object ProfileNavItem: BottomNavDestination("profile", "Profile", R.drawable.icon_profile)
}