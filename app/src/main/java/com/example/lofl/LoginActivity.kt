package com.example.lofl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.lofl.FinalBottom

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonClick = findViewById<Button>(R.id.login)
        buttonClick.setOnClickListener {
            val intent = Intent(this, FinalBottom::class.java)
            startActivity(intent)
        }

        val imgBtn = findViewById<ImageView>(R.id.imageBack)
        imgBtn.setOnClickListener {
            finish()
        }
    }
}