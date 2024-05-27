package com.unisagrado.lixixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Met extends AppCompatActivity {

    ImageView motor,aluminium,aluminium_can,pan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_met);

        motor = (ImageView)findViewById(R.id.motor);
        aluminium = (ImageView)findViewById(R.id.aluminium);
        aluminium_can = (ImageView)findViewById(R.id.aluminium_can);
        pan = (ImageView)findViewById(R.id.pan);

        motor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Met.this,Motor.class);
                startActivity(intent);
            }
        });
        aluminium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Met.this,Aluminium.class);
                startActivity(intent);
            }
        });
        aluminium_can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Met.this,Aluminium_can.class);
                startActivity(intent);
            }
        });
        pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Met.this,Pan.class);
                startActivity(intent);
            }
        });
    }
}