package ru.dillab.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // To access to the variable counterOfIntentTransitions from another activity
    // I had to create companion object
    companion object {
        var counterOfIntentTransitions = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOnMainActivity: Button = findViewById(R.id.button_on_main_activity)

        // Main pattern of intent
        // When you click on button, second activity starts
        buttonOnMainActivity.setOnClickListener {
            // Intent parameters (reference to activity we are starting from,
            // reference to activity we want to go to)
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val textOnMainActivity: TextView = findViewById(R.id.text_on_main_activity)
        textOnMainActivity.text = counterOfIntentTransitions.toString()
    }
}