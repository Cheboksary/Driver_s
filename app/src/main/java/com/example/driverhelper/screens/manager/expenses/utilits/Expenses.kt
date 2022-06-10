package com.example.driverhelper.screens.manager.expenses.utilits

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "expenses_table"
)
data class Expenses(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String,
    @ColumnInfo(name = "rub_value") val rubValue: Int,
    val description: String?,
    @ColumnInfo(name = "day_from_user") val dayFromUser: String,
    @ColumnInfo(name = "month_from_user") val monthFromUser: String,
    @ColumnInfo(name = "year_from_user") val yearFromUser: String,
    @ColumnInfo(name = "date_added") val dateAdded: String
)
