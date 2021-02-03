package com.example.apuntes_adapterlista

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apuntes_adapterlista.databinding.ItemAdapterBinding
import com.example.apuntes_adapterlista.databinding.ItemStringAdapterBinding


class StringAdapter (): RecyclerView.Adapter<StringAdapter.StringAdapterViewHolder>(){

    val numeroRepeticion = 100;

    class StringAdapterViewHolder(var view: ItemStringAdapterBinding): RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringAdapterViewHolder {
        val view = LayoutInflater.from(parent.context)
        val adaptador = ItemStringAdapterBinding.inflate(view,parent,false)
        return StringAdapterViewHolder(adaptador)

    }

    override fun onBindViewHolder(holder: StringAdapterViewHolder, position: Int) {
        holder.view.tvStringAdapter.text = "Cadena numero $position "
    }

    override fun getItemCount(): Int {
        return numeroRepeticion
    }
}