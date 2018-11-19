package com.example.riken.efun;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HewanActivity2 extends AppCompatActivity {

    ImageView suaraKucing;
    ImageView suaraOwl;
    ImageView suaraPenyu;

    public ImageView btn_hewanx;
    public ImageView back_hewan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan2);


        suaraKucing = (ImageView) findViewById(R.id.suaraKucing1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.cat);
        suaraKucing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        suaraOwl = (ImageView) findViewById(R.id.suaraowl1);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.owl);
        suaraOwl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });

        suaraPenyu = (ImageView) findViewById(R.id.suaraPenyu1);
        final MediaPlayer mp3 = MediaPlayer.create(this,R.raw.turtle);
        suaraPenyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        next_hewan1();
        back_hewan1();

    }


    public void next_hewan1() {
        btn_hewanx = (ImageView) findViewById(R.id.next_hewan3);
        btn_hewanx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_animal_page = new Intent(HewanActivity2.this, HewanActivity.class);
                startActivity(next_animal_page);
            }
        });
    }
    public void back_hewan1() {
        back_hewan = (ImageView) findViewById(R.id.back_hewan1);
        back_hewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_animal_page= new Intent(HewanActivity2.this, HewanActivity.class);
                startActivity(back_animal_page);
            }
        });

    }
}


