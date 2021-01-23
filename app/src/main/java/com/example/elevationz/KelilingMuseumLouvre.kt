package com.example.elevationz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KelilingMuseumLouvre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keliling_museum_louvre)

        var homebbutton = findViewById<ImageButton>(R.id.homeicon)
        homebbutton.setOnClickListener {
            var takemehome = Intent(this, MainActivity::class.java)
            startActivity(takemehome)
        }

        var backtodesc = findViewById<ImageButton>(R.id.backtodesc)
        backtodesc.setOnClickListener {
            var backdesc = Intent(this, DeskripsiMuseum::class.java)
            startActivity(backdesc)
        }

    }
}