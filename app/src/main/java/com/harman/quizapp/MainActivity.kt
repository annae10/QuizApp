package com.harman.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button);
        button.setOnClickListener{

            val intent = Intent(this, Stats::class.java)
            startActivity(intent)
        }
    }
}