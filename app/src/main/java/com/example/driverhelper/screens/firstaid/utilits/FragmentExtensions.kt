package com.example.driverhelper.screens.firstaid.utilits

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.driverhelper.R

fun Fragment.findTopNavController(): NavController {
    val topLevelHost = requireActivity().supportFragmentManager.findFragmentById(R.id.mainFragmentContainerView) as NavHostFragment
    return topLevelHost.navController //?: findNavController()
}