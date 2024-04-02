package com.example.myapplication.DI

import android.content.Context
import androidx.room.Room
import com.example.myapplication.data.local.AppDataBase
import com.example.myapplication.data.local.InfoModelDao
import com.example.myapplication.data.local.UserParamDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DBModule {

    @Provides
    @Singleton
    fun db(@ApplicationContext context: Context): AppDataBase = Room
        .databaseBuilder(context, AppDataBase::class.java, "WeatherDB")
        .build()

    @Provides
    fun infoModelDao(db: AppDataBase): InfoModelDao = db.getInfoDao()

    @Provides
    fun userParamDao(db: AppDataBase): UserParamDao = db.getParamDao()

}