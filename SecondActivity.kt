package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Find the button by its ID
        val buttonShowToast = findViewById<Button>(R.id.buttonShowToast2)
        
        // Set a click listener to the button
        buttonShowToast.setOnClickListener {
            // Show a different toast message when the button is clicked
            Toast.makeText(this, "Welcome to Activity 2 Button Clicked!", Toast.LENGTH_SHORT).show()
        }

        // Find the TextInputEditText by its ID
        val textInput = findViewById<TextInputEditText>(R.id.textInputEditText2)
        
        // Example of setting a focus change listener
        textInput.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                // You can perform actions when focus is lost, like validation
                val inputText = textInput.text.toString()
                if (inputText.isNotEmpty()) {
                    Toast.makeText(this, "Input received in Activity 2: $inputText", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
