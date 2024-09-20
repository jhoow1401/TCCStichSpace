package com.example.teladelogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class TelaInicial extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);
        Button botao = findViewById(R.id.telaInicialComoFunc);
        botao.setOnClickListener((v) -> {
            Intent intent = new Intent(this, comoFuncionamos.class);
            startActivity(intent);
        });



    }
}
