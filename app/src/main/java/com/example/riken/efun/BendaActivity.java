package com.example.riken.efun;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BendaActivity extends AppCompatActivity {

    ImageView suaraBoneka;
    ImageView suaraRobot;
    ImageView suaraHape;

    public ImageView btn_benda;
    public ImageView btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benda);

        suaraBoneka = (ImageView) findViewById(R.id.suaraBoneka1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.doll);
        suaraBoneka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        suaraRobot = (ImageView) findViewById(R.id.suaraRobot1);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.robot);
        suaraRobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });

        suaraHape = (ImageView) findViewById(R.id.suarahape1);
        final MediaPlayer mp3 = MediaPlayer.create(this,R.raw.handphone);
        suaraHape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        next_benda();
        home_ktgri();

    }

    public void next_benda() {
        btn_benda = (ImageView) findViewById(R.id.next_benda);
        btn_benda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_benda_page= new Intent(BendaActivity.this, BendaActivity1.class);
                startActivity(next_benda_page);
            }
        });

    }

    public void home_ktgri() {
        btn_home = (ImageView) findViewById(R.id.homex);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali_home=new Intent(BendaActivity.this, pilih_kategori.class);
                startActivity(kembali_home);
            }
        });
    }
}


