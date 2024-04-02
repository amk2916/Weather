package com.example.myapplication.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserParamDao {
    // по идее idшник нафиг не нужен, там всегда одна запись
    // todo по возможности избавиться от этого дела
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun createParams(model: DBUserParam) : Long


    @Query("select * from user_params limit 1")
    fun getAll() : DBUserParam

    @Update
    suspend fun update(model: DBUserParam)
}