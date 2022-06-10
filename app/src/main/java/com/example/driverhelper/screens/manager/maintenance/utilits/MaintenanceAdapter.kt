package com.example.driverhelper.screens.manager.maintenance.utilits

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.driverhelper.databinding.ManagerItemBinding

class MaintenanceAdapter: RecyclerView.Adapter<MaintenanceAdapter.MaintenanceHolder>() {

    class MaintenanceHolder(val binding: ManagerItemBinding): RecyclerView.ViewHolder(binding.root)

    private var listMaintenance = emptyList<Maintenance>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MaintenanceHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ManagerItemBinding.inflate(inflater,parent,false)
        return MaintenanceHolder(binding)
    }

    override fun onBindViewHolder(holder: MaintenanceHolder, position: Int) {
        val maintenance = listMaintenance[position]
        holder.binding.nameTextView.text = maintenance.name
        holder.binding.rubValueTextView.text = maintenance.rubValue.toString()
        if (maintenance.description.isNullOrBlank())
            holder.binding.descriptionTextView.visibility = View.GONE
        else
            holder.binding.descriptionTextView.text = maintenance.description
        val date = maintenance.dayFromUser + ':' + maintenance.monthFromUser+':'+ maintenance.yearFromUser
        holder.binding.dateTextView.text = date
        holder.binding.dateAddedTextView.text = maintenance.dateAdded
    }

    override fun getItemCount(): Int = listMaintenance.size

    fun setList(list: List<Maintenance>){
        listMaintenance = list
        notifyDataSetChanged()
    }
}