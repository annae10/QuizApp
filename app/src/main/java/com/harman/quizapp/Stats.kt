package com.harman.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Stats : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)
        supportActionBar?.hide()
    }
}