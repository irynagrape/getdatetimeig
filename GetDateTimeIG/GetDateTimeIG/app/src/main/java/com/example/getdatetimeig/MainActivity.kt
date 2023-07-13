package com.example.getdatetimeig

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.timepicker.TimeFormat
import java.text.DateFormat
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendar = Calendar.getInstance().time
        val dateFormat = DateFormat.getDateInstance(DateFormat.FULL).format(calendar)

        val timeFormat = DateFormat.getTimeInstance(DateFormat.SHORT).format(calendar)

        val dateTextView = findViewById<TextView>(R.id.xml_text_date)
        val timeTextView = findViewById<TextView>(R.id.xml_text_time)


        dateTextView. text = dateFormat
        timeTextView.text = timeFormat


    }
}