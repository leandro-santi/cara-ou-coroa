package com.leosanti.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public Button botaoJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.buttonJogar);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Clicado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);
                // Passar dados para a tela
                int random = new Random().nextInt(2); // 0 1
                intent.putExtra("Numero", random);
                startActivity(intent);
            }
        });

    }
}