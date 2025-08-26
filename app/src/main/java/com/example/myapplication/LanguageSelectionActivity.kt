package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R


class LanguageSelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board_screen4) // Your XML file name

        // 1. Get references to your Spinners
        val motherTongueSpinner: Spinner = findViewById(R.id.spinner3)
        val targetLanguageSpinner: Spinner = findViewById(R.id.spinner2)

        // 2. Prepare the data for the spinners (e.g., list of languages)
        // You would typically get this from strings.xml, a database, or an API
        val languages = arrayOf("English", "Spanish", "French", "German", "Hindi", "Mandarin")

        // 3. Create ArrayAdapter for Mother Tongue Spinner
        val motherTongueAdapter = ArrayAdapter(
            this, // Context
            android.R.layout.simple_spinner_item, // Layout for the selected item
            languages // Array of data
        )
        // Specify the layout to use when the list of choices appears
        motherTongueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        motherTongueSpinner.adapter = motherTongueAdapter

        // 4. Create ArrayAdapter for Target Language Spinner
        val targetLanguageAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            languages
        )
        targetLanguageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        targetLanguageSpinner.adapter = targetLanguageAdapter

        // 5. (Optional) Set up item selection listeners to know when a user selects a language
        motherTongueSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedLanguage = parent.getItemAtPosition(position).toString()
                // Do something with the selected mother tongue, e.g., Toast.makeText(this@LanguageSelectionActivity, "Mother Tongue: $selectedLanguage", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Another interface callback
            }
        }

        targetLanguageSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedLanguage = parent.getItemAtPosition(position).toString()
                // Do something with the selected target language
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Another interface callback
            }
        }
    }
}
