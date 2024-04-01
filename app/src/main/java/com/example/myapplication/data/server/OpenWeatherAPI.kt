package com.example.myapplication.data.server

import retrofit2.http.GET


interface OpenWeatherAPI {

    @GET("v1/forecast?latitude={lat}}&longitude={log}")
    suspend fun
}