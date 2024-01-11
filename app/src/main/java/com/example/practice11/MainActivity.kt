package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button: Button = findViewById(R.id.button)

        Button.setOnClickListener(){
            OnClick()
        }
    }

    fun OnClick(){
        val imageView: ImageView = findViewById(R.id.imageView3)
        imageView.setImageResource(R.drawable.pear);
    }
}