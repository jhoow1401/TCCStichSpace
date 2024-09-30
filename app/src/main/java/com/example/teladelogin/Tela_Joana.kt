package com.example.teladelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView

class Tela_Joana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_joana)

        var homejna: ImageView = findViewById(R.id.homejoana)
        homejna.setOnClickListener {
            var intent = Intent(this, comoFuncionamos::class.java)
            startActivity(intent)
        }
    }
}
