package com.example.dajang.ui.game.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dajang.R
import com.example.dajang.databinding.ActivityLevelQuizBinding
import com.example.dajang.databinding.ActivityMenuBinding
import com.example.dajang.ui.game.QuizActivity1
import com.example.dajang.ui.game.QuizActivity2

class LevelQuizActivity : AppCompatActivity() {

    private var _binding: ActivityLevelQuizBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLevelQuizBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("")

        binding.btnTrueorfalse.setOnClickListener{
            val intent = Intent(this, QuizActivity1::class.java)
            startActivity(intent)
        }

        binding.btnClozetest.setOnClickListener{
            val intent = Intent(this, QuizActivity2::class.java)
            startActivity(intent)
        }
    }
}