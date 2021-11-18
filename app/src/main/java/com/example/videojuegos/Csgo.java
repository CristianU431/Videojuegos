package com.example.videojuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Csgo extends AppCompatActivity {

    private TextView tv1,tv2;
    private Button descarga;
    String url = "https://store.steampowered.com/app/730/CounterStrike_Global_Offensive/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csgo);

        tv1 = (TextView) findViewById(R.id.tvTitulo2);
        tv2 = (TextView) findViewById(R.id.tvTexto2);

        tv1.setText("Global Offensive");
        tv2.setText("Counter-Strike: Global Offensive (CS:GO) amplía el juego de acción por equipos del que fue pionero cuando salió hace más de 20 años. CS:GO incluye nuevos mapas, personajes, armas y modos de juego, y ofrece versiones actualizadas del contenido clásico de Counter-Strike (de_dust2, etc.). ");

        descarga = findViewById(R.id.btnDescarga2);

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