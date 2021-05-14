package com.uvg.taller14mayo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    private val adaptador = Adaptador({
            clickListener -> showItemClick(clickListener)
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val items : MutableList<String> = mutableListOf()
        items.add("Prueba 1")
        items.add("Prueba 2")
        items.add("Prueba 3")
        items.add("Prueba 4")
        items.add("Prueba 5")
        items.add("Prueba 6")
        items.add("Prueba 7")
        items.add("Prueba 8")
        items.add("Prueba 9")
        items.add("Prueba 10")
        items.add("Prueba 11")
        items.add("Prueba 12")
        items.add("Prueba 13")
        items.add("Prueba 14")
        items.add("Prueba 15")
        items.add("Prueba 16")
        items.add("Prueba 17")
        items.add("Prueba 18")
        items.add("Prueba 19")
        items.add("Prueba 20")*/

        //val adaptador = Adaptador(items)

        val items : MutableList<String> = mutableListOf()
        items.add("Prueba 1")
        items.add("Prueba 2")
        items.add("Prueba 3")

        adaptador.setItems(items)

        lista.layoutManager = LinearLayoutManager(this)
        lista.adapter = adaptador
    }

    fun showItemClick(position: Int) {
        val item = adaptador.getItem(position)
        Toast.makeText(this, item, Toast.LENGTH_SHORT).show()
    }
}