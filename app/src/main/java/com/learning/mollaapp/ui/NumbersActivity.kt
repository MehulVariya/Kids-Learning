package com.learning.mollaapp.ui

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.learning.mollaapp.R

class NumbersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

        val hurufTextView: TextView = findViewById(R.id.huruf)
        val angka_0: ImageButton = findViewById(R.id.image_zero)
        val angka_1: ImageButton = findViewById(R.id.image_one)
        val angka_2: ImageButton = findViewById(R.id.image_two)
        val angka_3: ImageButton= findViewById(R.id.image_three)
        val angka_4: ImageButton= findViewById(R.id.image_four)
        val angka_5: ImageButton= findViewById(R.id.image_five)
        val angka_6: ImageButton = findViewById(R.id.image_six)
        val angka_7: ImageButton= findViewById(R.id.image_seven)
        val angka_8: ImageButton= findViewById(R.id.image_eight)
        val angka_9: ImageButton= findViewById(R.id.image_nine)
        val angka_10: ImageButton= findViewById(R.id.image_ten)


        angka_0.setOnClickListener {
            val teksView = "Zero"
            hurufTextView.text = teksView
        }

        angka_1.setOnClickListener {
            val teksView = "One"
            hurufTextView.text = teksView
        }

        angka_2.setOnClickListener {
            val teksView = "Two"
            hurufTextView.text = teksView
        }

        angka_3.setOnClickListener {
            val teksView = "Three"
            hurufTextView.text = teksView
        }

        angka_4.setOnClickListener {
            val teksView = "Four"
            hurufTextView.text = teksView
        }

        angka_5.setOnClickListener {
            val teksView = "Five"
            hurufTextView.text = teksView
        }

        angka_6.setOnClickListener {
            val teksView = "Six"
            hurufTextView.text = teksView
        }

        angka_7.setOnClickListener {
            val teksView = "Seven"
            hurufTextView.text = teksView
        }

        angka_8.setOnClickListener {
            val teksView = "Eight"
            hurufTextView.text = teksView
        }

        angka_9.setOnClickListener {
            val teksView = "Nine"
            hurufTextView.text = teksView
        }

        angka_10.setOnClickListener {
            val teksView = "Ten"
            hurufTextView.text = teksView
        }

    }

}