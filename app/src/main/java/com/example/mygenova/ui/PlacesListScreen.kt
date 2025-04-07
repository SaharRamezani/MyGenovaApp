package com.example.mygenova.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mygenova.model.RecommendedPlace

@Composable
fun PlacesListScreen(
    places: List<RecommendedPlace>,
    onPlaceClick: (RecommendedPlace) -> Unit
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(places) { place ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onPlaceClick(place) }
                    .padding(8.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(place.imageResId),
                        contentDescription = place.name,
                        modifier = Modifier.size(64.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Column {
                        Text(text = place.name, style = MaterialTheme.typography.titleMedium)
                        Text(text = place.description, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}
