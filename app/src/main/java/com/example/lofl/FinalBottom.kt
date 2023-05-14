package com.example.lofl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.lofl.R
import com.example.lofl.fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class FinalBottom : AppCompatActivity() {

    private val homeFragment = FinalHomeFragment()
    private val messageFragment = FinalMessageFragment()
    private val profileFragment = FinalProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_bottom)

        replaceFragment(homeFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottomNavigationView)


        bottom_navigation.setOnNavigationItemSelectedListener() {
            when(it.itemId){
                R.id.NavHome -> replaceFragment(homeFragment)
                R.id.NavMessage -> replaceFragment(messageFragment)
                R.id.NavProfile -> replaceFragment(profileFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.Frame_layout,fragment)
            transaction.commit()
        }
    }
}