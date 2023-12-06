package com.example.dajang.data

data class Pertanyaan (

    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val correctAnswer: Int

)