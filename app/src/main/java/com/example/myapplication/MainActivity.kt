package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.data.local.AppDataBase
import com.example.myapplication.data.local.UserParamDao
import com.example.myapplication.data.server.OpenWeatherService
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.FileInputStream
import java.util.Properties
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var network: OpenWeatherService


    @Inject
    lateinit var paramsDao: UserParamDao


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // Log.e("key", applicationContext.getString(R.string.api_key))

        CoroutineScope(Dispatchers.IO).launch {
            val a = network.getInfoWeather(52.52f, 13.41f, 1)
            Log.e("MainActivity", a.toString())


            try {
                val c = paramsDao.getAll().toString()
                Log.e("MainActivity", c )
            }catch(e: Exception){
                Log.e("MainActivity", e.toString())
            }

        }
    }

}