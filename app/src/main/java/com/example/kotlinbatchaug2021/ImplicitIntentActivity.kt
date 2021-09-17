package com.example.kotlinbatchaug2021

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ShareCompat
import kotlinx.android.synthetic.main.activity_implicit_intent.*
import java.net.URI

class ImplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)


    }
    fun openShareBox(view: View) {
        ShareCompat.IntentBuilder.from(this)
            .setChooserTitle("Please selct app")
            .setText("PLease like and download my app.")
            .setType("Plain/text")
            .startChooser()
    }
    fun openURL(view: View) {
        var webURL: Uri =Uri.parse(webURL.text.toString())
        var i = Intent(Intent.ACTION_VIEW,webURL)
        startActivity(i)
    }
    fun openDialPad(view: View) {
        var webURL: Uri =Uri.parse("tel:"+webURL.text.toString())
        var i = Intent(Intent.ACTION_DIAL,webURL)
        startActivity(i)
    }
    fun openMap(view: View) {
        var webURL: Uri =Uri.parse("geo:0,0?q="+webURL.text.toString())
        var i = Intent(Intent.ACTION_VIEW,webURL)

        startActivity(i)
    }
}