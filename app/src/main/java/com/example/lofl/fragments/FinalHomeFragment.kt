package com.example.lofl.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.example.lofl.FinalBottom
import com.example.lofl.R
import com.example.lofl.input_room

class FinalHomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<CardView>(R.id.homes1).setOnClickListener {
            val card1 = Intent(activity, input_room::class.java)
            activity?.startActivity(card1)
        }
        view.findViewById<CardView>(R.id.homes2).setOnClickListener {
            val card2 = Intent(activity, input_room::class.java)
            activity?.startActivity(card2)
        }
        view.findViewById<CardView>(R.id.homes3).setOnClickListener {
            val card3 = Intent(activity, input_room::class.java)
            activity?.startActivity(card3)
        }
        view.findViewById<CardView>(R.id.homes4).setOnClickListener {
            val card4 = Intent(activity, input_room::class.java)
            activity?.startActivity(card4)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_final_home, container, false)
    }

    }