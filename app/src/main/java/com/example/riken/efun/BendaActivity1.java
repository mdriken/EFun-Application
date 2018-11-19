package com.example.riken.efun;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BendaActivity1 extends AppCompatActivity {

    ImageView suaraBola;
    ImageView suaraTas;
    ImageView suaraBaju;

    public ImageView btn_benda1;
    public ImageView back_benda1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benda1);


        suaraBola = (ImageView) findViewById(R.id.suaraBall1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.ball);
        suaraBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        suaraTas = (ImageView) findViewById(R.id.suaraBag1);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.bag);
        suaraTas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });

        suaraBaju = (ImageView) findViewById(R.id.suarabaju1);
        final MediaPlayer mp3 = MediaPlayer.create(this,R.raw.shirt);
        suaraBaju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        next_bendax();
        back_bendax();

    }


    public void next_bendax() {
        btn_benda1 = (ImageView) findViewById(R.id.next_benda1);
        btn_benda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_animal_page = new Intent(BendaActivity1.this, BendaActivity.class);
                startActivity(next_animal_page);
            }
        });
    }
    public void back_bendax() {
        back_benda1 = (ImageView) findViewById(R.id.back_benda);
        back_benda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_animal_page= new Intent(BendaActivity1.this, BendaActivity.class);
                startActivity(back_animal_page);
            }
        });

    }
}


