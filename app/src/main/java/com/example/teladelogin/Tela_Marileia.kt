package com.example.teladelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Tela_Marileia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_marileia)

        var home: ImageView = findViewById(R.id.homemarileia)
        home.setOnClickListener {
            var intent = Intent(this, comoFuncionamos::class.java)
            startActivity(intent)
        }
    }
}