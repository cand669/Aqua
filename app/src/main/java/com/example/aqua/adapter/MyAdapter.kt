package com.example.aqua.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.aqua.R

class MyAdapter :RecyclerView.Adapter<MyAdapter.MHolder>(){

    private var mColorsList = listOf(1,2,3,4,5,)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_page,parent,false)
        return MHolder(itemView)
    }

    override fun onBindViewHolder(holder: MHolder, position: Int) {
        holder.view.setText("<${position}>")

    }

    override fun getItemCount(): Int {
        return mColorsList.size
    }


    class MHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val view = itemView.findViewById<Button>(R.id.lld)
    }
}
