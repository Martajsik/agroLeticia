package com.agriguia

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Mapas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapas)

        var botao = findViewById<Button>(R.id.btnGoogle)
        var voltar = findViewById<ImageButton>(R.id.btnVoltar_mapas)



        botao.setOnClickListener{


            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/maps")))
        }



        voltar.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }
    }
}