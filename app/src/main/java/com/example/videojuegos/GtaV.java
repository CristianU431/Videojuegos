package com.example.videojuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GtaV extends AppCompatActivity {

    private TextView tv1,tv2;
    private Button descarga;
    String url = "https://www.rockstargames.com/V/restricted-content/agegate/form?redirect=https%3A%2F%2Fwww.rockstargames.com%2FV%2Fes&options=&locale=es_es";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gta_v);

        tv1 = (TextView) findViewById(R.id.tvTitulo3);
        tv2 = (TextView) findViewById(R.id.tvTexto3);

        tv1.setText("Rockstar Games");
        tv2.setText("Grand Theft Auto V para PC ofrece a los jugadores la opción de explorar el galardonado mundo de Los Santos y el condado de Blaine con una resolución de 4K y disfrutar del juego a 60 fotogramas por segundo.");

        descarga = findViewById(R.id.btnDescargaGta);

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