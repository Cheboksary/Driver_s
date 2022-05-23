package com.example.driverhelper.screens.repair.utilits

import com.example.driverhelper.R

data class RepairType(
    val id: Int,
    val name: String,
    val pic: Int
)

val repairList = listOf(
    RepairType(id = 0, name = "Замена колеса", pic = R.drawable.test_image_repair),
    RepairType(id = 1, name = "Замена моторного масла", pic = R.drawable.test_image_repair),
    RepairType(id = 2, name = "Замена охлаждающей жидкости (антифриза)", pic = R.drawable.test_image_repair),
    RepairType(id = 3, name = "Замена ламп", pic = R.drawable.test_image_repair),
    RepairType(id = 4, name = "Замена тормозных дисков(барабанов) и/или тормозных колодок", pic = R.drawable.test_image_repair),
    RepairType(id = 5, name = "Замена тормозной жидкости", pic = R.drawable.test_image_repair)
)