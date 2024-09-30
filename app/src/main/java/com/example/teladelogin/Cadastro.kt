package com.example.teladelogin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro)


        val login = findViewById<Button>(R.id.paralogin)
        login.setOnClickListener { v: View? ->
            val intent = Intent(this, Tela_Login::class.java)
            startActivity(intent)
        }

    }


}