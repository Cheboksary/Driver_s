package com.example.driverhelper.screens.manager.expenses.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.RecyclerView
import com.example.driverhelper.R
import com.example.driverhelper.databinding.FragmentExpensesHistoryBinding
import com.example.driverhelper.screens.manager.expenses.utilits.AllTimeExpensesAdapter
import com.example.driverhelper.screens.manager.expenses.utilits.Expenses

class ExpensesHistoryFragment : Fragment() {

    lateinit var binding: FragmentExpensesHistoryBinding
    lateinit var viewModel: ExpensesHistoryViewModel
    lateinit var observer: Observer<List<Expenses>>
    lateinit var adapter: AllTimeExpensesAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExpensesHistoryBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialization()
    }

    private fun initialization() {
        viewModel = ViewModelProvider(this)[ExpensesHistoryViewModel::class.java]
        adapter = AllTimeExpensesAdapter()
        recyclerView.adapter = adapter
        observer = Observer { it ->
            val list = it.sortedBy{ it.yearFromUser }.sortedBy{ it.monthFromUser }.sortedBy{ it.dayFromUser }
            adapter.setList(list)
        }
        viewModel.list.observe(viewLifecycleOwner,observer)
    }
}