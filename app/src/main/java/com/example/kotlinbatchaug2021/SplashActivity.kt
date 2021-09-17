package com.example.kotlinbatchaug2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.core.os.HandlerCompat.postDelayed

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//        Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                //Write whatever to want to do after delay specified (1 sec)
//                Log.d("Handler", "Running Handler");
//            }
//        },,3000)
        Handler().postDelayed({movetoOtherScreen()},3000)
    }


     fun movetoOtherScreen() {
        var i= Intent(this, SignUpActivity::class.java)
        startActivity(i)
        finish()
    }
}