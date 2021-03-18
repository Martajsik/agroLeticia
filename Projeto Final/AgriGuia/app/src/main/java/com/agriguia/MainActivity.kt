package com.agriguia

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var entrar = findViewById<Button>(R.id.btnEntrar_main)
        var criar = findViewById<Button>(R.id.btnCriarConta)




        entrar.setOnClickListener {
            var intentzinha = Intent(this, Entrar::class.java)
            startActivity(intentzinha)
        }
        criar.setOnClickListener {
            startActivity(Intent(this, Cadastro::class.java))
        }




    }
}