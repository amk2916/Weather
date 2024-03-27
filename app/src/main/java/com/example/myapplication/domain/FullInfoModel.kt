package com.example.myapplication.domain

data class FullInfoModel(
    val sunriseTime: String,
    val sunsetTime: String,
    val windSpeed: Int,
    val directionOfTheWind: String,
    val humidity: Int,
    val temperatureForHour: Map<String, Int>, // <час, значение>
    val temperatureFoeWeek: Map<String, Int>// <день недели, значение>

)