package com.example.kotlin54.ui.actitvity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin54.R
import com.example.kotlin54.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}