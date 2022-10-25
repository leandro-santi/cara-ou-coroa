package com.leosanti.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {
    private ImageView imagem;
    private Button botaoVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagem = findViewById(R.id.imageMoeda);
        botaoVoltar = findViewById(R.id.buttonVoltar);

        // Recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("Numero");

        if(numero == 0) { // Cara
            imagem.setImageResource(R.drawable.moeda_cara);
        }
        else if(numero == 1) { // Coroa
            imagem.setImageResource(R.drawable.moeda_coroa);
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Finaliza a Activity
            }
        });

    }
}