package com.example.myapplication.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import com.example.myapplication.domain.ParamsInfo.MeasureTemperature

@Entity(tableName = "user_params")
data class DBUserParam(
    @PrimaryKey val id: Long = -1,
    @ColumnInfo("measure_temperature")
    var measureTemperature: MeasureTemperature = MeasureTemperature.CELSIUS,
    var notifications: Boolean = false,
    var paramGeoPosition: Boolean = false,
    var language: String = "Русский" // может потом реализую, сейчас времени нет, всегда будет Русский
)
