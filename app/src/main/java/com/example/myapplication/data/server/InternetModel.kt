package com.example.myapplication.data.server

data class InternetModel(
    var latitude             : Double?    = null,
    var longitude           : Double?     = null,
    var generationtimeMs    : Double?     = null,
    var hourly              : Hourly?     = Hourly(),
    var daily               : Daily?      = Daily()
)