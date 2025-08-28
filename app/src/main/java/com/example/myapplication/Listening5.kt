package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Listening5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listening5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Listening: Button = findViewById(R.id.btnContinue)

        // Set click listener
        Listening.setOnClickListener {
            // Navigate to HomeActivity (replace with your home screen activity class)
            val intent = Intent(this, Listening1::class.java)
            startActivity(intent)
        }
//
        val listening: Button = findViewById(R.id.btnBackHome)
//
        // Set click listener
        listening.setOnClickListener {
            // Navigate to HomeActivity (replace with your home screen activity class)
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}