package com.projetopessoal.dogage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

abstract class MainActivity : AppCompatActivity() {

    lateinit var caixaTexto : EditText
    lateinit var botaoAperte : Button
    lateinit var textoIdadeDog : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        caixaTexto = findViewById(R.id.editIdadeId)
        botaoAperte = findViewById(R.id.btnApertarId)
        textoIdadeDog = findViewById(R.id.textResultadoId)

        botaoAperte.setOnClickListener{
            val textoDigitado = caixaTexto.text.toString()

            if (textoDigitado.isEmpty()){
                textoIdadeDog.text = "Nenhum texto digitado"
            }else{
                val valorDigitado = Integer.parseInt(textoDigitado)
                val resultadoFinal = valorDigitado * 7

                textoIdadeDog.text= "idade do cachorro é :" + resultadoFinal + "anos"
            }
        }
    }
}
