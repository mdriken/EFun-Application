package com.example.riken.efun;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class apelActivity extends AppCompatActivity {

    ImageView suaraApel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apel);

        suaraApel = (ImageView) findViewById(R.id.suaraApel1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.apple);
        suaraApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
    }
}