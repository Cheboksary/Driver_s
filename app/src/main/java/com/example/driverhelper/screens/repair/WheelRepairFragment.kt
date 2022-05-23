package com.example.driverhelper.screens.repair

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.driverhelper.R
import com.example.driverhelper.databinding.FragmentWheelRepairBinding

class WheelRepairFragment : Fragment() {

    private lateinit var binding: FragmentWheelRepairBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWheelRepairBinding.inflate(layoutInflater)
        return binding.root
    }

}