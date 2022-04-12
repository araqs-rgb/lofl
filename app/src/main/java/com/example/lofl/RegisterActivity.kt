package com.example.lofl

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.lofl.databinding.ActivityMainBinding
import com.example.lofl.databinding.ActivityRegisterBinding
import com.google.firebase.database.DatabaseReference


class RegisterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val imgBtn = findViewById<ImageView>(R.id.imageBack)
        imgBtn.setOnClickListener {
            finish()
        }

        val buttonClick = findViewById<Button>(R.id.next)
        buttonClick.setOnClickListener {
            val intent = Intent(this, RegisterStep3Activity::class.java)
            startActivity(intent)
        }

    }
}