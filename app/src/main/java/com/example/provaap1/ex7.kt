package com.example.provaap1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.provaap1.databinding.ActivityEx7Binding

class ex7 : AppCompatActivity() {
    private lateinit var binding: ActivityEx7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEx7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnResolver.setOnClickListener {
            val numero = binding.editText.text.toString()
            val antecessor: Int = numero.toInt() - 1
            val sucessor: Int = numero.toInt() + 1
            binding.resultado1.setText("Antecessor de $numero é $antecessor")
            binding.resultado2.setText("Sucessor de $numero é $sucessor")
        }
    }
}