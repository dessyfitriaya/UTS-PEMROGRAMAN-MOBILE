package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class SampleAdapter(private val items: MutableList<SampleModel>)
    : RecyclerView.Adapter<SampleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)

        return ViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.catImage.setImageResource(item.catImage)
        holder.catBreed.text = item.catBreed
        holder.catDesc.text = item.catDesc
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val catImage: ImageView = view.findViewById(R.id.image)
        val catBreed: TextView = view.findViewById(R.id.text)
        val catDesc: TextView = view.findViewById(R.id.desc)
    }
}