package com.example.aqua.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aqua.databinding.ItemPageBinding


class SmartAdapter<T> : RecyclerView.Adapter<SmartAdapter<T>.SmartHolder>() {
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

    interface OnItemClickListener<T> {
        fun onItemClick(item:T)
        fun onItemLongClick(position: Int): Boolean
    }

    private var onItemClickListener: OnItemClickListener<T>? = null

    fun setOnItemClickListener(listener: OnItemClickListener<T>) {
        this.onItemClickListener = listener
    }


    inner class SmartHolder(val binding: ItemPageBinding) :
        RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener {
                onItemClickListener?.onItemClick(mList.get(adapterPosition))
            }
            itemView.setOnLongClickListener {
                onItemClickListener?.onItemLongClick(adapterPosition) ?: false
            }
        }
        }

}