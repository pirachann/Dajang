package com.example.dajang.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dajang.R
import com.example.dajang.adapter.WordAdapter
import com.example.dajang.data.kategori
import com.example.dajang.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("")

        val dataWords = intent.getParcelableExtra<kategori>("key_words")
        var adapters = dataWords?.let { WordAdapter(it) }
        binding.apply {
            txtDetail.text = dataWords?.title
            dataWords?.image?.let { imgDetail.setImageResource(it) }
            rvlist.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(this@ListActivity)
                adapter = adapters
            }

        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}