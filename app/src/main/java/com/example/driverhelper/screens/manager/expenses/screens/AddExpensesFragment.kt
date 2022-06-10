package com.example.driverhelper.screens.manager.expenses.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.driverhelper.R
import com.example.driverhelper.Repository
import com.example.driverhelper.databinding.FragmentAddExpensesBinding
import com.example.driverhelper.screens.manager.expenses.utilits.Expenses
import com.example.driverhelper.screens.viewModelCreator

class AddExpensesFragment : Fragment() {

    lateinit var binding: FragmentAddExpensesBinding
    private val viewModel by viewModelCreator { AddExpensesViewModel(Repository.databaseRepository) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddExpensesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            if(binding.nameEditText.text.isNullOrBlank()) {
                binding.nameEditText.error = "Обязательное поле"
                return@setOnClickListener
            }
            if(binding.rubValueEditText.text.isNullOrBlank()) {
                binding.rubValueEditText.error = "Обязательное поле"
                return@setOnClickListener
            }
            if(binding.dateEditText.text.isNullOrBlank()) {
                binding.dateEditText.error = "Обязательное поле"
                return@setOnClickListener
            }
            /*viewModel.insert(Expenses(id = 0,name = binding.nameEditText.text.toString(),
                description = if(binding.descriptionEditText.text.isNotBlank()) binding.descriptionEditText.text.toString() else null,
                rubValue = binding.rubValueEditText.text.toString().toInt(),))*/
        }
    }
}