package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OnBoardScreen4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board_screen4)

        val motherTongueSpinner: Spinner = findViewById(R.id.spinner3)
        val targetLanguageSpinner: Spinner = findViewById(R.id.spinner2)
        val nextButton: Button = findViewById(R.id.onBoardbtn1)

        // Language list
        val languages = arrayOf("English", "Spanish", "French", "German", "Hindi", "Mandarin")

        // Mother tongue adapter
        val motherTongueAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            languages
        )
        motherTongueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        motherTongueSpinner.adapter = motherTongueAdapter

        // Target language adapter
        val targetLanguageAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            languages
        )
        targetLanguageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        targetLanguageSpinner.adapter = targetLanguageAdapter

        // Listeners
        motherTongueSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                Toast.makeText(this@OnBoardScreen4, "Mother Tongue: ${parent.getItemAtPosition(position)}", Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        targetLanguageSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                Toast.makeText(this@OnBoardScreen4, "Target Language: ${parent.getItemAtPosition(position)}", Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        // Continue button
        nextButton.setOnClickListener {
            val intent = Intent(this, CreateSuccess::class.java)
            startActivity(intent)
        }
    }
}
