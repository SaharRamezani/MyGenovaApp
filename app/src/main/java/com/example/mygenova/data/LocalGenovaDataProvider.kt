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

//    fun getCoffeeShops() = listOf(
//        RecommendedPlace(1, "Tazze Pazze", "Trendy espresso bar", Category.CoffeeShop, "https://source.unsplash.com/800x600/?coffee,bar"),
//        RecommendedPlace(2, "Ostello Bello", "Casual cafe with workspace vibes", Category.CoffeeShop, "https://source.unsplash.com/800x600/?cafe,workspace"),
//        RecommendedPlace(3, "Cafè Frida", "Charming local spot", Category.CoffeeShop, "https://source.unsplash.com/800x600/?coffee,local")
//    )
//
//    fun getRestaurants() = listOf(
//        RecommendedPlace(4, "Trattoria Rosmarino", "Authentic Ligurian cuisine", Category.Restaurant, "https://source.unsplash.com/800x600/?restaurant,italian"),
//        RecommendedPlace(5, "Le Rune", "Cozy and romantic", Category.Restaurant, "https://source.unsplash.com/800x600/?restaurant,romantic"),
//        RecommendedPlace(6, "Eataly", "Sea view and variety", Category.Restaurant, "https://source.unsplash.com/800x600/?restaurant,seaview")
//    )
//
//    fun getParks() = listOf(
//        RecommendedPlace(7, "Villetta Di Negro", "Scenic hilltop park", Category.Park, "https://source.unsplash.com/800x600/?park,hill"),
//        RecommendedPlace(8, "Parco della Villetta", "Quiet & green", Category.Park, "https://source.unsplash.com/800x600/?green,park")
//    )
//
//    fun getShoppingCenters() = listOf(
//        RecommendedPlace(9, "Fiumara Shopping Center", "Massive shopping area", Category.ShoppingCenter, "https://source.unsplash.com/800x600/?shopping,mall"),
//        RecommendedPlace(10, "Mercato Orientale", "Indoor traditional market", Category.ShoppingCenter, "https://source.unsplash.com/800x600/?market,indoor")
//    )
//
//    fun getKidFriendlyPlaces() = listOf(
//        RecommendedPlace(11, "Città dei Bambini", "Interactive science museum for kids", Category.KidFriendly, "https://source.unsplash.com/800x600/?kids,museum"),
//        RecommendedPlace(12, "Parco Avventura Righi", "Adventure park with zip lines", Category.KidFriendly, "https://source.unsplash.com/800x600/?kids,adventure"),
//        RecommendedPlace(13, "Acquario di Genova", "Aquarium with marine life shows", Category.KidFriendly, "https://source.unsplash.com/800x600/?aquarium,genoa")
//    )