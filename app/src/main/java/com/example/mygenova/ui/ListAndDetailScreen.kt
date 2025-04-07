package com.example.mygenova.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mygenova.data.LocalGenovaDataProvider
import com.example.mygenova.model.RecommendedPlace

@Composable
fun ListAndDetailScreen() {
    val places = remember { LocalGenovaDataProvider.getCoffeeShops() } // or load all categories
    var selectedPlace by remember { mutableStateOf(places.first()) }

    Row(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            PlacesListScreen(
                places = places,
                onPlaceClick = { selectedPlace = it }
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier
                .weight(2f)
                .fillMaxHeight()
        ) {
            PlaceDetailScreen(place = selectedPlace)
        }
    }
}
