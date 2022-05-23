package com.example.driverhelper.screens.firstaid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.driverhelper.R
import com.example.driverhelper.databinding.FragmentBleedingAidBinding

class BleedingAidFragment : Fragment() {

    private lateinit var binding: FragmentBleedingAidBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBleedingAidBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.call112btn.setOnClickListener {

        }
    }
}