package com.example.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val languages = arrayOf("IND","NEPAL","BAN","SL")
        val spinner = findViewById<Spinner>(R.id.spinner)

        if (spinner != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity2,
                        "Selected Item" + " " +"" + languages[position],
                        Toast.LENGTH_SHORT).show()
                    var outp:String = languages[position]
                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                }
            }
        }
        var enternumber=findViewById<TextView>(R.id.enternumber)
        enternumber.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Enter Your phone number here")
            val input = EditText(this)
            val lp = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)
            input.layoutParams = lp
            builder.setView(input)
            builder.setPositiveButton("OK") { _, _ ->
                Toast.makeText(applicationContext,
                    "Phone NUmber entered is " + input.text.toString(),
                    Toast.LENGTH_SHORT).show() }
            builder.show()
        }
        val next = findViewById<Button>(R.id.Next)
        next.setOnClickListener() {
            val intent = Intent(this, MainActivity3::class.java).apply { }
            startActivity(intent)
        }
    }
}