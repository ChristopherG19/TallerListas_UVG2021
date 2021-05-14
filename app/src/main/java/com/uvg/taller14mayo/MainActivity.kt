package com.uvg.taller14mayo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //private val adaptador = Adaptador()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items : MutableList<String> = mutableListOf()
        items.add("Prueba 1")
        items.add("Prueba 2")
        items.add("Prueba 3")

        val adaptador = Adaptador(items)

        lista.layoutManager = LinearLayoutManager(this)
        lista.adapter = adaptador
    }
}