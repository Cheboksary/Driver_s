package com.example.driverhelper.screens.manager.database.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.driverhelper.screens.manager.expenses.utilits.Expenses
import com.example.driverhelper.screens.manager.maintenance.utilits.Maintenance

@Database(
    version = 1,
    entities = [
        Expenses::class,
        Maintenance::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getManagerRoomDao(): ManagerRoomDao

    /*companion object {

        @Volatile
        private var database: AppDatabase? = null

        @Synchronized
        fun getInstance(context: Context): AppDatabase {
            database = Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "database.db"
            )
                .build()
            return database as AppDatabase
        }
    }*/
}