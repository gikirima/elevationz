package com.example.elevationz

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class museumlist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_museumlist)
//        Button louvre
        var list1 = findViewById<ImageButton>(R.id.louvre)
        list1.setOnClickListener {
            val intent = Intent(this, DeskripsiMuseum::class.java)
            startActivity(intent)
        }
//        Button back
        var backbutton = findViewById<ImageButton>(R.id.backtohome)
        backbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

//        Button request
        var reqst = findViewById<Button>(R.id.museumrequest)
        reqst.setOnClickListener {

            val uri: Uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdwNdhb8sKsXU6ALHkjpeYHmYC_j9VHluVF4jTA0X2E_O0ONg/viewform")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }


    }
}