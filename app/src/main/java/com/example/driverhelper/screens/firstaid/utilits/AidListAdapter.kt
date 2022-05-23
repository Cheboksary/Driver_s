package com.example.driverhelper.screens.firstaid.utilits

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.driverhelper.databinding.FirstAidListItemBinding

class AidListAdapter(
    private val firstAidList: List<FirstAidType>
):BaseAdapter() {

    override fun getCount(): Int = firstAidList.size

    override fun getItem(position: Int): FirstAidType = firstAidList[position]

    override fun getItemId(position: Int): Long = firstAidList[position].id.toLong()

    override fun getView(position: Int, p1: View?, p2: ViewGroup): View {
        val binding = p1?.tag as FirstAidListItemBinding? ?: createBinding(p2.context)
        val firstAidType = getItem(position)
        binding.firstAidItemName.text = firstAidType.name
        binding.firstAidItemImage.setImageResource(firstAidType.pic)

        return binding.root
    }

    private fun createBinding(context: Context): FirstAidListItemBinding {
        val binding = FirstAidListItemBinding.inflate(LayoutInflater.from(context))
        binding.root.tag = binding
        return binding
    }

}