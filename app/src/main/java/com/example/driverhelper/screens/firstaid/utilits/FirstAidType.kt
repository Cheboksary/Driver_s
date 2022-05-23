package com.example.driverhelper.screens.firstaid.utilits

import com.example.driverhelper.R

data class FirstAidType(
    val id: Int,
    val name: String,
    val pic: Int
)

val firstAidList = listOf<FirstAidType>(
    FirstAidType(id = 0, name = "Кровотечение", R.drawable.test_image),
    FirstAidType(id = 1, name = "Ожог", R.drawable.test_image),
    FirstAidType(id = 2, name = "Потеря сознания", R.drawable.test_image),
    FirstAidType(id = 3, name = "Отравление", R.drawable.test_image),
    FirstAidType(id = 4, name = "Перелом", R.drawable.test_image),
    FirstAidType(id = 5, name = "Человек подавился", com.google.android.material.R.drawable.ic_clock_black_24dp),
)