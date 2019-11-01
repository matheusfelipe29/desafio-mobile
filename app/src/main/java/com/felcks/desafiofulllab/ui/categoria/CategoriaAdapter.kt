package com.felcks.desafiofulllab.ui.categoria

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.felcks.desafiofulllab.App
import com.felcks.desafiofulllab.R
import kotlinx.android.synthetic.main.item_category.view.*

class CategoriaAdapter(private var list: List<CategoriaDTO>):
    RecyclerView.Adapter<CategoriaAdapter.MyViewHolder>() {

    val mLayoutInflater: LayoutInflater = App.instance.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = mLayoutInflater.inflate(R.layout.item_category, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val item = list[position]

        holder.itemView.tv_name.text = item.name
        //TODO implementar o clique
    }

    fun updateAllItens(listCategory: List<CategoriaDTO>){

        this.list = listCategory
        notifyDataSetChanged()
    }

    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view)
}