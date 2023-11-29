package com.example.aqua.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aqua.adapter.holder.SmartHolder
import com.example.aqua.databinding.ItemPageBinding


class SmartAdapter<T> : RecyclerView.Adapter<SmartHolder>() {
    var mList = mutableListOf<T>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmartHolder {
        val binding = ItemPageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return SmartHolder(binding)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: SmartHolder, position: Int) {
        val item = mList[position]
        Log.i("FAW", item.toString())
        holder.binding.lld.text = item.toString()


    }
    fun loadMore(collection: Collection<T>) {
        mList.addAll(collection)
        notifyDataSetChanged()
    }

    fun refresh(collection: Collection<T>) {
        mList.clear()
        mList.addAll(collection)
        notifyDataSetChanged()
    }

}