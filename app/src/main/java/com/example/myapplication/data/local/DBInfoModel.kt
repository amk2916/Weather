package com.example.myapplication.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "short_info",
    indices = [
        Index(
            value = ["name_location"],
            unique = true
        )
    ]
)
data class DBInfoModel(
    @PrimaryKey(autoGenerate = true)
    val id: Long = -1,
    @ColumnInfo("name_location")
    val nameLocation: String,
    val temperature: Int,
   // val info: String,
    val sunrise_time: String,
    val sunset_time: String,
    val wind_speed: Int,
    val direction_of_the_wind: String,
    val humidity: Int,
    val temperature_for_hour: Int, // <час, значение>
    val temperature_for_week: Int,// <день недели, значение>
    val update_time: String,
    val latitude: Double,
    val longitude: Double
)