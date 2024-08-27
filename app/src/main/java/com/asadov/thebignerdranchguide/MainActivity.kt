package com.asadov.thebignerdranchguide

import android.os.Bundle
import android.view.View

import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
            // Do something in response to the click here
            Snackbar.make(view, R.string.correct_toast, 4000).show()
        }

        falseButton.setOnClickListener { view: View ->
            // Do something in response to the click here
            Snackbar.make(view, R.string.incorrect_toast, BaseTransientBottomBar.LENGTH_INDEFINITE)
                .show()
        }
    }
}