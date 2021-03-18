package com.agriguia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //findview
        var nomeCompleto = "nome"
        var emailcadastro = findViewById<EditText>(R.id.edtEmail_cadastro)
        var emailEntrar = findViewById<EditText>(R.id.edtEmail_entrar)
        var nomeDoLogin = findViewById<TextView>(R.id.tvNome_menu)

        //findView produtores
        var nomeProdutor = findViewById<TextView>(R.id.textView5)
        var botaoProdutor = findViewById<ImageButton>(R.id.btnProdutores)
        var imageProdutor = findViewById<ImageButton>(R.id.imageButton2)

        //findView Chat
        var button = findViewById<ImageButton>(R.id.btnChat)
        var img = findViewById<ImageButton>(R.id.imageButton3)
        var chat = findViewById<TextView>(R.id.textView6)

        //findview Mapa
        var buttonMapa = findViewById<ImageButton>(R.id.btnMapa)
        var imgMapa = findViewById<ImageButton>(R.id.imageButton4)
        var mapa = findViewById<TextView>(R.id.textView7)

        //findview Info
        var buttonInfo = findViewById<ImageButton>(R.id.btnInfo)
        var imgInfo = findViewById<ImageButton>(R.id.imageButton5)
        var info = findViewById<TextView>(R.id.textView8)




        var nome = nomeCompleto
        var sobrenomes = nomeCompleto

        var dados = intent.extras
        var nomeEmail = dados?.getString("nome")
        var nomeCadastro = dados?.getString("nomes").toString().split(" ").toTypedArray()


        if (dados?.getString("k") == "k"){



            if (nomeEmail.toString() == "leticiadelissandri@hotmail.com"){
                nomeDoLogin.text = "Leticia"

            }
            if (nomeEmail.toString() == "rogeriotomeferreira@gmail.com"){
                nomeDoLogin.text = "Rogerio"

            }
            if (nomeEmail.toString() == "lilianesousabezerra@gmail.com"){
                nomeDoLogin.text = "Liliane"

            }
            if (nomeEmail.toString() == "admin"){
                nomeDoLogin.text = "Administrador"
            }

        } else {
            var nomezin = dados?.getString("nomes").toString().split(" ").toTypedArray()
            nomeDoLogin.setText(nomezin[0])

        }

        if ("null" in nomeDoLogin.text) {
            nomeDoLogin.text = "Menu"
        }





        //botoes
        //produtores
        nomeProdutor.setOnClickListener{
            startActivity(Intent(this, Produtores::class.java))
        }
        botaoProdutor.setOnClickListener {
            startActivity(Intent(this, Produtores::class.java))

        }
        imageProdutor.setOnClickListener {
            startActivity(Intent(this, Produtores::class.java))

        }



        //chat
        button.setOnClickListener {
            startActivity(Intent(this, Chat::class.java))
        }
        img.setOnClickListener {
            startActivity(Intent(this, Chat::class.java))
        }
        chat.setOnClickListener {
            startActivity(Intent(this, Chat::class.java))
        }


        //mapa
        buttonMapa.setOnClickListener {
            startActivity(Intent(this, Mapas::class.java))
        }
        imgMapa.setOnClickListener {
            startActivity(Intent(this, Mapas::class.java))
        }
        mapa.setOnClickListener {
            startActivity(Intent(this, Mapas::class.java))
        }


        //info
        buttonInfo.setOnClickListener {
            startActivity(Intent(this, Info::class.java))
        }
        imgInfo.setOnClickListener {
            startActivity(Intent(this, Info::class.java))
        }
        info.setOnClickListener {
            startActivity(Intent(this, Info::class.java))
        }







    }
}