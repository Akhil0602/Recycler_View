package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter() : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    var arr= mutableListOf<String>("Akhil","RAM","Monish","Bharat","Anand")
    var cn= mutableListOf<String>("123456789","123456789","123456789","123456789","123456789")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.format,parent,false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Tname.text=cn[position]
        holder.Tcn.text=arr[position]
    }


    override fun getItemCount(): Int {
        return arr.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var Tcn =itemView.findViewById<TextView>(R.id.name)
        var Tname =itemView.findViewById<TextView>(R.id.contact)
    }

}