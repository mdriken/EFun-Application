package com.example.riken.efun;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class HewanActivity extends AppCompatActivity {

    ImageView suaraAnjing;
    ImageView suaraLebah;
    ImageView suaraBurung;

    public ImageView btn_hewan;
    public ImageView btn_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        suaraAnjing = (ImageView) findViewById(R.id.suaraAning1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.dog);
        suaraAnjing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        suaraLebah = (ImageView) findViewById(R.id.suaralebah1);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.bee);
        suaraLebah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });

        suaraBurung = (ImageView) findViewById(R.id.suaraBurung1);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.bird);
        suaraBurung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        next_hewanx();
        home_ktgri();

    }

    public void next_hewanx() {
        btn_hewan = (ImageView) findViewById(R.id.next_hewanx);
        btn_hewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_animal_page= new Intent(getApplicationContext() ,HewanActivity2.class);
                startActivity(next_animal_page);
            }
        });

    }

    public void home_ktgri() {
        btn_home = (ImageView) findViewById(R.id.home2);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali_home=new Intent(HewanActivity.this, pilih_kategori.class);
                startActivity(kembali_home);
            }
        });
    }
}


