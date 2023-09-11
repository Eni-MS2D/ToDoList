package com.example.todolist


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texteNomListe = findViewById<EditText>(R.id.editTextText)
        val btnNewToDoList = findViewById<ImageButton>(R.id.imgBtnListe)
        val listToDo = findViewById<ListView>(R.id.listToDoList)
        var listTest = arrayOf("Test1", "Test2", "Test3")
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listTest)

        listToDo.adapter = adapter

        btnNewToDoList.setOnClickListener {
            if(texteNomListe.text.toString() != "") {
                listTest += texteNomListe.text.toString()
                adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listTest)
                listToDo.adapter = adapter
                texteNomListe.text.clear()
            }
            else{
                val toast = Toast.makeText(this, "Vous devez renseigner un nom de liste !", Toast.LENGTH_SHORT) // in Activity
                toast.show()
            }
        }
    }

}