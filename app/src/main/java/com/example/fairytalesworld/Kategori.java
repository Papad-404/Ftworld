package com.example.fairytalesworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Kategori extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        mediaPlayer = MediaPlayer.create(this, R.raw.isabella);
        mediaPlayer.start();
        mediaPlayer.setVolume(100, 100);
        mediaPlayer.setLooping(true);

        ImageButton indo = findViewById(R.id.Indo);
        indo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kategori.this, Pilihanindo.class);
                startActivity(intent);
            }
        });

        ImageButton eng = findViewById(R.id.english);
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kategori.this, PilihanInggris.class);
                startActivity(intent);
            }
        });

        ImageButton is = findViewById(R.id.islamic);
        is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kategori.this, PilihanIslami.class);
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
