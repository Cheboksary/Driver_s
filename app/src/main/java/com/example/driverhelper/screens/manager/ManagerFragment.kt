package com.example.driverhelper.screens.manager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.driverhelper.R
import com.example.driverhelper.Repository
import com.example.driverhelper.databinding.FragmentManagerBinding
import com.example.driverhelper.screens.firstaid.utilits.findTopNavController
import com.example.driverhelper.screens.manager.expenses.utilits.Expenses
import com.example.driverhelper.screens.manager.expenses.utilits.ExpensesAdapter
import com.example.driverhelper.screens.viewModelCreator
import java.text.SimpleDateFormat
import java.util.*

class ManagerFragment : Fragment() {

    lateinit var binding: FragmentManagerBinding
    private val viewModel by viewModelCreator {ManagerFragmentViewModel(Repository.databaseRepository)}
    private lateinit var adapter: ExpensesAdapter
    private lateinit var monthExpensesRecyclerView: RecyclerView
    lateinit var observer: Observer<List<Expenses>>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentManagerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialization()
    }

    private fun initialization() {
        val monthFormat = SimpleDateFormat("MM", Locale.getDefault())
        val currentMonth = monthFormat.format(Calendar.getInstance().time)
        val yearFormat = SimpleDateFormat("yyyy", Locale.getDefault())
        val currentYear = yearFormat.format(Calendar.getInstance().time)

        //viewModel = ViewModelProvider(this)[ManagerFragmentViewModel::class.java]
        //viewModel.initDatabase()

        adapter = ExpensesAdapter(currentMonth, currentYear)
        monthExpensesRecyclerView = binding.monthExpensesRecyclerView
        monthExpensesRecyclerView.adapter = adapter
        observer = Observer { it ->
            val list = it.sortedBy{ it.dayFromUser }
            adapter.setList(list)
            if (list.isNotEmpty()) {
                binding.noMonthExpensesTextView.visibility = View.GONE
            }
        }
        viewModel.list.observe(viewLifecycleOwner,observer)
        binding.addExpensesButton.setOnClickListener {
            findTopNavController().navigate(R.id.action_tabsFragment_to_addExpensesFragment)
        }
        binding.addMaintenanceButton.setOnClickListener {
            findTopNavController().navigate(R.id.action_tabsFragment_to_addMaintenanceFragment)
        }
        binding.allTimeExpensesButton.setOnClickListener {
            findTopNavController().navigate(R.id.action_tabsFragment_to_expensesHistoryFragment)
        }
        binding.maintenanceHistoryButton.setOnClickListener {
            findTopNavController().navigate(R.id.action_tabsFragment_to_maintenanceHistoryFragment)
        }
    }
}