package com.example.myapplication.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        DBInfoModel::class,
        DBUserParam::class
    ],
    version = 1,
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun getInfoDao(): InfoModelDao
    abstract fun getParamDao(): UserParamDao

}