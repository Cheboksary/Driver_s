package com.example.driverhelper.screens.manager

import androidx.lifecycle.ViewModel
import com.example.driverhelper.screens.manager.database.DatabaseRepository

class ManagerFragmentViewModel(
    private val databaseRepository: DatabaseRepository
) : ViewModel() {

    val list = databaseRepository.expensesList

}