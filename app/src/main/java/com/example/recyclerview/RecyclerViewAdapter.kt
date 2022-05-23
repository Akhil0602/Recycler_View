package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

var arr = mutableListOf<String>("Akhil", "RAM", "Monish", "Bharat", "Anand")
var cn = mutableListOf<String>("123456789", "123456789", "123456789", "123456789", "123456789")
interface OnClickListener
{
    fun onRemove(context:Context)
    {
        /*arr.removeAt(id)
        cn.removeAt(id)*/
        Toast.makeText(context,"Clicked Name",Toast.LENGTH_SHORT).show()
    }
    fun onEdit()
}

class RecyclerViewAdapter(contex: Context) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(),OnClickListener {


    var context: Context = contex

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.format, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Tname.text = cn[position]
        holder.Tcn.text = arr[position]
    }


    override fun getItemCount(): Int {
        return arr.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener {
        var Tcn = itemView.findViewById<TextView>(R.id.name)
        var Tname = itemView.findViewById<TextView>(R.id.contact)

        init {
            var pos = this.absoluteAdapterPosition
            Tcn.setOnClickListener{onRemove(context)}
            Toast.makeText(context, "You clicked on name " + pos.toString(), Toast.LENGTH_SHORT).show()
        }

        override fun onClick(p0: View?) {

        }
    }

    override fun onEdit() {

    }


}

