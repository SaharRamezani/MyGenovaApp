package com.example.mygenova.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class RecommendedPlace(
    val id: Int,
    @StringRes val titleResourceId: Int,
    @StringRes val subtitleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val placesImageBanner: Int,
    @StringRes val placeDetails: Int
)

//data class Category(
//    val id: Int,
//    @StringRes val titleResourceId: Int,
//    @DrawableRes val imageResourceId: Int,
//)