package com.example.myapplication.domain.ParamsInfo

data class UserAppParamsModel(
    var measureTemperature: MeasureTemperature,
    var notifications: Boolean,
    var paramPosition: Boolean,
    var language: String
)

enum class MeasureTemperature{
    CELSIUS{
        override fun toString(): String {
            return "Градусы (\u00B0С)"
        }
    },
    FAHRENHEIT{
        override fun toString(): String {
            return "Градусы (\u00B0F)"
        }
    },
    KELVIN{
        override fun toString(): String {
            return "Градусы (K)"
        }
    }
}