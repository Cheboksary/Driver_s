package com.example.driverhelper

import android.content.Context
import androidx.room.Room
import com.example.driverhelper.screens.manager.database.DatabaseRepository
import com.example.driverhelper.screens.manager.database.room.AppDatabase
import com.example.driverhelper.screens.manager.database.room.ManagerRoomRepository

object Repository {
    private lateinit var applicationContext: Context

    private val database: AppDatabase by lazy<AppDatabase> {
        Room.databaseBuilder(applicationContext, AppDatabase::class.java, "database.db")
        .build()
    }

    val databaseRepository: DatabaseRepository by lazy {
        ManagerRoomRepository(database.getManagerRoomDao())
    }

    fun init(context: Context){
        applicationContext = context
    }
}