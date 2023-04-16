package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var catList: MutableList<SampleModel> = mutableListOf()
    private lateinit var sampleAdapter: SampleAdapter
    lateinit var imageDesc: MutableList<Int>
    lateinit var breedDesc: MutableList<String>
    lateinit var detailDesc: MutableList<String>
    lateinit var desc: MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        sampleAdapter = SampleAdapter(catList)
        val rView: RecyclerView = findViewById(R.id.rv)
        rView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = sampleAdapter
        }

        imageDesc = mutableListOf(
            R.drawable.balinese_cat,
            R.drawable.bengal_cat,
            R.drawable.birman_cat,
            R.drawable.burmese_cat,
            R.drawable.dragonli_cat,
            R.drawable.himalayan_cat,
            R.drawable.japanesebobtail_cat,
            R.drawable.korat_cat,
            R.drawable.orientalshorthair_cat,
            R.drawable.persian_cat,
            R.drawable.siamese_cat,
            R.drawable.singapura_cat,
            R.drawable.thai_cat,
            R.drawable.tonkinese_cat,
            R.drawable.turkishangora_cat
        )

        breedDesc = mutableListOf(
            "Balinese",
            "Bengal",
            "Birman",
            "Burmese",
            "Dragon Li",
            "Himalayan",
            "Japanese Bobtail",
            "Korat",
            "Oriental Shorthair",
            "Persian",
            "Siamese",
            "Singapura",
            "Thai",
            "Tonkinese",
            "Turkish Angora"
        )

        detailDesc = mutableListOf(
            getString(R.string.balinese),
            getString(R.string.bengal),
            getString(R.string.birman),
            getString(R.string.burmese),
            getString(R.string.dragonli),
            getString(R.string.himalayan),
            getString(R.string.japanesebobtail),
            getString(R.string.korat),
            getString(R.string.orientalshorthair),
            getString(R.string.persian),
            getString(R.string.balinese),
            getString(R.string.balinese),
            getString(R.string.balinese),
            getString(R.string.balinese),
            getString(R.string.balinese),
            )
    }

    fun loadData() {
        catList.add(SampleModel(R.drawable.balinese, "Balinese", "A medium sized cat with a fine-boned build and a semi-long haired, silky coat"))
        catList.add(SampleModel(R.drawable.bengal, "Bengal", "A muscular cat with a wild appearance, enhanced by the bold marbling on their coat."))
        catList.add(SampleModel(R.drawable.birman, "Birman", "A semi long-haired cat with a soft, luxuriant coat, blue eyes and pure white feet."))
        catList.add(SampleModel(R.drawable.burmese, "Burmese", "A solid, muscular cat with a sweet expression, neat round paws, and a short coat. "))
        catList.add(SampleModel(R.drawable.dragon_li, "Dragon Li", "A cat that exhibits a unique golden brown to a broken mackerel tabby pattern."))
        catList.add(SampleModel(R.drawable.himalayan, "Himalayan", "A medium-sized cat, very similar in appearance to the Persian cat"))
        catList.add(SampleModel(R.drawable.japanese_bobtail, "Japanese Bobtail", "A Japan domestic cat characterized by a short stumpy tail"))
        catList.add(SampleModel(R.drawable.korat, "Korat", "A medium sized cat with a robust, cobby build and large mobile ears"))
        catList.add(SampleModel(R.drawable.oriental_shorthair, "Oriental Shorthair", "A lean, medium sized cat with a heavy muscular athletic body"))
        catList.add(SampleModel(R.drawable.persian, "Persian", "A long-haired breed of cat characterized by a round face and short muzzle."))
        catList.add(SampleModel(R.drawable.siamese, "Siamese", "A demanding cat breed who loves being the centre of attention"))
        catList.add(SampleModel(R.drawable.singapura, "Singapura", "A pretty, elegant, muscular little cat but not harshly angular in build"))
        catList.add(SampleModel(R.drawable.thai, "Thai", "a medium sized cat, robust and cobby in build, but never large or coarse"))
        catList.add(SampleModel(R.drawable.tonkinese, "Tonkinese", "A cat with large eyes that range from green to light blue in colour."))
        catList.add(SampleModel(R.drawable.turkish_angora, "Turkish Angora", "It has a soft coat on a slender, finely-boned frame with a full, tapering tail."))
    }
}