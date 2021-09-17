package com.example.kotlinbatchaug2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userEmail=intent.getStringExtra("Useremail")
        Toast.makeText(this,"Welcome $userEmail",Toast.LENGTH_LONG).show()
        //set text in textview

    }


}

