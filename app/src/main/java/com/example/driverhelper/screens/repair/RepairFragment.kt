package com.example.driverhelper.screens.repair

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.driverhelper.R
import com.example.driverhelper.databinding.FragmentRepairBinding
import com.example.driverhelper.screens.firstaid.utilits.findTopNavController
import com.example.driverhelper.screens.repair.utilits.RepairListAdapter
import com.example.driverhelper.screens.repair.utilits.repairList

class RepairFragment : Fragment() {

    private lateinit var binding: FragmentRepairBinding
    private lateinit var adapter: RepairListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRepairBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupList()
    }

    private fun setupList() {
        adapter = RepairListAdapter(repairList)
        binding.repairListView.adapter = adapter
        binding.repairListView.setOnItemClickListener { adapterView, view, position, id ->
            when (adapter.getItem(position).id) {
                0 -> findTopNavController().navigate(R.id.action_tabsFragment_to_wheelRepairFragment)
            }
        }
    }
}