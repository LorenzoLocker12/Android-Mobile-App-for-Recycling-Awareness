package com.unisagrado.lixixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class trashcans extends AppCompatActivity {

    ImageView met, vidro, plas, papel, org, eletro,hosp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trashcans);

        met = (ImageView)findViewById(R.id.met);
        vidro = (ImageView)findViewById(R.id.vidro);
        plas = (ImageView)findViewById(R.id.plas);
        papel = (ImageView)findViewById(R.id.papel);
        org = (ImageView)findViewById(R.id.org);
        eletro = (ImageView)findViewById(R.id.eletro);
        hosp = (ImageView)findViewById(R.id.hosp);



        met.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trashcans.this,Met.class);
                startActivity(intent);
            }
        });
        vidro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trashcans.this,Vidro.class);
                startActivity(intent);
            }
        });
        plas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trashcans.this,Plas.class);
                startActivity(intent);
            }
        });
        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trashcans.this,Papel.class);
                startActivity(intent);
            }
        });
        org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trashcans.this,Org.class);
                startActivity(intent);
            }
        });
        eletro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trashcans.this,Eletro.class);
                startActivity(intent);
            }
        });
        hosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trashcans.this,Hosp.class);
                startActivity(intent);
            }
        });
    }
}