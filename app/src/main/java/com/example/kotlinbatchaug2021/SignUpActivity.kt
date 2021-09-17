package com.example.kotlinbatchaug2021


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_signup.*
import java.util.regex.Matcher
import java.util.regex.Pattern


class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        Log.d("SignUpLifecyclelog","OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SignUpLifecyclelog","onStart")
    }

    //USer can interact with Activity
    override fun onResume() {
        super.onResume()
        Log.d("SignUpLifecyclelog","onResume")
    }
}