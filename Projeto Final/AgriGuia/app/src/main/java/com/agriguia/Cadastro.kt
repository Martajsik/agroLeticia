package com.agriguia

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        //findView
        var voltar = findViewById<ImageButton>(R.id.btnVoltar_cadastro)
        var spn55 = findViewById<Spinner>(R.id.spn55_cadastro)
        var spnSexo = findViewById<Spinner>(R.id.spnSexo_cadastro)
        var continuar = findViewById<Button>(R.id.btnContinuar_cadastro)

        var email = findViewById<EditText>(R.id.edtEmail_cadastro)
        var senha = findViewById<EditText>(R.id.edtSenha_cadastro)
        var nomeCompleto = findViewById<EditText>(R.id.edtNome_cadastro)




        //arrays
        spn55.adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, resources.getStringArray(R.array.numeros))
        spnSexo.adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, resources.getStringArray(R.array.sexo))


        //botoes

        continuar.setOnClickListener {
            if (email.text.isEmpty()||senha.text.isEmpty()||nomeCompleto.text.isEmpty()){
                Toast.makeText(this, "Preencha todos os itens obrigatórios (*)", Toast.LENGTH_LONG).show()
            }else{

                var intentComDados = Intent(this, Menu::class.java)
                intentComDados.putExtra("nomes", nomeCompleto.text.toString())
                startActivity(intentComDados)

            }


        }

        voltar.setOnClickListener{

            startActivity(Intent(this, MainActivity::class.java))
        }




    }
}