package com.example.riken.efun;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BuahActivity1 extends AppCompatActivity {

    ImageView suaraDuren;
    ImageView suaraStroberry;
    ImageView suaraNanas;

    public ImageView btn_buah1;
    public ImageView back_buah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah1);

        suaraDuren = (ImageView) findViewById(R.id.suaraDurian1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.durian);
        suaraDuren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        suaraStroberry = (ImageView) findViewById(R.id.suaraStroberi1);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.strawberry);
        suaraStroberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });

        suaraNanas = (ImageView) findViewById(R.id.suaraNanas1);
        final MediaPlayer mp3 = MediaPlayer.create(this,R.raw.pineapple);
        suaraNanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        next_buah1();
        back_buah1();

    }


    public void next_buah1() {
        btn_buah1 = (ImageView) findViewById(R.id.next_buah1);
        btn_buah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_fruit_page = new Intent(BuahActivity1.this, BuahActivity.class);
                startActivity(next_fruit_page);
            }
        });
    }
    public void back_buah1() {
        back_buah = (ImageView) findViewById(R.id.back_buahx);
        back_buah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_animal_page= new Intent(BuahActivity1.this, BuahActivity.class);
                startActivity(back_animal_page);
            }
        });

    }
}


