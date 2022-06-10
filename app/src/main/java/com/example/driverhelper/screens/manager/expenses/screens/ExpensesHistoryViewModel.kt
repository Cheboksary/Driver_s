package com.example.driverhelper.screens.manager.expenses.screens

import androidx.lifecycle.ViewModel
import com.example.driverhelper.screens.manager.database.DatabaseRepository

class ExpensesHistoryViewModel(
    private val databaseRepository: DatabaseRepository
): ViewModel() {

    val list = databaseRepository.expensesList

}