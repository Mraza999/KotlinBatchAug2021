package com.example.kotlinbatchaug2021

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_in.*
import java.util.regex.Matcher
import java.util.regex.Pattern

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        cancelIcon.setOnClickListener {
            Toast.makeText(this@SignInActivity, "Your operation is canceled!", Toast.LENGTH_LONG).show()
        }

        login.setOnClickListener {
           val emailString= emailEditText.text.toString()
            val passwordString:String=passwordEditText.text.toString()
            checkValidation(emailString, passwordString)

        }

        SignUptext.setOnClickListener {
            var i=Intent(this, SignUpActivity::class.java)
            startActivity(i)
        }



    }

    private fun checkValidation(emailString: String, passwordString: String){

        if(emailString.isNotEmpty())
        {
            if(checkEmailValidation(emailString) )
            {

            }
            else{
                emailEditText.error="Your Email format is not correct"
                return
            }
        }
        else{
            emailEditText.error="please write email"
            return
        }
        if(passwordString.isNotEmpty())
        {
            if(checkPAsswordValidation(passwordString) )
            {

            }
            else{
                passwordEditText.error="Your Email format is not correct"
                return
            }
        }
        else{
            passwordEditText.error="please write email"
            return
        }

        val i= Intent(this, MainActivity::class.java)
        i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        i.putExtra("Useremail",emailString)
        startActivity(i)
    }

    private fun checkPAsswordValidation(passwordString: String): Boolean {
        return passwordString.length > 8

    }

    private fun checkEmailValidation(emailString: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(emailString).matches()
    }

    fun isValidPassword(password: String?): Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$"
        pattern = Pattern.compile(PASSWORD_PATTERN)
        matcher = pattern.matcher(password)
        return matcher.matches()
    }
//    private fun validPassword(passText: String): Boolean {
//        return passText.length > 6 && passText.length<12
//    }

    private fun emailValidation(emailText: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(emailText).matches()
    }

}