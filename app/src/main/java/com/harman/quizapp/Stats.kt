package com.harman.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Stats : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)
        supportActionBar?.hide()

        val allStat: ArrayList<StatFeed> = ArrayList()
        allStat.add(StatFeed("Total Score", R.drawable.achievement))
        allStat.add(StatFeed("Total Test", R.drawable.plan))
        allStat.add(StatFeed("Previous Score", R.drawable.timetable))
        allStat.add(StatFeed("Time Taken", R.drawable.alarm_clock))

        val simpleGrid: GridView = findViewById<GridView>(R.id.gridView)
        simpleGrid.adapter = StatAdapter(this, allStat)

        val nextBtn = findViewById<ImageButton>(R.id.next_button)
        nextBtn.setOnClickListener{
            val intent: Intent = Intent(this, Category::class.java)
            startActivity(intent)
        }
    }
}