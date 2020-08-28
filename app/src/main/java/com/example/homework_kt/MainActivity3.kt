package com.example.homework_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val listView = findViewById(R.id.listView) as ListView
        val list = ArrayList<String>()
        list.add("Bonjour")
        list.add("Salue")
        val adapter = ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, list)
        listView.setAdapter(adapter)
        listView.setOnItemClickListener(object: AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, view: View, position:Int, id:Long) {
                val pos = position
                val value = listView.getItemAtPosition(pos) as String
                Toast.makeText(getApplicationContext(), "Element: " + pos + ", Valeur: " + value, Toast.LENGTH_LONG).show()
            }
        })
    }

    fun buttonClick(view: View) {
        Toast.makeText(this, "Hello from the outside", Toast.LENGTH_LONG).show()
    }
}