package ru.dillab.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonOnSecondActivity: Button = findViewById(R.id.button_on_second_activity)

        buttonOnSecondActivity.setOnClickListener {
            // Each click on the button "back" is counted
            // and then displayed on MainActivity screen
            MainActivity.counterOfIntentTransitions++

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}