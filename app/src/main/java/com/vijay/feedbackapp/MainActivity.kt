package com.vijay.feedbackapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnStudent : Button
    lateinit var btnStaff : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStudent = findViewById(R.id.btnStudent)

        btnStaff = findViewById(R.id.btnStaff)

        btnStudent.setOnClickListener{
            startActivity(Intent(this,Student::class.java))
        }

        btnStaff.setOnClickListener{
            startActivity(Intent(this,Staff::class.java))
        }



    }
}