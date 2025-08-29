package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Profile2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

        // Logout button
        findViewById<Button>(R.id.logoutBtn).setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish() // Close Profile2 so user can't return by back press
        }
    }
}
