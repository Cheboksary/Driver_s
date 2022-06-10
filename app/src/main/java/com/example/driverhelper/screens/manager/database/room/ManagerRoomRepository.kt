package com.example.driverhelper.screens.manager.database.room

import androidx.lifecycle.LiveData
import com.example.driverhelper.screens.manager.database.DatabaseRepository
import com.example.driverhelper.screens.manager.expenses.utilits.Expenses
import com.example.driverhelper.screens.manager.maintenance.utilits.Maintenance

class ManagerRoomRepository(
    private val managerRoomDao: ManagerRoomDao
) : DatabaseRepository {

    override val expensesList: LiveData<List<Expenses>>
        get() = managerRoomDao.getAllExpenses()

    override suspend fun getExpensesByMonth(month: String, year: String): LiveData<List<Expenses>>? {
        return managerRoomDao.getExpensesByMonth(month, year)
    }

    override suspend fun insertExpenses(expenses: Expenses) {
        managerRoomDao.insertExpenses(expenses)
    }

    override val maintenanceList: LiveData<List<Maintenance>>
        get() = managerRoomDao.getAllMaintenance()

    override suspend fun insertMaintenance(maintenance: Maintenance) {
        managerRoomDao.insertMaintenance(maintenance)
    }
}