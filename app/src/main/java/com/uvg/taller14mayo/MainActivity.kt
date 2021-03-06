package com.uvg.taller14mayo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val adaptador = Adaptador(
        { clickListener ->
            showItemClick(clickListener)
        }
    ) { longingListener ->
        showItemLongClick(longingListener)
    }

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
        Toast.makeText(this, "Eliminando...", Toast.LENGTH_SHORT).show()
        adaptador.RemoveItem(position)
    }

    fun showItemLongClick(position: Int) {
        Toast.makeText(this, "Modificando...", Toast.LENGTH_SHORT).show()
        adaptador.ChangeItem(position)
    }
}