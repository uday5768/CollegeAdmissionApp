package com.example.myapplication4

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var b1 = findViewById<Button>(R.id.review)

        var firstname = findViewById<EditText>(R.id.FirstName)
        var middlename= findViewById<EditText>(R.id.MiddleName)
        var lastname= findViewById<EditText>(R.id.LastName)
        var dob=findViewById<EditText>(R.id.dob)
        var fname = findViewById<EditText>(R.id.fname)
        var mname= findViewById<EditText>(R.id.mname)
        var phone = findViewById<EditText>(R.id.phone)
        var email= findViewById<EditText>(R.id.email)
        var marks = findViewById<EditText>(R.id.marks)
        var address=findViewById<EditText>(R.id.address)

        var course=findViewById<Button>(R.id.course)
        course.setOnClickListener(){
            val items = arrayOf("CSE", "ECE", "Civil", "Mechanical")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("List of Courses")
                .setItems(items){ _, which ->
                    Toast.makeText(applicationContext, items[which] + " is clicked", Toast.LENGTH_SHORT).show() }
                .setPositiveButton("OK", null)
                .setNegativeButton("CANCEL", null)
                .setNeutralButton("NEUTRAL", null)

            val alertDialog = builder.create()
            alertDialog.show()
            val button = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
            val buttonN = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE)

            buttonN.setBackgroundColor(Color.RED)
            button.setBackgroundColor(Color.BLACK)

            button.setPadding(0, 0, 20, 0)
            buttonN.setPadding(20, 0, 20, 0)

            button.setTextColor(Color.WHITE)
            buttonN.setTextColor(Color.BLUE)


        }
        b1.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity4::class.java)
//            var b  = Bundle()
            var x: String = firstname.text.toString()
            var y: String = middlename.text.toString()
            var z: String = lastname.text.toString()
            var fn: String = fname.text.toString()
            var mn: String = mname.text.toString()
//            var phone: Int = phone.text.toString().toInt()
//            var marks: Int = marks.text.toString().toInt()


            intent.putExtra("FirstName", x)
            intent.putExtra("MiddleName", y)
            intent.putExtra("LastName", z)
//          intent.putExtra("Gender", result.toString())
            intent.putExtra("Father'sName", fn)
            intent.putExtra("Mother'sName", mn)
//            intent.putExtra("Address",address )
//            intent.putExtra("PhoneNumber",phone)
//            intent.putExtra("Marks",marks)



            val builder = AlertDialog.Builder(this)
            builder.setTitle("Login Alert")
                .setMessage("Are you sure, you want to continue and Review ?")
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes") { _, _ ->
                Toast.makeText(applicationContext, "clicked yes", Toast.LENGTH_LONG).show()
                intent.putExtra("message_key", x)
                startActivity(intent)
            }

            builder.setNeutralButton("Cancel") { _, _ ->
                Toast.makeText(applicationContext, "clicked cancel\noperation cancel", Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No") { _, _ ->
                Toast.makeText(applicationContext, "clicked No", Toast.LENGTH_LONG).show()
            }

            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()
        }
    }
}

