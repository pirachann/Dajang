package com.example.dajang.ui.game.score

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.dajang.databinding.FragmentScoreBinding
import com.example.dajang.ui.MenuActivity

class ScoreFragment2 : Fragment() {
    private var _binding: FragmentScoreBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        _binding = FragmentScoreBinding.inflate(layoutInflater)
        val root: View = binding.root

        val scoreArgs by navArgs<ScoreFragmentArgs>()
        binding.tvnama.text = "${scoreArgs.nama}"
        binding.skorHasil.text = "${scoreArgs.score} poin dari 10"


        binding.Kembali.setOnClickListener{
            val intent = Intent(context, MenuActivity::class.java)
            startActivity(intent)
        }
        return root
    }

}