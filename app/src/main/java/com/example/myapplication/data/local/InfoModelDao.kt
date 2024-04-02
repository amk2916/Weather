package com.example.myapplication.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


@Dao
interface InfoModelDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun create(model: DBInfoModel)

    @Query("select * from short_info")
    fun getAll() : List<DBInfoModel>

    @Query("select * from short_info where name_location = :nameLocation")
    suspend fun getModelFromName(nameLocation: String) : DBInfoModel

    @Query("select * from short_info where latitude = :latitude and longitude = :longitude limit 1")
    suspend fun getModelFromLocation(latitude: Double,  longitude: Double) : DBInfoModel

    @Update(DBInfoModel::class)
    suspend fun updateValue(dbInfoModel: DBInfoModel)

    @Query("Delete from short_info where name_location = :nameLocation ")
    suspend fun deleteValue(nameLocation: String)
}