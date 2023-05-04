package com.example.lofl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TabHost
import android.widget.Toast
import com.example.lofl.FinalBottom
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {


        auth = Firebase.auth
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val imgBtn = findViewById<ImageView>(R.id.imageBack)
        imgBtn.setOnClickListener {
            finish()
        }
        val loginButton: Button = findViewById(R.id.loginLog)
        loginButton.setOnClickListener{
            performLogin()
        }
    }

    private fun performLogin() {
        val email:EditText = findViewById(R.id.emailLog)
        val passwd:EditText = findViewById(R.id.passwordLog)

        if(email.text.isEmpty() || passwd.text.isEmpty()){
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            return
        }

        val emailInput = email.text.toString()
        val passwdInput = passwd.text.toString()

        auth.signInWithEmailAndPassword(emailInput, passwdInput)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information

                    val intent = Intent(this, FinalBottom::class.java)
                    startActivity(intent)

                    Toast.makeText(baseContext, "Authentication success.",
                        Toast.LENGTH_SHORT,).show()

                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(
                        baseContext,
                        "Authentication failed.",
                        Toast.LENGTH_SHORT,
                    ).show()
                }
            }
            .addOnFailureListener{
                Toast.makeText(this, "Error occurred ${it.localizedMessage}" , Toast.LENGTH_SHORT)
                    .show()
            }

    }
}