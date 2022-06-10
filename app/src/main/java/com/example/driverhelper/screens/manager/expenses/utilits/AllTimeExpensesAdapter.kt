package com.example.driverhelper.screens.manager.expenses.utilits

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.driverhelper.databinding.ManagerItemBinding

class AllTimeExpensesAdapter : RecyclerView.Adapter<AllTimeExpensesAdapter.AllTimeExpensesHolder>() {

    class AllTimeExpensesHolder(val binding: ManagerItemBinding) : RecyclerView.ViewHolder(binding.root)

    private var listExpenses = emptyList<Expenses>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllTimeExpensesHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ManagerItemBinding.inflate(inflater, parent, false)
        return AllTimeExpensesHolder(binding)
    }

    override fun onBindViewHolder(holder: AllTimeExpensesHolder, position: Int) {
        val expenses = listExpenses[position]
        holder.binding.nameTextView.text = expenses.name
        holder.binding.rubValueTextView.text = expenses.rubValue.toString()
        if (expenses.description.isNullOrBlank())
            holder.binding.descriptionTextView.visibility = View.GONE
        else
            holder.binding.descriptionTextView.text = expenses.description
        val date =
            expenses.dayFromUser + ':' + expenses.monthFromUser + ':' + expenses.yearFromUser
        holder.binding.dateTextView.text = date
        holder.binding.dateAddedTextView.text = expenses.dateAdded
    }

    override fun getItemCount(): Int = listExpenses.size

    fun setList(list: List<Expenses>) {
        listExpenses = list
        notifyDataSetChanged()
    }
}