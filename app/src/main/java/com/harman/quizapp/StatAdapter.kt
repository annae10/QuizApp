package com.harman.quizapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class StatAdapter(private val context: Context,
                  private val AllStats: ArrayList<StatFeed>
) : BaseAdapter(){
    override fun getCount(): Int {
        return AllStats.count()
    }

    override fun getItem(p0: Int): Any {
        return p0.toLong()
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        val mainRow: View = layoutInflater.inflate(R.layout.itemlist, p2, false)

        val statText: TextView = mainRow.findViewById(R.id.stat_text)
        val statImg: ImageView = mainRow.findViewById(R.id.stat_image)

        statText.text = AllStats[p0].name
        statImg.setImageResource(AllStats[p0].image)

        return mainRow
    }
}