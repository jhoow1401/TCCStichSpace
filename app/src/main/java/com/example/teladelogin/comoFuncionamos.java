package com.example.teladelogin;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class comoFuncionamos extends  AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.como_funcionamos);
        Button maria = findViewById(R.id.verMaisMaria);
        maria.setOnClickListener((v) -> {
            Intent intent = new Intent(this, Tela_Maria.class);
            startActivity(intent);
        });

        Button luzia = findViewById(R.id.verMaisLuzia);
        luzia.setOnClickListener((v) -> {
            Intent intent = new Intent(this, Tela_Luzia.class);
            startActivity(intent);
        });

        Button marileia = findViewById(R.id.verMaismarileia);
        marileia.setOnClickListener((v) -> {
            Intent intent = new Intent(this, Tela_Marileia.class);
            startActivity(intent);
        });

        Button cicera = findViewById(R.id.verMaiscicera);
        cicera.setOnClickListener((v) -> {
            Intent intent = new Intent(this, Tela_Cicera.class);
            startActivity(intent);
        });
        Button francisco = findViewById(R.id.verMaisFrancisco);
        francisco.setOnClickListener((v) -> {
            Intent intent = new Intent(this, Tela_Francisco.class);
            startActivity(intent);
        });
        Button joana = findViewById(R.id.verMaisjoana);
        joana.setOnClickListener((v) -> {
            Intent intent = new Intent(this, Tela_Joana.class);
            startActivity(intent);
        });




    }
}