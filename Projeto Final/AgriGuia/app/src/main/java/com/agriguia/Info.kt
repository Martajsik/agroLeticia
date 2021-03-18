package com.agriguia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        var voltar = findViewById<ImageButton>(R.id.btnVoltar_info)



        voltar.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }
    }

}