package com.uvg.taller14mayo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition


class MainActivity : AppCompatActivity() {

    private val adaptador = Adaptador(
        { clickListener ->
            showItemClick(clickListener)
        },
        {
            longClickListener ->
            showItemClick(longClickListener)
        }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val adaptador = Adaptador(items)

        val items: MutableList<String> = mutableListOf()
        items.add("Elemento (1)")
        items.add("Elemento (2)")
        items.add("Elemento (3)")

        adaptador.setItems(items)

        lista.layoutManager = LinearLayoutManager(this)
        lista.adapter = adaptador

        var i: Int = 4

        btnAdd.setOnClickListener {
            items.add("Elemento ($i)")
            adaptador.setItems(items)
            i++
        }

    }

    fun showItemClick(position: Int) {
        val item = adaptador.getItem(position)
        Toast.makeText(this, "Eliminando...", Toast.LENGTH_SHORT).show()
        adaptador.RemoveItem(position)
    }
}