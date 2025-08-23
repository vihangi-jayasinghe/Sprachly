package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class OnBoardScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_board_screen2)

        lifecycleScope.launch {
            delay(2_000) // 50 seconds = 50,000 ms
            val intent = Intent(this@OnBoardScreen2, OnBoardScreen3::class.java)
            startActivity(intent)
            finish() // close MainActivity so user can't go back
        }
    }
}