package com.example.elevationz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class DeskripsiMuseum : AppCompatActivity(), OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi_museum)


        if (getString(R.string.key).isEmpty()) {
            Toast.makeText(this, "Add your own API key in MapWithMarker/app/secure.properties as MAPS_API_KEY=YOUR_API_KEY", Toast.LENGTH_LONG).show()
        }
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.maps) as SupportMapFragment
        mapFragment.getMapAsync(this)

        var keliling = findViewById<Button>(R.id.keliling)
        keliling.setOnClickListener {
            val mulai = Intent(this, KelilingMuseumLouvre::class.java)
            startActivity(mulai)
        }

        var backtolist = findViewById<ImageButton>(R.id.backtolist)
        backtolist.setOnClickListener {
            val kembali = Intent(this, museumlist::class.java)
            startActivity(kembali)
        }

    }


    override fun onMapReady(googleMap: GoogleMap) {
        googleMap?.apply {
            val louvre = LatLng(48.860738130823975, 2.3377512867509465)
            addMarker(
                MarkerOptions()
                    .position(louvre)
                    .title("Museum Louvre")
            )
            // [START_EXCLUDE silent]
            moveCamera(CameraUpdateFactory.newLatLng(louvre))
            // [END_EXCLUDE]
        }
    }


}