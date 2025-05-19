package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button by its ID
        val buttonShowToast = findViewById<Button>(R.id.buttonShowToast)
        
        // Set a click listener to the button
        buttonShowToast.setOnClickListener {
            // Show a toast message when the button is clicked
            Toast.makeText(this, "Hello World Button Clicked!", Toast.LENGTH_SHORT).show()
        }

        // Find the TextInputEditText by its ID
        val textInput = findViewById<TextInputEditText>(R.id.textInputEditText)
        
        // Example of setting a focus change listener
        textInput.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                // You can perform actions when focus is lost, like validation
                val inputText = textInput.text.toString()
                if (inputText.isNotEmpty()) {
                    Toast.makeText(this, "Input received: $inputText", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
