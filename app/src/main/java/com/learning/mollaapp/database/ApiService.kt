package com.learning.mollaapp.database

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/quiz?language=indonesia")
    fun getQuestions(): Call<Response>

    @GET("/quiz?language=inggris")
    fun getQuestionsEnglish(): Call<Response>
}