package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class FavoriteNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_number)

        val favoriteNumberTextView: TextView = findViewById(R.id.favorite_number)

        favoriteNumberTextView.text = "My Favorite Number is: 7!"
    }
}