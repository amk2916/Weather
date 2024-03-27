package com.example.myapplication.domain

import com.example.myapplication.domain.FullInfo.FullInfoModel
import com.example.myapplication.domain.ParamsInfo.UserAppParamsModel
import com.example.myapplication.domain.ShortInfo.ShortInfoModel

interface Repository {
    fun getFullIInfoLocation(latitude: Double, longitude: Double) : FullInfoModel

    fun getFullIInfoNameLocation(name: String) : FullInfoModel

    fun getParams(): UserAppParamsModel

    fun getFromLocation(latitude: Double, longitude: Double) : ShortInfoModel

    fun getFromNameLocation(name: String) : ShortInfoModel

    fun getInfoInFavoritesLocation() : List<ShortInfoModel>

}