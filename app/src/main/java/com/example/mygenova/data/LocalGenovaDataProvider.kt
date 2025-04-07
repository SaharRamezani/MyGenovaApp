package com.example.mygenova.data

import com.example.mygenova.R
import com.example.mygenova.model.RecommendedPlace

object LocalGenovaDataProvider {

    val defaultPlace = getShops()[0]

    fun getShops(): List<RecommendedPlace> {
        return listOf(
            RecommendedPlace(
                id = 1,
                titleResourceId = R.string.coffee_tazze_pazze_title,
                subtitleResourceId = R.string.coffee_tazze_pazze_subtitle,
                imageResourceId = R.drawable.tazze_pazze,
                placesImageBanner = R.drawable.tazze_pazze,
                placeDetails = R.string.coffee_tazze_pazze_details
            ),
            RecommendedPlace(
                id = 2,
                titleResourceId = R.string.coffee_ostello_bello_title,
                subtitleResourceId = R.string.coffee_ostello_bello_subtitle,
                imageResourceId = R.drawable.ostello_bello,
                placesImageBanner = R.drawable.ostello_bello,
                placeDetails = R.string.coffee_ostello_bello_details
            ),
            RecommendedPlace(
                id = 3,
                titleResourceId = R.string.coffee_cafe_frida_title,
                subtitleResourceId = R.string.coffee_cafe_frida_subtitle,
                imageResourceId = R.drawable.cafe_frida,
                placesImageBanner = R.drawable.cafe_frida,
                placeDetails = R.string.coffee_cafe_frida_details
            ),
            RecommendedPlace(
                id = 4,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            ),
        )
    }
}

