package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val grammer: ImageView = findViewById(R.id.imageView25)

        grammer.setOnClickListener {
            val intent = Intent(this, Grammar1::class.java)
            startActivity(intent)
        }


        val vocabulary: ImageView = findViewById(R.id.imageView26)

        vocabulary.setOnClickListener {
            val intent = Intent(this, Vocabulary1::class.java)
            startActivity(intent)
        }


        val Listening: ImageView = findViewById(R.id.imageView27)

        Listening.setOnClickListener {
             val intent = Intent(this, Listening1::class.java)
            startActivity(intent)
        }


        val flashcards: ImageView = findViewById(R.id.imageView28)

        flashcards.setOnClickListener {
            val intent = Intent(this, Flashcard1::class.java)
            startActivity(intent)
        }


  //      val home: ImageView = findViewById<ImageView>(R.id.navigation_home)

 //       home.setOnClickListener {
 //           val intent = Intent(this, Home::class.java)
 //           startActivity(intent)
 //       }


//        val leaderboard: ImageView = findViewById<ImageView>(R.id.leaderboard)
//
//        leaderboard.setOnClickListener {
//            val intent = Intent(this, Leaderboard::class.java)
//            startActivity(intent)
//        }
//
//
//        val challenges: ImageView = findViewById<ImageView>(R.id.challenges)
//
//        challenges.setOnClickListener {
//            val intent = Intent(this, Challenges::class.java)
//            startActivity(intent)
//        }
//
//
//        val profile: ImageView = findViewById<ImageView>(R.id.profile)
//
//        profile.setOnClickListener {
//            val intent = Intent(this, Profile2::class.java)
//            startActivity(intent)
//        }

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