package com.example.apuntes_adapterlista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apuntes_adapterlista.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var adapter : ListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Esto es para usar el View binding.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createRecyclerView()
    }

    private fun createRecyclerView(){
        val lista = listOf<String>("Prueba 1","Prueba 2","Prueba 3")
        adapter = ListAdapter(lista.toMutableList())
        binding.ListAdapterRecycler.layoutManager = LinearLayoutManager(this)
        binding.ListAdapterRecycler.adapter = adapter

    }
}