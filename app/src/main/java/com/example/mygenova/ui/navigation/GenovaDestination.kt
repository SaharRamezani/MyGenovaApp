package com.example.mygenova.ui.navigation

sealed class GenovaDestination(val route: String) {
    object CoffeeShops : GenovaDestination("coffee_shops")
    object Restaurants : GenovaDestination("restaurants")
    object Parks : GenovaDestination("parks")
    object Shopping : GenovaDestination("shopping")
    object KidFriendly : GenovaDestination("kid_friendly")
}