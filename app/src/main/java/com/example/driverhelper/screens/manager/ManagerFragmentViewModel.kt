package com.example.driverhelper.screens.manager

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.driverhelper.screens.manager.database.DatabaseRepository
import com.example.driverhelper.screens.manager.database.room.AppDatabase
import com.example.driverhelper.screens.manager.database.room.ManagerRoomRepository
import com.example.driverhelper.screens.manager.expenses.utilits.Expenses
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class ManagerFragmentViewModel(
    private val managerRepository: DatabaseRepository
) : ViewModel() {
    //private val context = application

    /*fun initDatabase(){
        val dao = AppDatabase.getInstance(context).getManagerRoomDao()
        REPOSITORY = ManagerRoomRepository(dao)
    }*/

    val list = managerRepository.expensesList
}