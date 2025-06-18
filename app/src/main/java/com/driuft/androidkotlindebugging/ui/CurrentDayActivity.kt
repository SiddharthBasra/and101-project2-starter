package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import java.util.Calendar

class CurrentDayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_day)


        val calendar = Calendar.getInstance()

        val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)


        val dayStringResId: Int = when (dayOfWeek) {
            Calendar.SUNDAY -> R.string.sunday
            Calendar.MONDAY -> R.string.monday
            Calendar.TUESDAY -> R.string.tuesday
            Calendar.WEDNESDAY -> R.string.wednesday
            Calendar.THURSDAY -> R.string.thursday
            Calendar.FRIDAY -> R.string.friday
            Calendar.SATURDAY -> R.string.saturday
            else -> R.string.app_name
        }


        val dayDisplayTextView: TextView = findViewById(R.id.current_day_text)


        dayDisplayTextView.text = getString(dayStringResId)
    }

}