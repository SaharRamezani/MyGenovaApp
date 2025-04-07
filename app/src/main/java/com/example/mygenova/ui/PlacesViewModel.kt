package com.example.mygenova.ui

import androidx.lifecycle.ViewModel
import com.example.mygenova.data.LocalGenovaDataProvider
import com.example.mygenova.model.RecommendedPlace
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

enum class PlaceCategory {
    CoffeeShops, Restaurants, KidFriendly, Parks, Shopping
}

data class RecommendedPlacesUiState(
    val category: PlaceCategory? = null,
    val RecommendedPlacesList: List<RecommendedPlace> = emptyList(),
    val currentRecommendedPlace: RecommendedPlace = LocalGenovaDataProvider.defaultPlace,
    val isShowingListPage: Boolean = true
)

class RecommendedPlacesViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        RecommendedPlacesUiState()
    )
    val uiState: StateFlow<RecommendedPlacesUiState> = _uiState


    fun updateCurrentRecommendedPlace(selectedRecommendedPlace: RecommendedPlace) {
        _uiState.update {
            it.copy(currentRecommendedPlace = selectedRecommendedPlace)
        }
    }

    fun selectCategory(category: PlaceCategory?) {
        if (category == null) {
            _uiState.update {
                RecommendedPlacesUiState()
            }
            return
        }

        val places = when (category) {
            PlaceCategory.CoffeeShops -> LocalGenovaDataProvider.getCoffeeShops()
            PlaceCategory.Restaurants -> LocalGenovaDataProvider.getRestaurants()
            PlaceCategory.KidFriendly -> LocalGenovaDataProvider.getKidFriendlyPlaces()
            PlaceCategory.Parks -> LocalGenovaDataProvider.getParks()
            PlaceCategory.Shopping -> LocalGenovaDataProvider.getShops()
        }

        _uiState.update {
            it.copy(
                category = category,
                RecommendedPlacesList = places,
                currentRecommendedPlace = places.getOrElse(0) { LocalGenovaDataProvider.defaultPlace },
                isShowingListPage = true
            )
        }
    }


    fun navigateToListPage() {
        _uiState.update {
            it.copy(isShowingListPage = true)
        }
    }

    fun navigateToDetailPage() {
        _uiState.update {
            it.copy(isShowingListPage = false)
        }
    }
}
