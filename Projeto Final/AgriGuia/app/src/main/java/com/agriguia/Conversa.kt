package com.agriguia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Conversa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversa)

        var voltar = findViewById<ImageButton>(R.id.btnVoltar_conversa)
        var campoDeTexto = findViewById<EditText>(R.id.edtMsg)
        var msg1 = findViewById<TextView>(R.id.msg1)
        var msg2 = findViewById<TextView>(R.id.msg2)
        var msg3 = findViewById<TextView>(R.id.msg3)
        var msg4 = findViewById<TextView>(R.id.msg4)
        var msg5 = findViewById<TextView>(R.id.msg5)
        var msg6 = findViewById<TextView>(R.id.msg6)
        var enviar = findViewById<FloatingActionButton>(R.id.btnEnviar)








        enviar.setOnClickListener{
            Handler().postDelayed(

                {




            if ("dia" in campoDeTexto.text.toString()){
               msg1.setText(campoDeTexto.text)
               Handler().postDelayed(

                   {
                       msg2.text = "Em que posso ajudar?"
                   }, 4500

               )


           } else if ("comprar" in campoDeTexto.text.toString()){

               msg3.setText(campoDeTexto.text)
               Handler().postDelayed(

                   {
                       msg4.text = "Sim, qual quantidade e endereço?"
                   }, 4500

               )

           } else if ("20" in campoDeTexto.text.toString()){

               msg5.setText(campoDeTexto.text)
               Handler().postDelayed(

                   {
                       msg6.text = "Obrigado entregamos em 20 min"
                   }, 4500

               )




           }

                }, 200

            )

        }



        voltar.setOnClickListener{
            startActivity(Intent(this, Chat::class.java))
        }
    }
}