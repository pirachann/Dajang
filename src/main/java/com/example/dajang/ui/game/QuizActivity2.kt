package com.example.dajang.ui.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dajang.R

class QuizActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    @Override
    public override fun onBackPressed() {
    }
}