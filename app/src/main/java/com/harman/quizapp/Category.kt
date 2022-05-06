package com.harman.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val start_button: ImageButton = findViewById(R.id.startBtn)
        val intent: Intent = Intent(this, Questions::class.java)

        start_button.setOnClickListener {
            startActivity(intent)
        }
    }
}