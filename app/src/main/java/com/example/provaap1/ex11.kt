package com.example.provaap1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.provaap1.databinding.ActivityEx11Binding


class ex11 : AppCompatActivity() {
    private lateinit var binding: ActivityEx11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEx11Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnResolver.setOnClickListener {
            val altura = binding.altura.text.toString()
            val largura = binding.largura.text.toString()
            val area: Int = (largura.toInt()) * (altura.toInt())
            val litros: Int = area/2
            binding.resultado.setText("$litros Litros para pintar $area m2")
        }
    }
}