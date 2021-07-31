package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular: Button = processar
        val resposta: TextView = resposta

        btCalcular.setOnClickListener {
            val nota1: Int = Integer.parseInt(nota1.text.toString())
            val nota2: Int = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val falta: Int = Integer.parseInt(faltas.text.toString())

            if(media >= 6 && falta <= 10) {
                resposta.setText("Situação final: APROVADO" + "\n" + "Valor da média:" + media + "\n" + "Total de faltas:" + faltas)
            }else{
                resposta.setText("Situação final: REPROVADO" + "\n" + "Valor da média:" + media + "\n" + "Total de faltas:" + faltas)
            }
        }
    }
}