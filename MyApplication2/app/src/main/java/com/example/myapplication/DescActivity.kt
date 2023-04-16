package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DescActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_desc)

        val imageDescription: ImageView = findViewById(R.id.image_desc)
        val breedDescription: TextView = findViewById(R.id.breed_desc)
        val detailDescription: TextView = findViewById(R.id.detail_desc)

        val bundle: Bundle? = intent.extras
        val imageDesc = bundle!!.getInt("imageDesc")
    }
}