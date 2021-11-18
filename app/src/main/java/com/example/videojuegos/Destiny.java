package com.example.videojuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;

public class Destiny extends AppCompatActivity {

    private TextView tv1,tv2;
    private Button descarga;
    String url = "https://www.bungie.net/7/es/Destiny/NewLight";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destiny);

        tv1 = (TextView) findViewById(R.id.tvTitulo);
        tv2 = (TextView) findViewById(R.id.tvTexto);

        tv1.setText("MMO DE ACCIÓN DEFINITIVO");
        tv2.setText("Únete a millones de jugadores, crea tu guardián y empieza a coleccionar armas y armaduras únicas para personalizar tu aspecto y tu estilo de juego. Aventúrate en misiones cooperativas de gran dificultad y en toda una variedad de modos PvP competitivos. Vive en primera persona la historia dinámica de Destiny 2 con tus amigos o explora las estrellas en solitario.");

        descarga = findViewById(R.id.btnDescarga);

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