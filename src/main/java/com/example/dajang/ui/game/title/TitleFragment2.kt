package com.example.dajang.ui.game.title

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.dajang.R
import com.example.dajang.databinding.FragmentTitleBinding

class TitleFragment2 : Fragment() {

    private var _binding: FragmentTitleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState)
        _binding = FragmentTitleBinding.inflate(layoutInflater)
        val root: View = binding.root

        binding.startBtn.setOnClickListener {view:View->
            if (binding.etName.text!!.isNotEmpty()){
                val action = TitleFragment2Directions.actionTitleFragment2ToGameFragment2()
                action.nama = binding.etName.text.toString()
                findNavController().navigate(action)
            } else{
                Toast.makeText(context,"Masukkan nama kamu untuk memulai", Toast.LENGTH_SHORT).show()
            }

        }

        return root


    }

}