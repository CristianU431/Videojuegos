package com.example.videojuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    //Funcion para el boton Destiny
    public void Destiny(View view) { startActivity(new Intent(this, DestinySplash.class)); }
    //Funcion para el boton Cs Go
    public void Csgo(View view) { startActivity(new Intent(this, CsgoSplash.class)); }
    //Funcion para el boton Gta V
    public void Gta(View view) { startActivity(new Intent(this, GtaSplash.class)); }
    //Funcion para el boton Fifa
    public void Fifa(View view) { startActivity(new Intent(this, FifaSplash.class)); }

}