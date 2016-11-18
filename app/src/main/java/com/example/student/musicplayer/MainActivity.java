package com.example.student.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private MediaPlayer song1;

    public void onCreate(){
        song1 = MediaPlayer.create(this, R.raw.BargainsInATuxedo);
    }

    public void playSong(View view) {
        song1.start();
    }
    public void pauseSong(View view) {
        song1.pause();
    }
}
