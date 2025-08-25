package com.iogando.app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var btnTrocar: Button
    private var currentImg = 0
    private val images = listOf(
        R.drawable.fundo1,
        R.drawable.fundo2,
        R.drawable.fundo3,
        R.drawable.fundo4
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        btnTrocar = findViewById(R.id.btnTrocar)

        imageView.setImageResource(images[currentImg])

        btnTrocar.setOnClickListener {
            currentImg = (currentImg + 1) % images.size
            imageView.setImageResource(images[currentImg])
        }
    }
}
