package com.example.myapplication.domain.ShortInfo

data class ShortInfoModel(
    val nameLocation: String,
    var temperature: Int,
    val info: String, //todo пока не придумал зачем это нужно
    var favorite: Boolean = false
)
