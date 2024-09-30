package com.example.teladelogin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Tela_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

        var home: ImageView = findViewById(R.id.homelogin)
        home.setOnClickListener {
            var intent = Intent(this, comoFuncionamos::class.java)
            startActivity(intent)


            val paracadastro = findViewById<Button>(R.id.paracadatro)
            paracadastro.setOnClickListener { v: View? ->
                val intent = Intent(this, Cadastro::class.java)
                startActivity(intent)
            }
        }
    }
}