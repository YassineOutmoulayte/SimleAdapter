package com.example.simpleadapter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listView=findViewById<ListView>(R.id.listView)
        val produit= listOf(mapOf("name" to "produit1","price" to "10DH")
            ,mapOf("name" to "produit2","price" to "20DH")
            ,mapOf("name" to "produit3","price" to "30DH")
            ,mapOf("name" to "produit4","price" to "40DH")
            ,mapOf("name" to "produit5","price" to "20DH")
            ,mapOf("name" to "produit6","price" to "30DH")
            ,mapOf("name" to "produit7","price" to "40DH")
            ,mapOf("name" to "produit8","price" to "20DH")
            ,mapOf("name" to "produit9","price" to "30DH")
            ,mapOf("name" to "produit10","price" to "40DH")
            ,mapOf("name" to "produit11","price" to "20DH")
            ,mapOf("name" to "produit12","price" to "30DH")
            ,mapOf("name" to "produit13","price" to "40DH")
            )
        val adapter=SimpleAdapter(this,produit,android.R.layout.simple_list_item_2,arrayOf("name","price"),
            intArrayOf(android.R.id.text1,android.R.id.text2)
        )
        listView.adapter=adapter
    }


    }