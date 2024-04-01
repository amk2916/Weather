package com.example.myapplication.data.server

import com.google.gson.annotations.SerializedName

data class InternetModel(
    var latitude: Double? = null,
    var longitude: Double? = null,

    @SerializedName("generationtime_ms")
    val generationtimeMs: Double?,

    var hourly: Hourly?,
    var daily: Daily?
)

data class Hourly(
    var time: List<String>?,

    @SerializedName("temperature_2m")
    var temperature: List<Float>?,

    @SerializedName("wind_speed_10m")
    var windSpeed: List<Float>?,

    @SerializedName("relative_humidity_2m")
    var humidity: List<Int>?
)


data class Daily(
    var time: List<String>?,
    var sunset: List<String>?,
    var sunrise: List<String>?,

    @SerializedName("wind_direction_10m_dominant")
    var direction: List<Int>?
)