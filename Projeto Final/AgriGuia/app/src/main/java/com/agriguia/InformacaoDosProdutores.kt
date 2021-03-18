package com.agriguia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class InformacaoDosProdutores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacao_dos_produtores)
        //findViews
        var voltar = findViewById<ImageButton>(R.id.btnVoltar_informaçõesDoProdutor)
        var endereco = findViewById<TextView>(R.id.tvEnderecoDoProdutor)
        var produtor = findViewById<TextView>(R.id.tvProdutor)
        var telefone = findViewById<TextView>(R.id.tvTelefoneDoProdutor)
        var produto = findViewById<TextView>(R.id.tvProdutosDoProdutor)

        var dados = intent.extras


        //dados
        produtor.setText(dados?.getString("produtor"))
        endereco.setText(dados?.getString("endereco"))
        telefone.setText(dados?.getString("telefone"))
        produto.setText(dados?.getString("produto"))

        //botoes
        voltar.setOnClickListener{
            startActivity(Intent(this, Produtores::class.java))
        }




    }
}