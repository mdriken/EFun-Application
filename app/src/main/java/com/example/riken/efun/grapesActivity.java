package com.example.riken.efun;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class grapesActivity extends AppCompatActivity {

    ImageView suaraAnggur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grapes);

        suaraAnggur = (ImageView) findViewById(R.id.suaraAnggur1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.grapes);
        suaraAnggur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
    }
}