package com.asadov.thebignerdranchguide

import android.os.Bundle

import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener {
            // Do something in response to the click here
            Toast.makeText(
                this,
                R.string.correct_toast,
                Toast.LENGTH_LONG).show()
        }

        falseButton.setOnClickListener {
            // Do something in response to the click here
            Toast.makeText(this,
                R.string.incorrect_toast,
                Toast.LENGTH_LONG).show()
        }
    }
}