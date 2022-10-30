package com.example.doesangue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doesangue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cadastreSe.setOnClickListener{
            val cadastrar = Intent(this,Cadastro::class.java)
            startActivity(cadastrar)
        }

        binding.teste.setOnClickListener{
            val testar = Intent(this,Perguntas::class.java)
            startActivity(testar)
        }
    }
}