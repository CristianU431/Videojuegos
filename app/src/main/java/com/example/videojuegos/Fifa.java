package com.example.videojuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fifa extends AppCompatActivity {

    private TextView tv1,tv2;
    private Button descarga;
    String url = "https://www.ea.com/es-es/games/fifa/fifa-22";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifa);

        tv1 = (TextView) findViewById(R.id.tvTitulo4);
        tv2 = (TextView) findViewById(R.id.tvTexto4);

        tv1.setText("EA SPORT");
        tv2.setText("FIFA 22 es un videojuego de fútbol desarrollado por EA Romania y EA Vancouver, y publicado por EA Sports. Está disponible para PlayStation 5, PlayStation 4, Xbox Series X/S, Xbox One, Microsoft Windows, Google Stadia y Nintendo Switch.");

        descarga = findViewById(R.id.btnDescargaFifa);

        descarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW,link);
                startActivity(i);
            }
        });

    }
}