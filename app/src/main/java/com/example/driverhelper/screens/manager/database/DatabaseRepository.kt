package com.example.driverhelper.screens.manager.database

import androidx.lifecycle.LiveData
import com.example.driverhelper.screens.manager.expenses.utilits.Expenses
import com.example.driverhelper.screens.manager.maintenance.utilits.Maintenance

interface DatabaseRepository {
    val expensesList: LiveData<List<Expenses>>
    suspend fun getExpensesByMonth(month: String, year: String): LiveData<List<Expenses>>?
    suspend fun insertExpenses(expenses: Expenses)

    val maintenanceList: LiveData<List<Maintenance>>
    suspend fun insertMaintenance(maintenance: Maintenance)
}