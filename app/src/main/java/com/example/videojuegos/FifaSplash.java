package com.example.videojuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class FifaSplash extends AppCompatActivity {

    public static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifa_splash);

        //implementar tiempo
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(FifaSplash.this, Fifa.class);
                startActivity(intent);
                finish();
            }
        };

        // se ejecuta una vez cerrado
        Timer timer = new Timer();
        timer.schedule(time, SPLASH_SCREEN_DELAY);

    }
}