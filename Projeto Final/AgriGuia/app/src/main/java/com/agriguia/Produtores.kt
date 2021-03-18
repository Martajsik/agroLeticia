package com.agriguia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class Produtores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produtores)


        //findviews
        var voltar = findViewById<ImageButton>(R.id.btnVoltar_produtores)
          //image buttons
          var button1 = findViewById<ImageButton>(R.id.btnProdutor1)
          var button2 = findViewById<ImageButton>(R.id.btnProdutor2)
          var button3 = findViewById<ImageButton>(R.id.btnProdutor3)
          var button4 = findViewById<ImageButton>(R.id.btnProdutor4)
          var button5 = findViewById<ImageButton>(R.id.btnProdutor5)
          //icones
          var icon1 = findViewById<ImageView>(R.id.imageView3)
          var icon2 = findViewById<ImageView>(R.id.imageView11)
          var icon3 = findViewById<ImageView>(R.id.imageView21)
          var icon4 = findViewById<ImageView>(R.id.imageView31)
          var icon5 = findViewById<ImageView>(R.id.imageView41)
         //nome
          var nome1 = findViewById<TextView>(R.id.textView9)
          var nome2 = findViewById<TextView>(R.id.textView12)
          var nome3 = findViewById<TextView>(R.id.textView22)
          var nome4 = findViewById<TextView>(R.id.textView32)
          var nome5 = findViewById<TextView>(R.id.textView42)







        //botoes
        //produtor 1
        button1.setOnClickListener {
            produtor1()
        }
        icon1.setOnClickListener {
            produtor1()
        }
        nome1.setOnClickListener {
            produtor1()
        }

        //produtor 2
        button2.setOnClickListener {
            produtor2()
        }
        icon2.setOnClickListener {
            produtor2()
        }
        nome2.setOnClickListener {
            produtor2()
        }

        //produtor 3
        button3.setOnClickListener {
            produtor3()
        }
        icon3.setOnClickListener {
            produtor3()
        }
        nome3.setOnClickListener {
            produtor3()
        }

        //produtor 4
        button4.setOnClickListener {
            produtor4()
        }
        icon4.setOnClickListener {
            produtor4()
        }
        nome4.setOnClickListener {
            produtor4()
        }

        //produtor 5

        button5.setOnClickListener {
            produtor5()
        }
        icon5.setOnClickListener {
            produtor5()
        }
        nome5.setOnClickListener {
            produtor5()
        }







        voltar.setOnClickListener {
            startActivity(Intent(this, Menu::class.java))
        }


    }

    private fun produtor1() {

        var intent = Intent(this, InformacaoDosProdutores::class.java)
        intent.putExtra("produtor", "Margarida da Silva,  João e Zulema")
        intent.putExtra("endereco", "R. Prof. José Décio machado Gaia, 500  \nSão matheus - São Paulo-sp")
        intent.putExtra("telefone", "11 99716-4855")
        intent.putExtra("produto", "tomate, cenoura, feijão, alface")
        intent.putExtra("perfil", "R.drawable.avatar_default_icon")
        startActivity(intent)


    }
    private fun produtor2() {

        var intent = Intent(this, InformacaoDosProdutores::class.java)

        intent.putExtra("produtor", "Josefina")
        intent.putExtra("endereco", "R. Papiro do egito,70 - São Paulo-sp  ")
        intent.putExtra("telefone", "11 95732-4850")
        intent.putExtra("produto", "milho, mandioca, repolho, arroz, berinjela")
        startActivity(intent)

    }
    private fun produtor3() {
        var intent = Intent(this, InformacaoDosProdutores::class.java)

        intent.putExtra("produtor", "Agnaldo e Helena")
        intent.putExtra("endereco", "R. Wilsom Ackel, 42-guianases")
        intent.putExtra("telefone", "11 99533-4790")
        intent.putExtra("produto", "linhaça, pimentão, beterraba, cebola.")
        startActivity(intent)


    }
    private fun produtor4() {
        var intent = Intent(this, InformacaoDosProdutores::class.java)


        intent.putExtra("produtor", "Mirian Fernandes")
        intent.putExtra("endereco", "R. Eufrazio Martins Guedes, 100- jd.palanque- São Matheus- SP")
        intent.putExtra("telefone", "11 98250-4380")
        intent.putExtra("produto", "abóbora, couve, pepino, mamão.")
        startActivity(intent)






    }
    private fun produtor5() {
        var intent = Intent(this, InformacaoDosProdutores::class.java)

        intent.putExtra("produtor", "Luisa e Paula")
        intent.putExtra("endereco", "R. Av. Sapopemba,1000- iguatemi")
        intent.putExtra("telefone", "11 99903-1507")
        intent.putExtra("produto", "Espinafre, batata, figo, salsão.")

        startActivity(intent)






    }
}