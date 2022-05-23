package com.example.driverhelper.screens.firstaid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.driverhelper.R
import com.example.driverhelper.databinding.FragmentFirstAidListBinding
import com.example.driverhelper.screens.firstaid.utilits.AidListAdapter
import com.example.driverhelper.screens.firstaid.utilits.FirstAidType
import com.example.driverhelper.screens.firstaid.utilits.findTopNavController

class FirstAidListFragment : Fragment() {

    private lateinit var binding: FragmentFirstAidListBinding

    private val firstAidList = listOf<FirstAidType>(
        FirstAidType(id = 0, name = "Кровотечение"),
        FirstAidType(id = 1, name = "Ожог"),
        FirstAidType(id = 2, name = "Потеря сознания"),
        FirstAidType(id = 3, name = "Отравление"),
        FirstAidType(id = 4, name = "Перелом"),
        FirstAidType(id = 5, name = "Человек подавился"),
    )

    private lateinit var adapter: AidListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstAidListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupList()
    }

    private fun setupList() {
        adapter = AidListAdapter(firstAidList)
        binding.listView.adapter = adapter
        binding.listView.setOnItemClickListener { adapterView, view, position, id ->
            when(adapter.getItem(position).id) {
                0 -> findTopNavController().navigate(R.id.action_tabsFragment_to_bleedingAidFragment)
            }
        }
    }

}