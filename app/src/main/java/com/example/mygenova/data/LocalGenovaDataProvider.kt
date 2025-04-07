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
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.coffee_tazze_pazze_details
            ),
            RecommendedPlace(
                id = 2,
                titleResourceId = R.string.coffee_ostello_bello_title,
                subtitleResourceId = R.string.coffee_ostello_bello_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.coffee_ostello_bello_details
            ),
            RecommendedPlace(
                id = 3,
                titleResourceId = R.string.coffee_cafe_frida_title,
                subtitleResourceId = R.string.coffee_cafe_frida_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
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
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.restaurant_rosmarino_details
            ),
            RecommendedPlace(
                id = 5,
                titleResourceId = R.string.restaurant_le_rune_title,
                subtitleResourceId = R.string.restaurant_le_rune_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.restaurant_le_rune_details
            ),
            RecommendedPlace(
                id = 6,
                titleResourceId = R.string.restaurant_eataly_title,
                subtitleResourceId = R.string.restaurant_eataly_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.restaurant_eataly_details
            )
        )
    }

    fun getKidFriendlyPlaces(): List<RecommendedPlace> {
        return listOf(
            RecommendedPlace(
                id = 7,
                titleResourceId = R.string.kids_citta_dei_bambini_title,
                subtitleResourceId = R.string.kids_citta_dei_bambini_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.kids_citta_dei_bambini_details
            ),
            RecommendedPlace(
                id = 8,
                titleResourceId = R.string.kids_righi_title,
                subtitleResourceId = R.string.kids_righi_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.kids_righi_details
            ),
            RecommendedPlace(
                id = 9,
                titleResourceId = R.string.kids_acquario_title,
                subtitleResourceId = R.string.kids_acquario_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.kids_acquario_details
            )
        )
    }

    fun getParks(): List<RecommendedPlace> {
        return listOf(
            RecommendedPlace(
                id = 10,
                titleResourceId = R.string.park_villetta_di_negro_title,
                subtitleResourceId = R.string.park_villetta_di_negro_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.park_villetta_di_negro_details
            ),
            RecommendedPlace(
                id = 11,
                titleResourceId = R.string.park_parco_villetta_title,
                subtitleResourceId = R.string.park_parco_villetta_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.park_parco_villetta_details
            ),
        )
    }

    fun getShops(): List<RecommendedPlace> {
        return listOf(
            RecommendedPlace(
                id = 13,
                titleResourceId = R.string.shop_fiumara_title,
                subtitleResourceId = R.string.shop_fiumara_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.shop_fiumara_details
            ),
            RecommendedPlace(
                id = 14,
                titleResourceId = R.string.shop_mercato_orientale_title,
                subtitleResourceId = R.string.shop_mercato_orientale_subtitle,
                imageResourceId = R.drawable.place,
                placesImageBanner = R.drawable.place,
                placeDetails = R.string.shop_mercato_orientale_details
            )
        )
    }
}