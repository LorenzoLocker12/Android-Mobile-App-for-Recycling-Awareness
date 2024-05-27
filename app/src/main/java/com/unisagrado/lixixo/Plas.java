package com.unisagrado.lixixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Plas extends AppCompatActivity {

    ImageView bottles, plastic_bag, Chips_bag, fork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plas);

        bottles = (ImageView)findViewById(R.id.water_bottle);
        plastic_bag = (ImageView)findViewById(R.id.plastic_bag);
        Chips_bag = (ImageView)findViewById(R.id.chips);
        fork = (ImageView)findViewById(R.id.fork);

        bottles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Plas.this,Bottles.class);
                startActivity(intent);
            }
        });
        plastic_bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Plas.this,Plastic_bag.class);
                startActivity(intent);
            }
        });
        Chips_bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Plas.this,Chips_bag.class);
                startActivity(intent);
            }
        });
        fork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Plas.this,Fork.class);
                startActivity(intent);
            }
        });
    }
}