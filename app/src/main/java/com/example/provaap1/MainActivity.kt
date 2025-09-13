package com.example.provaap1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.provaap1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEx7.setOnClickListener {
            val intent = Intent(this, ex7::class.java)
            startActivity(intent)
        }

        binding.btnEx11.setOnClickListener {
            val intent = Intent(this, ex11::class.java)
            startActivity(intent)
        }
    }
}