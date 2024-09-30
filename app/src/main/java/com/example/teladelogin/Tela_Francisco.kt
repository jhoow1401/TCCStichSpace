package com.example.teladelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Tela_Francisco : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_francisco)

        var home: ImageView = findViewById(R.id.homefrancisco)
        home.setOnClickListener {
            var intent = Intent(this, comoFuncionamos::class.java)
            startActivity(intent)
        }

    }
}