package com.example.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Skip=findViewById<Button>(R.id.skip)
        Skip.setOnClickListener(){
            val intent= Intent(this,MainActivity2::class.java).apply {  }
            startActivity(intent)
        }
    }
}