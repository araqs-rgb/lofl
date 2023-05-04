package com.example.lofl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class inputChat : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_chat)



        val imgBtn = findViewById<ImageView>(R.id.imageBackMess)
        imgBtn.setOnClickListener {
            finish()
        }


    }

}