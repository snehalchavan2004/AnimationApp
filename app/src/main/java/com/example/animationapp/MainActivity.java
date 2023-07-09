package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    MediaPlayer soundplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer musicanimation = MediaPlayer.create(MainActivity.this, R.raw.musicanimation);
        musicanimation.start();
        img = findViewById(R.id.kidimg);
        img.animate().translationXBy(300).setDuration(18000);

    }

    public void onstop() {
        super.onStop();
        if (soundplay != null) {
            soundplay.stop();
        }
    }
}