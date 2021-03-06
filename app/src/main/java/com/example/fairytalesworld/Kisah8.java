package com.example.fairytalesworld;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Kisah8 extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);
        setContentView (R.layout.kisah8);
        mediaPlayer = MediaPlayer.create(this, R.raw.islami4);
        mediaPlayer.start();
        mediaPlayer.setVolume(100, 100);
        mediaPlayer.setLooping(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);

    }

    public void OffM(MenuItem item) {
        mediaPlayer.pause();
        mediaPlayer.setVolume(0,0);

    }

    public void OnM(MenuItem item) {
        mediaPlayer = MediaPlayer.create(this, R.raw.islami4);
        mediaPlayer.start();
        mediaPlayer.setVolume(100, 100);
        mediaPlayer.setLooping(true);
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
