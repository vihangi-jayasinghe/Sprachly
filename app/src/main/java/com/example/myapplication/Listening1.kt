package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Listening1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listening1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Listening: TextView = findViewById(R.id.titleText)

        // Set click listener
        Listening.setOnClickListener {
            // Navigate to HomeActivity (replace with your home screen activity class)
            val intent = Intent(this, Listening2::class.java)
            startActivity(intent)
        }

        // Home navigation
        findViewById<ImageView>(R.id.homeBtn10).setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        // Product / Leaderboard navigation
        findViewById<ImageView>(R.id.productBtn10).setOnClickListener {
            startActivity(Intent(this, Leaderboard::class.java))
        }

        // Experts / Challenges navigation
        findViewById<ImageView>(R.id.expertsBtn10).setOnClickListener {
            startActivity(Intent(this, Challenges::class.java))
        }

        // Profile navigation
        findViewById<ImageView>(R.id.profileBtn10).setOnClickListener {
            startActivity(Intent(this, Profile2::class.java))
        }
    }
}