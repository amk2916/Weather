package com.example.myapplication.data.Internet

data class InternetModel(
    val lat: Float,
    val lon: Float,
    val timezone: String,

)

data class current(
    val sunrise: Long,
    val sunset: Long,
    val wind_speed: Int,
    val humidity: Int,
    val temp: Int,
    val clouds: Int
)