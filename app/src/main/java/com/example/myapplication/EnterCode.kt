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

class EnterCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_enter_code)

        lifecycleScope.launch {
            delay(2_000) // 50 seconds = 50,000 ms
            val intent = Intent(this@EnterCode, PasswordChanged::class.java)
            startActivity(intent)
            finish() // close MainActivity so user can't go back
        }
    }
}