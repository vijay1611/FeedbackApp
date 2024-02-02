package com.vijay.feedbackapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Student : AppCompatActivity() {

    lateinit var edtNumber : EditText
    lateinit var btnSubmit : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener{
            startActivity(Intent(this,FeedBackScreen::class.java))
        }

    }
}