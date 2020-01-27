package com.example.fairytalesworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PilihanIslami extends AppCompatActivity {
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihan_islami);
        mediaPlayer = MediaPlayer.create(this, R.raw.islami);
        mediaPlayer.start();
        mediaPlayer.setVolume(100, 100);
        mediaPlayer.setLooping(true);

        Button islami = findViewById(R.id.kisah);
        islami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(PilihanIslami.this, Kisah.class);
                startActivity(intent);
            }
        });

        Button islami2 = findViewById(R.id.kisah2);
        islami2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanIslami.this, Kisah2.class);
                startActivity(intent);
            }
        });

        Button islami3 = findViewById(R.id.kisah3);
        islami3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanIslami. this, Kisah3.class);
                startActivity(intent);
            }
        });

        Button islami4 = findViewById(R.id.kisah4);
        islami4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanIslami. this, Kisah4.class);
                startActivity(intent);
            }
        });

        Button islami5 = findViewById(R.id.kisah5);
        islami5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanIslami.this, Kisah5.class);
                startActivity(intent);
            }
        });

        Button islami6 = findViewById(R.id.kisah6);
        islami6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanIslami.this, Kisah6.class);
                startActivity(intent);
            }
        });

        Button islami7 = findViewById(R.id.kisah7);
        islami7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanIslami.this, Kisah7.class);
                startActivity(intent);
            }
        });

        Button islami8 = findViewById(R.id.kisah8);
        islami8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanIslami.this, Kisah8.class);
                startActivity(intent);
            }
        });

        Button islami9 = findViewById(R.id.kisah9);
        islami9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanIslami.this,Kisah9.class);
                startActivity(intent);
            }
        });

        Button islami10 = findViewById(R.id.kisah10);
        islami10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihanIslami.this, Kisah10.class);
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
