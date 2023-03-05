package com.example.myfabapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private var listItems = ArrayList<String>()
    private var adapter: ArrayAdapter<String>? = null
    private lateinit var listView: ListView
    private lateinit var fab: FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.lv1)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
        listItems
        )

        listView.adapter = adapter
        fab = findViewById(R.id.FAB1)

        fab.setOnClickListener {
            addListItem()
            Snackbar.make(it, "You clicked over the message", Snackbar.LENGTH_LONG)
                .setAction("name of action", null)
                .show()

        }
    }

    private fun addListItem() {
        listItems.add("Message 1")
        adapter?.notifyDataSetChanged()
    }


}