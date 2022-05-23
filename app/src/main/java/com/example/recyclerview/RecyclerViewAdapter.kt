package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(contex: Context) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    var arr= mutableListOf<String>("Akhil","RAM","Monish","Bharat","Anand")
    var cn= mutableListOf<String>("123456789","123456789","123456789","123456789","123456789")
    var context:Context=contex

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

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener
    {
        var Tcn =itemView.findViewById<TextView>(R.id.name)
        var Tname =itemView.findViewById<TextView>(R.id.contact)
        init {
            Tcn.setOnClickListener{
                var pos=this.absoluteAdapterPosition
                Toast.makeText(context,"You clicked on name "+ pos.toString(),Toast.LENGTH_SHORT).show()
            }
            Tname.setOnClickListener{
                Toast.makeText(context,"This is contact",Toast.LENGTH_SHORT).show()
            }
        }

    }

}