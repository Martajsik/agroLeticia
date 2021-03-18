package com.agriguia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.HashMap

class Entrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrar)

        //findviews
        var recuperar = findViewById<TextView>(R.id.tvTermosDeUso)
        var email = findViewById<EditText>(R.id.edtEmail_entrar)
        var senha = findViewById<EditText>(R.id.edtSenha_entrar)
        var entrar = findViewById<Button>(R.id.btnEntrar_entrar)
        var voltar = findViewById<ImageButton>(R.id.btnVoltar_entrar)






        //botoes

        entrar.setOnClickListener {



        if(email.text.isEmpty() || senha.text.isEmpty() ){
            Toast.makeText(this, "Preencha todos os campos.", Toast.LENGTH_LONG).show()
        }else if (Logar.login(email.text.toString(), senha.text.toString())){


            var intent = Intent(this, Menu::class.java)
            intent.putExtra("k", "k")
            intent.putExtra("nome", email.text.toString())
            startActivity(intent)

        }else{
            Toast.makeText(this, "Login ou senha incorretos.", Toast.LENGTH_SHORT).show()
        }
    }

        recuperar.setOnClickListener{
            Toast.makeText(this, "Função em protótipo", Toast.LENGTH_LONG).show()
        }

        voltar.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}
object Logar {
    private val credenciais: MutableMap<String, String?> =
            HashMap()

    fun login(usuario: String, senha: String): Boolean {
        credenciais["leticiadelissandri@hotmail.com"] = "123456"
        credenciais["rogeriotomeferreira@gmail.com"] = "234567"
        credenciais["lilianesousabezerra@gmail.com"] = "245678"
        credenciais["admin"] = "15975392430"

        return if (credenciais[usuario] != null) {
            if (credenciais[usuario] == senha) {
                true
            } else false
        } else false
    }
}