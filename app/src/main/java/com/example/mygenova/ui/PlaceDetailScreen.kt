package com.example.mygenova.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mygenova.model.RecommendedPlace

@Composable
fun PlaceDetailScreen(place: RecommendedPlace) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(place.imageResId),
            contentDescription = place.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        )
        Text(
            text = place.name,
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = place.description,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
