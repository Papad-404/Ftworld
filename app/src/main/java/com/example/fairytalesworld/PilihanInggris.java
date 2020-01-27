package com.example.fairytalesworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PilihanInggris extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihan_inggris);
        mediaPlayer = MediaPlayer.create(this, R.raw.lagu_ya);
        mediaPlayer.start();
        mediaPlayer.setVolume(100, 100);
        mediaPlayer.setLooping(true);

        Button fairytale1 = findViewById(R.id.match);
        fairytale1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanInggris.this, Fairytale1.class);
                startActivity(intent);
            }
        });

        Button fairytale2 = findViewById(R.id.rumplestiltskin);
        fairytale2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanInggris.this, Fairytale2.class);
                startActivity(intent);
            }
        });

        Button fairytale3 = findViewById(R.id.elves);
        fairytale3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanInggris.this, Fairytale3.class);
                startActivity(intent);
            }
        });

        Button fairytale4 = findViewById(R.id.hensel);
        fairytale4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanInggris.this, Fairytale4.class);
                startActivity(intent);
            }
        });

        Button fairytale5 = findViewById(R.id.snail);
        fairytale5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanInggris.this, Fairytale5.class);
                startActivity(intent);
            }
        });

        Button fairytale6 = findViewById(R.id.duck);
        fairytale6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanInggris.this, Fairytale6.class);
                startActivity(intent);
            }
        });

        Button fairytale7 = findViewById(R.id.pigs);
        fairytale7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanInggris.this, Fairytale7.class);
                startActivity(intent);
            }
        });

        Button fairytale8 = findViewById(R.id.twelve);
        fairytale8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanInggris.this, Fairytale8.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        onStop();
    }
}
