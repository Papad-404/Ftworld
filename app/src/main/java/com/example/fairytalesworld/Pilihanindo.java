package com.example.fairytalesworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Pilihanindo extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihan_indo);
        mediaPlayer = MediaPlayer.create(this, R.raw.cof);
        mediaPlayer.start();
        mediaPlayer.setVolume(100, 100);
        mediaPlayer.setLooping(true);

        Button cerita1 = findViewById(R.id.buaya);
        cerita1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buaya = new Intent(Pilihanindo.this, Ceriita1.class);
                startActivity(buaya);
            }
        });

        Button cerita2 = findViewById(R.id.Burung_hantu);
        cerita2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bhantu = new Intent(Pilihanindo.this, Ceriita2.class);
                startActivity(bhantu);
            }
        });

        Button cerita3 = findViewById(R.id.pando);
        cerita3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pando = new Intent(Pilihanindo.this, Ceriita3.class);
                startActivity(pando);
            }
        });

        Button cerita4 = findViewById(R.id.pikolo);
        cerita4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pikolo = new Intent(Pilihanindo.this, Ceriita4.class);
                startActivity(pikolo);
            }
        });


        Button cerita5 = findViewById(R.id.nenek);
        cerita5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nenek = new Intent(Pilihanindo.this, Ceriita5.class);
                startActivity(nenek);
            }
        });


        Button cerita6 = findViewById(R.id.kunang);
        cerita6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kunang = new Intent(Pilihanindo.this, Ceriita6.class);
                startActivity(kunang);
            }
        });

        Button cerita7 = findViewById(R.id.cecil);
        cerita7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cecil = new Intent(Pilihanindo.this, Ceriita7.class);
                startActivity(cecil);
            }
        });

        Button cerita8 = findViewById(R.id.alju);
        cerita8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alju = new Intent(Pilihanindo.this, Ceriita8.class);
                startActivity(alju);
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
