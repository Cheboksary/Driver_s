package com.example.driverhelper.screens.manager.expenses.screens

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.driverhelper.screens.manager.REPOSITORY

class ExpensesHistoryViewModel(application: Application): AndroidViewModel(application) {
    val list = REPOSITORY.expensesList
}