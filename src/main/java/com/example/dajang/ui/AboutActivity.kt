package com.example.dajang.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dajang.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("")
    }
}