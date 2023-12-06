package com.example.dajang.data

import com.example.dajang.R

object Question {

    fun getQuestion(): ArrayList<Pertanyaan>{
        val  pertanyaanList = ArrayList<Pertanyaan> ()

        val que1 = Pertanyaan(
            1,
            "Pilihlah jawaban yang tepat dari kalimat rumpang di bawah ini",
            R.drawable.qeleven,
            "비싸다", "싸다", "작다",
            1)

        val que2 = Pertanyaan(
            2,
            "Pilihlah jawaban yang tepat dari kalimat rumpang di bawah ini",
            R.drawable.qtwelve,
            "씽겁지", "맵지", "짜지",
            2)

        val que3 = Pertanyaan(
            3,
            "Pilihlah jawaban yang tepat dari kalimat rumpang di bawah ini",
            R.drawable.qthrteen,
            "옆에", "앞에", "뒤에",
            1)

        val que4 = Pertanyaan(
            4,
            "Pilihlah jawaban yang tepat dari kalimat rumpang di bawah ini",
            R.drawable.qfourteen,
            "할마니", "어머니", "아버지",
            3)

        val que5 = Pertanyaan(
            5,
            "Pilihlah jawaban yang tepat dari kalimat rumpang di bawah ini",
            R.drawable.qfiveteen,
            "연구원", "선생님", "변호사",
            1)

        val que6 = Pertanyaan(
            6,
            "Pilihlah jawaban yang tepat dari kalimat rumpang di bawah ini",
            R.drawable.qsixteen,
            "여름", "겨울", "가을",
            3)

        val que7 = Pertanyaan(
            7,
            "Pilihlah jawaban yang tepat dari kalimat rumpang di bawah ini",
            R.drawable.qseventeen,
            "휴대 전화", "공중 전화", "집 전화",
            1)

        val que8 = Pertanyaan(
            8,
            "Pilihlah jawaban yang tepat dari kalimat rumpang di bawah ini",
            R.drawable.qeightteen,
            "주었습니다", "받았어요", "골랐급니다",
            2)

        val que9 = Pertanyaan(
            9,
            "Pilihlah jawaban yang tepat dari kalimat rumpang di bawah ini",
            R.drawable.qnineteen,
            " 사진 찍기", "그림 그리기", "음막 감성",
            2)

        val que10 = Pertanyaan(
            10,
            "Pilihlah jawaban yang tepat dari kalimat rumpang di bawah ini",
            R.drawable.qtwenty,
            "지하철역", "공항", "기차역",
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