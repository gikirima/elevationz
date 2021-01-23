package com.example.elevationz

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Html.FROM_HTML_MODE_LEGACY
import android.text.Html.fromHtml
import android.text.Spanned
import android.widget.Button
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apel: String = getString(R.string.maindesc2)
        val monyet: Spanned = fromHtml(apel, FROM_HTML_MODE_LEGACY)
//for button clicking
        var pilih = findViewById<Button>(R.id.pilih)
        pilih.setOnClickListener {
            val intent = Intent(this, museumlist::class.java)
            startActivity(intent)
        }
    }
}