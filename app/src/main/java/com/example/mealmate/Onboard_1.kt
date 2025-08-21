package com.example.mealmate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboard_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Step 2: Find the button and set click listener
        val nextButton: Button = findViewById(R.id.button)
        nextButton.setOnClickListener {
            // Navigate to Onboard_2 or Onboard_3
            val intent = Intent(this, Onboard_3::class.java)
            startActivity(intent)

            // Optional: close current activity so user can't go back
            // finish()
        }


    }
}