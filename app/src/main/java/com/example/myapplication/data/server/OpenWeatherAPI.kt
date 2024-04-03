package com.example.myapplication.data.server


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/*
https://api.open-meteo.com/v1/forecast?
    latitude=52.52
    &longitude=13.41
    &hourly=temperature_2m,wind_speed_10m,relative_humidity_2m
    &daily=sunset,sunrise, wind_direction_10m_dominant
    &forecast_days=1
 */
interface OpenWeatherService {

    @GET(
        "v1/forecast?hourly=temperature_2m,wind_speed_10m,relative_humidity_2m"+
                "&daily=sunset,sunrise,wind_direction_10m_dominant"
    )
    suspend fun getInfoWeather(
        @Query("latitude") latitude: Float,
        @Query("longitude") longitude: Float,
        @Query("forecast_days") countDay: Int
    ): InternetModel
}
