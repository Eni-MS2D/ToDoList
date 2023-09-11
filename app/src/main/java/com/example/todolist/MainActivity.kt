package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNewToDoList = findViewById<Button>(R.id.btnNewToDoList)
        val listToDo = findViewById<ListView>(R.id.listToDoList)
        var listTest = arrayOf("Test1", "Test2", "Test3")
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listTest)

        listToDo.adapter = adapter

        btnNewToDoList.setOnClickListener {
            listTest += "Test4"
            adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listTest)
            listToDo.adapter = adapter
        }
    }
}