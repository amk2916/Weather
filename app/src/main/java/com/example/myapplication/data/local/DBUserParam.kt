package com.example.myapplication.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import com.example.myapplication.domain.ParamsInfo.MeasureTemperature

@Entity(tableName = "user_params")
data class DBUserParam(
    @PrimaryKey(autoGenerate = true) val id: Long?,
    @ColumnInfo("measure_temperature") var measureTemperature: MeasureTemperature,
    var notifications: Boolean,
    var paramPosition: Boolean,
    var language: String // может потом реализую, сейчас времени нет, всегда будет Русский
)
