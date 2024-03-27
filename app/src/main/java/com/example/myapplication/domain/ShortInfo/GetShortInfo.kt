package com.example.myapplication.domain.ShortInfo

class GetShortInfo() {

    /**
     * latitude - широта
     * longitude - долгота
     */
    fun getFromLocation(latitude: Double, longitude: Double) : ShortInfoModel {
        TODO()
    }


    /**
     * name - наименование локации в которой необходимо узнать погоду
     */
    fun getFromNameLocation(name: String) : ShortInfoModel {
        TODO()
    }

    /**
     * получение списка избранных мест с погодой
     */
    fun getInfoInFavoritesLocation() : List<ShortInfoModel> {
        TODO()
    }

}