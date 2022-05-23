package com.example.driverhelper.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.driverhelper.R
import com.example.driverhelper.databinding.FragmentTabsBinding

class TabsFragment : Fragment() {

    private var _binding : FragmentTabsBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTabsBinding.inflate(layoutInflater,container,false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHost = childFragmentManager.findFragmentById(R.id.tabsFragmentContainerView) as NavHostFragment
        val navController = navHost.navController
        NavigationUI.setupWithNavController(mBinding.bottomNavigationView,navController)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}