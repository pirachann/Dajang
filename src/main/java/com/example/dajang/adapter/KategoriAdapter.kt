package com.example.dajang.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dajang.ui.ListActivity
import com.example.dajang.R
import com.example.dajang.data.kategori

class KategoriAdapter(private var data: List<kategori> = kategori.loadData()): RecyclerView.Adapter<KategoriAdapter.ListKategoriAdapter>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListKategoriAdapter {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return ListKategoriAdapter(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ListKategoriAdapter, position: Int) {
        val(img,title) =data[position]
        holder.img.setImageResource(img)
        holder.txt.text = title
        holder.itemView.setOnClickListener {
            val detailIntent = Intent(holder.itemView.context, ListActivity::class.java)
            detailIntent.putExtra("key_words", data[holder.adapterPosition])
            holder.itemView.context.startActivity(detailIntent)
        }
    }

    class ListKategoriAdapter(itemView: View): RecyclerView.ViewHolder(itemView) {
        val img:ImageView = itemView.findViewById(R.id.imageView)
        val txt: TextView = itemView.findViewById(R.id.text)
    }

}