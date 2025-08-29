package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Leaderboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_leaderboard)


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