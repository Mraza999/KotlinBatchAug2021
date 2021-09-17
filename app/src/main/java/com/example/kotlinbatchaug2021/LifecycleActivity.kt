package com.example.kotlinbatchaug2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_lifecycle.*

class LifecycleActivity : AppCompatActivity() {

    //layout file is attached with activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
       Log.d("Lifecyclelog","onCreate")
        logout.setOnClickListener {
//            var i= Intent(this, SignUpActivity::class.java)
//            startActivity(i)

            showDialog()
        }
    }

    private fun showDialog() {
        val alert=AlertDialog.Builder(this,R.style.ThemeOverlay_AppCompat_Dialog)
        alert.setTitle("Logout Confirmation")
        alert.setMessage(R.string.logout_btn_msg)
        alert.setPositiveButton("YES") { _, which ->
            finish()
        }
        alert.setNegativeButton("No") { _, which ->
            val i= Intent(this, SignUpActivity::class.java)
            startActivity(i)
        }

        alert.create().show()
    }

    //Layout file is visble to user
    override fun onStart() {
        super.onStart()
        Log.d("Lifecyclelog","onStart")
    }

    //USer can interact with Activity
    override fun onResume() {
        super.onResume()
        Log.d("Lifecyclelog","onResume")
    }

    override fun onPause() {
        Log.d("Lifecyclelog","OnPause")
        super.onPause()
    }

    override fun onStop() {

        //if voice playing
//        {
//            keep playing
//        }
        Log.d("Lifecyclelog","OnStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d("Lifecyclelog","onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d("Lifecyclelog","OnDestroy")
        super.onDestroy()
    }
}