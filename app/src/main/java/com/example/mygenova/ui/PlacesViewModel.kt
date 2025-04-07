package com.example.mygenova.ui

import androidx.lifecycle.ViewModel
import com.example.mygenova.data.LocalGenovaDataProvider
import com.example.mygenova.model.RecommendedPlace
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class RecommendedPlacesViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        RecommendedPlacesUiState(
            RecommendedPlacesList = LocalGenovaDataProvider.getShops(),
            currentRecommendedPlace = LocalGenovaDataProvider.getShops().getOrElse(0) {
                LocalGenovaDataProvider.defaultPlace
            }
        )
    )
    val uiState: StateFlow<RecommendedPlacesUiState> = _uiState

    fun updateCurrentRecommendedPlace(selectedRecommendedPlace: RecommendedPlace) {
        _uiState.update {
            it.copy(currentRecommendedPlace = selectedRecommendedPlace)
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

data class RecommendedPlacesUiState(
    val RecommendedPlacesList: List<RecommendedPlace> = emptyList(),
    val currentRecommendedPlace: RecommendedPlace = LocalGenovaDataProvider.defaultPlace,
    val isShowingListPage: Boolean = true
)