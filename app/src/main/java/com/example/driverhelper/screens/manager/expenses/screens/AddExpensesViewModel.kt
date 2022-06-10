package com.example.driverhelper.screens.manager.expenses.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.driverhelper.screens.manager.database.DatabaseRepository
import com.example.driverhelper.screens.manager.expenses.utilits.Expenses
import kotlinx.coroutines.launch

class AddExpensesViewModel(
    private val databaseRepository: DatabaseRepository
) : ViewModel() {

    fun insert(expenses: Expenses) = viewModelScope.launch {
        databaseRepository.insertExpenses(expenses)
    }

}