package com.example.dajang.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import androidx.recyclerview.widget.GridLayoutManager
import com.example.dajang.R
import com.example.dajang.adapter.KategoriAdapter
import com.example.dajang.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var adapter: KategoriAdapter
    private var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(_binding?.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
//        supportActionBar?.setHomeAsUpIndicator(R.drawable.logo2)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setTitle("")

        showRecycleView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.button_me -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecycleView(){
        adapter = KategoriAdapter()
        binding.apply {
            rvhome.layoutManager = GridLayoutManager(this@HomeActivity, 2)
            rvhome.setHasFixedSize(true)
            rvhome.adapter = adapter
        }
    }


}