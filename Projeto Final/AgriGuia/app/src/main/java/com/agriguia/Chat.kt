package com.agriguia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        //findViews
        var button = findViewById<ImageButton>(R.id.btnChat)
        var nome = findViewById<TextView>(R.id.textView9)
        var perfil = findViewById<ImageView>(R.id.imageView3)
        var float = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        var voltar = findViewById<ImageButton>(R.id.btnVoltar_chat)


        button.setOnClickListener {
            abrir()
        }
        nome.setOnClickListener {
            abrir()
        }
        perfil.setOnClickListener {
            abrir()
        }

        float.setOnClickListener {
            Toast.makeText(this, "Função em protótipo", Toast.LENGTH_LONG).show()
        }

        voltar.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }





    }

    private fun abrir() {
        startActivity(Intent(this, Conversa::class.java))
    }
}