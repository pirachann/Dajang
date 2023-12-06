package com.example.dajang.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dajang.databinding.ActivityMenuBinding
import com.example.dajang.ui.game.quiz.LevelQuizActivity

class MenuActivity : AppCompatActivity() {

    private var _binding: ActivityMenuBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(_binding?.root)

        binding.btnKosakata.setOnClickListener{
            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnKuis.setOnClickListener{
            val intent= Intent(this, LevelQuizActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}