package com.example.riken.efun;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BuahActivity extends AppCompatActivity {

    ImageView suaraApel;
    ImageView suaraAnggur;
    ImageView suaraPisang;

    public ImageView btn_buah;
    public ImageView btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

        suaraApel = (ImageView) findViewById(R.id.suaraApel1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.apple);
        suaraApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        suaraAnggur = (ImageView) findViewById(R.id.suaraAnggur1);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.grapes);
        suaraAnggur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });

        suaraPisang = (ImageView) findViewById(R.id.suaraPisang1);
        final MediaPlayer mp3 = MediaPlayer.create(this,R.raw.banana);
        suaraPisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        next_buah();
        home_ktgri();

    }

    public void next_buah() {
        btn_buah = (ImageView) findViewById(R.id.next_buah);
        btn_buah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_fruit_page= new Intent(BuahActivity.this, BuahActivity1.class);
                startActivity(next_fruit_page);
            }
        });

    }

    public void home_ktgri() {
        btn_home = (ImageView) findViewById(R.id.home1);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali_home=new Intent(BuahActivity.this, pilih_kategori.class);
                startActivity(kembali_home);
            }
        });
    }
}


