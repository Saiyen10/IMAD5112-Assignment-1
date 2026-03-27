package com.SaiyenGovender.imad5112assignment1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Tag for logging
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference to UI elements
        val etTimeOfDay = findViewById<EditText>(R.id.etTimeOfDay)
        val btnGetSpark = findViewById<Button>(R.id.btnGetSpark)
        val tvSuggestion = findViewById<TextView>(R.id.tvSuggestion)
        val btnReset = findViewById<Button>(R.id.btnReset)

        Log.d(TAG, "App started successfully")

        // Get Spark button click
        btnGetSpark.setOnClickListener {
            val timeOfDay = etTimeOfDay.text.toString().trim().lowercase()
            Log.d(TAG, "User entered: $timeOfDay")

            // If statements for social sparks
            if (timeOfDay == "morning") {
                tvSuggestion.text = "🌅 Send a 'Good Morning' text to a family member!"
            } else if (timeOfDay == "mid-morning") {
                tvSuggestion.text = "☕ Reach out to a colleague with a quick 'Thank you'!"
            } else if (timeOfDay == "afternoon") {
                tvSuggestion.text = "😂 Share a funny meme or interesting link with a friend!"
            } else if (timeOfDay == "afternoon snack time") {
                tvSuggestion.text = "💭 Send a quick 'Thinking of you' message!"
            } else if (timeOfDay == "dinner") {
                tvSuggestion.text = "📞 Call a friend or relative for a 5-minute catch-up!"
            } else if (timeOfDay == "after dinner" || timeOfDay == "night") {
                tvSuggestion.text = "💬 Leave a thoughtful comment on a friend's post!"
            } else {
                tvSuggestion.text = "❌ Oops! Please enter a valid time of day (e.g. Morning, Afternoon, Dinner)"
                Log.d(TAG, "Invalid input entered: $timeOfDay")
            }
        }

        // Reset button click
        btnReset.setOnClickListener {
            etTimeOfDay.text.clear()
            tvSuggestion.text = ""
            Log.d(TAG, "App reset by user")
        }
    }
}