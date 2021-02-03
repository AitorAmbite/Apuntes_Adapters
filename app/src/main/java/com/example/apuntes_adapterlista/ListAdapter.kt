package com.example.apuntes_adapterlista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apuntes_adapterlista.databinding.ItemAdapterBinding

class ListAdapter (var listaString : MutableList<String>): RecyclerView.Adapter<ListAdapter.ListAdapterViewHolder>(){

    class ListAdapterViewHolder(var view: ItemAdapterBinding): RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapterViewHolder {
        val view = LayoutInflater.from(parent.context)
        val adaptador = ItemAdapterBinding.inflate(view,parent,false)
        return ListAdapterViewHolder(adaptador)

    }

    override fun onBindViewHolder(holder: ListAdapterViewHolder, position: Int) {
        holder.view.textViewItems.text = "Este es el numero $position ${listaString[position]} "
    }

    override fun getItemCount(): Int {
        
        return listaString.size
    }
}