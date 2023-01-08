package com.example.myapplication4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var tv = findViewById<TextView>(R.id.textView4)
        val intent=intent

        val x = intent.getStringExtra("FirstName")
        val y = intent.getStringExtra("MiddleName")
        val z = intent.getStringExtra("LastName")
        val fn = intent.getStringExtra("Father'sName")
        val mn = intent.getStringExtra("Mother'sName")
//        val phone =intent.getIntExtra("PhoneNumber",0)
//        val marks = intent.getIntExtra("Marks",0)

        tv.text="First Name : "+"$x"+"\n"+"Middle Name : "+"$y"+"\n"+"Last Name : "+"$z"+"\n"+"Father's Name : "+"$fn"+"\n"+"Mother's name : "+"$mn"
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.optionmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return when (id) {
            R.id.Settings -> {
                Toast.makeText(applicationContext, "settings Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.Exit -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}