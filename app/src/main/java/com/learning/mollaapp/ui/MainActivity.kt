package com.learning.mollaapp.ui


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.getbase.floatingactionbutton.FloatingActionButton
import com.learning.mollaapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val learningAlphabet: ImageView= findViewById(R.id.btn_alphabet)
        val learningNumbers: ImageView= findViewById(R.id.btn_numbers)
        val aboutButton: FloatingActionButton = findViewById(R.id.aboutbtn)
        val quizButton: FloatingActionButton = findViewById(R.id.btn_quiz)

        aboutButton.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        })

        learningAlphabet.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, AlphabetActivity::class.java)
            startActivity(intent)
        })

        learningNumbers.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, NumbersActivity::class.java)
            startActivity(intent)
        })

        quizButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, DialogLanguageActivity::class.java)
            startActivity(intent)
        })

    }
}
