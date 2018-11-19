package com.example.riken.efun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.riken.efun.adapter.MyAdapter;

public class pilih_kategori extends AppCompatActivity {


    RecyclerView recyclerView;
    GridLayoutManager layoutManager;


    private String nameList[] =
            {
                    "BUAH-BUAHAN",
                    "HEWAN",
                    "BENDA"
            };

    private int iconid[] =
            {
                    R.drawable.buahkategori,
                     R.drawable.hewankategori,
                    R.drawable.bendakategori
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_kategori);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        layoutManager = new GridLayoutManager(pilih_kategori.this,1 );
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter myAdapter = new MyAdapter(pilih_kategori.this, iconid, nameList);

        recyclerView.setAdapter(myAdapter);
    }
}
