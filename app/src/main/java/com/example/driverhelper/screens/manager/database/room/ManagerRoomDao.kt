package com.example.driverhelper.screens.manager.database.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.driverhelper.screens.manager.expenses.utilits.Expenses
import com.example.driverhelper.screens.manager.maintenance.utilits.Maintenance

@Dao
interface ManagerRoomDao {
    @Query("SELECT * from expenses_table")
    fun getAllExpenses(): LiveData<List<Expenses>>

    /*@Query("SELECT * from expenses_table WHERE year_from_user = :year AND month_from_user = :month")
    suspend fun getExpensesByMonth(month: String, year: String): LiveData<List<Expenses>>?*/

    @Insert
    suspend fun insertExpenses(expenses: Expenses)

    @Query("SELECT * from maintenance_table")
    fun getAllMaintenance(): LiveData<List<Maintenance>>

    @Insert
    suspend fun insertMaintenance(maintenance: Maintenance)
}