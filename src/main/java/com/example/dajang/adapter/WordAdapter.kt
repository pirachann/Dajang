package com.example.dajang.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.dajang.R
import com.example.dajang.data.kategori
import com.example.dajang.data.word
import com.example.dajang.databinding.ItemViewBinding

class WordAdapter(private val listWord: kategori): RecyclerView.Adapter<WordAdapter.WordViewHolder>() {
    class WordViewHolder(val binding: ItemViewBinding): RecyclerView.ViewHolder(binding.root){
        private enum class ToggleStatus {
            HIDE,
            EXPAND,
        }

        private var currentStatus: MutableLiveData<ToggleStatus> = MutableLiveData(ToggleStatus.HIDE)

        fun bind(words : word){

            binding.apply {
                tvKosakata.text = words.word
                tvExample.text = words.example
                btnCt.setOnClickListener {
                    if(currentStatus.value == ToggleStatus.HIDE) {
                        currentStatus.value = ToggleStatus.EXPAND
                    }else {
                        currentStatus.value = ToggleStatus.HIDE
                    }
                }

                currentStatus.observe(binding.root.context as LifecycleOwner) {
                    if(it == ToggleStatus.HIDE) {
                        binding.btnCt.setImageDrawable(ContextCompat.getDrawable(binding.root.context,
                            R.drawable.ic_button_down))
                        binding.layoutMore.visibility = View.GONE
                    } else {
                        binding.btnCt.setImageDrawable(ContextCompat.getDrawable(binding.root.context,R.drawable.ic_button_show))
                        binding.layoutMore.visibility = View.VISIBLE
                    }
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val view = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WordViewHolder(view)
    }

    override fun getItemCount(): Int = listWord.list.size

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.bind(listWord.list[position])
    }
}