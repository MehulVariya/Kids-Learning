package com.learning.mollaapp.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.learning.mollaapp.R
import com.learning.mollaapp.database.ApiClient
import com.learning.mollaapp.database.Response
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response as RetrofitResponse // Alias untuk membedakan dengan kelas Response milik Anda

class IndonesiaActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private lateinit var originalSentenceTextView: TextView
    private lateinit var shuffledSentenceEditText: EditText
    private lateinit var submitButton: Button

    private var responseData: Response? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indonesia)

        // Inisialisasi UI
        resultTextView = findViewById(R.id.correct_translation)
        originalSentenceTextView = findViewById(R.id.original_sentence)
        shuffledSentenceEditText = findViewById(R.id.shuffled_sentence)
        submitButton = findViewById(R.id.submit_button)

        getQuestions()


        submitButton.setOnClickListener {
            checkUserAnswer()
        }
    }

    private fun getQuestions() {
        val call: Call<Response> = ApiClient.apiService.getQuestions()

        call.enqueue(object : Callback<Response> {
            override fun onResponse(
                call: Call<Response>,
                response: RetrofitResponse<Response>
            ) {
                if (response.isSuccessful) {
                    responseData = response.body()

                    val resultText = responseData?.sentence?.correct_translation ?: "Data API tidak valid."
                    resultTextView.text = resultText
                    originalSentenceTextView.text = responseData?.sentence?.original_sentence ?: "Data API tidak valid."
                    resultTextView.text = resultText
                    shuffledSentenceEditText.setText(responseData?.sentence?.shuffled_sentence)
                } else {
                    resultTextView.text = getString(R.string.api_error)
                }
            }

            override fun onFailure(call: Call<Response>, t: Throwable) {
                resultTextView.text = getString(R.string.error_message, t.message)
            }
        })
    }

    private fun checkUserAnswer() {

        val userAnswer = shuffledSentenceEditText.text.toString()
        val correctAnswer = responseData?.sentence?.correct_translation ?: ""
        val isCorrect = userAnswer.equals(correctAnswer, ignoreCase = true)

        if (isCorrect) {
            showToast("Jawaban benar!")
        } else {
            showToast("Jawaban salah. Coba lagi.")
        }


        getQuestions()
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
