package com.example.dajang.data

import com.example.dajang.R

object Constants {

    fun getQuestion(): ArrayList<Pertanyaan>{
        val  pertanyaanList = ArrayList<Pertanyaan> ()

        val que1 = Pertanyaan(
            1,
            "Apakah arti dari gambar di bawah benar?",
            R.drawable.qone,
            "Benar", "Salah", "Tidak tahu",
            1)

        val que2 = Pertanyaan(
            2,
            "Apakah arti dari gambar di bawah benar?",
            R.drawable.qtwo,
            "Benar", "Salah", "Tidak tahu",
            1)

        val que3 = Pertanyaan(
            3,
            "Apakah arti dari gambar di bawah benar?",
            R.drawable.qthree,
            "Benar", "Salah", "Tidak tahu",
            2)

        val que4 = Pertanyaan(
            4,
            "Apakah arti dari gambar di bawah benar?",
            R.drawable.qfour,
            "Benar", "Salah", "Tidak tahu",
            1)

        val que5 = Pertanyaan(
            5,
            "Apakah arti dari gambar di bawah benar?",
            R.drawable.qfive,
            "Benar", "Salah", "Tidak tahu",
            2)

        val que6 = Pertanyaan(
            6,
            "Apakah arti dari gambar di bawah benar?",
            R.drawable.qsix,
            "Benar", "Salah", "Tidak tahu",
            1)

        val que7 = Pertanyaan(
            7,
            "Apakah arti dari gambar di bawah benar?",
            R.drawable.qseven,
            "Benar", "Salah", "Tidak tahu",
            1)

        val que8 = Pertanyaan(
            8,
            "Apakah arti dari gambar di bawah benar?",
            R.drawable.qeight,
            "Benar", "Salah", "Tidak tahu",
            2)

        val que9 = Pertanyaan(
            9,
            "Apakah arti dari gambar di bawah benar?",
            R.drawable.qnine,
            "Benar", "Salah", "Tidak tahu",
            1)

        val que10 = Pertanyaan(
            10,
            "Apakah arti dari gambar di bawah benar?",
            R.drawable.qten,
            "Benar", "Salah", "Tidak tahu",
            2)











        pertanyaanList.add(que1)
        pertanyaanList.add(que2)
        pertanyaanList.add(que3)
        pertanyaanList.add(que4)
        pertanyaanList.add(que5)
        pertanyaanList.add(que6)
        pertanyaanList.add(que7)
        pertanyaanList.add(que8)
        pertanyaanList.add(que9)
        pertanyaanList.add(que10)



        return pertanyaanList
    }


}