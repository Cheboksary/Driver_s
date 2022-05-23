package com.example.driverhelper.screens.repair.utilits

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.driverhelper.databinding.RepairListItemBinding

class RepairListAdapter(
    private val repairList: List<RepairType>
) : BaseAdapter() {

    override fun getCount(): Int = repairList.size

    override fun getItem(position: Int): RepairType = repairList[position]

    override fun getItemId(position: Int): Long = repairList[position].id.toLong()

    override fun getView(position: Int, p1: View?, p2: ViewGroup): View {
        val binding = p1?.tag as RepairListItemBinding? ?: createBinding(p2.context)
        val repairType = getItem(position)
        binding.firstAidItemName.text = repairType.name
        binding.firstAidItemImage.setImageResource(repairType.pic)

        return binding.root
    }

    private fun createBinding(context: Context?): RepairListItemBinding {
        val binding = RepairListItemBinding.inflate(LayoutInflater.from(context))
        binding.root.tag = binding
        return binding
    }
}