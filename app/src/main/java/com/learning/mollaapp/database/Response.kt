package com.learning.mollaapp.database

data class Response(
	val sentence: Sentence? = null,
	val question_id: String? = null
)

data class Sentence(
	val original_sentence: String? = null,
	val correct_translation: String? = null,
	val shuffled_sentence: String? = null
)

