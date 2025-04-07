package com.example.mygenova.data

import com.example.mygenova.R
import com.example.mygenova.model.RecommendedPlace

object LocalGenovaDataProvider {

    val defaultPlace = getCoffeeShops()[0]

    fun getCoffeeShops(): List<RecommendedPlace> {
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
            )
        )
    }

    fun getRestaurants(): List<RecommendedPlace> {
        return listOf(
            RecommendedPlace(
                id = 4,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            ),
            RecommendedPlace(
                id = 5,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            ),
            RecommendedPlace(
                id = 6,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            )
        )
    }

    fun getKidFriendlyPlaces(): List<RecommendedPlace> {
        return listOf(
            RecommendedPlace(
                id = 7,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            ),
            RecommendedPlace(
                id = 8,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            ),
            RecommendedPlace(
                id = 9,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            )
        )
    }

    fun getParks(): List<RecommendedPlace> {
        return listOf(
            RecommendedPlace(
                id = 10,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            ),
            RecommendedPlace(
                id = 11,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            ),
            RecommendedPlace(
                id = 12,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            )
        )
    }

    fun getShops(): List<RecommendedPlace> {
        return listOf(
            RecommendedPlace(
                id = 13,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            ),
            RecommendedPlace(
                id = 14,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            ),
            RecommendedPlace(
                id = 15,
                titleResourceId = R.string.restaurant_rosmarino_title,
                subtitleResourceId = R.string.restaurant_rosmarino_subtitle,
                imageResourceId = R.drawable.trattoria_rosmarino,
                placesImageBanner = R.drawable.trattoria_rosmarino,
                placeDetails = R.string.restaurant_rosmarino_details
            )
        )
    }
}