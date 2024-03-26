package com.learning.mollaapp.ui


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.learning.mollaapp.R

class DialogLanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_language)

        val englishButton: Button = findViewById(R.id.button_english)
        val indonesiaButton: Button = findViewById(R.id.button_indonesia)
        val exitButton: ImageButton =findViewById(R.id.button_exitquiz)

        englishButton.setOnClickListener((View.OnClickListener {
            val intent=Intent(this@DialogLanguageActivity, EnglishActivity::class.java)
            startActivity(intent)
        }))

        indonesiaButton.setOnClickListener((View.OnClickListener {
            val intent=Intent(this@DialogLanguageActivity, IndonesiaActivity::class.java)
            startActivity(intent)
        }))

        exitButton.setOnClickListener((View.OnClickListener {
            val intent=Intent(this@DialogLanguageActivity, MainActivity::class.java)
            startActivity(intent)
        }))
    }
}