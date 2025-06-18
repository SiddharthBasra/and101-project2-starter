package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class PrintListActivity : AppCompatActivity() {


    private val words = listOf(
        "this",
        "is",
        "your",
        "standard",
        "immutable",
        "List"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_list)

        val wordList: TextView = findViewById(R.id.word_list)

        wordList.text = combinedWords()
    }

    private fun combinedWords(): String {
        var combined = ""
        for (idx in 0 until words.size) {
            combined += "${words[idx]}"
            if (idx < words.size - 1) {
                combined += "\n"
            }
        }
        return combined
    }
}