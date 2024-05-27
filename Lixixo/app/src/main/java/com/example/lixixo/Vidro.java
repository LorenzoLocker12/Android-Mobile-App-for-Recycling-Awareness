package com.unisagrado.lixixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Vidro extends AppCompatActivity {

    ImageView glass, broken_glass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidro);

        glass = (ImageView) findViewById(R.id.glass_recipient);
        broken_glass = (ImageView) findViewById(R.id.glass_broken);

        glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vidro.this,Glass.class);
                startActivity(intent);
            }
        });

        broken_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vidro.this,Broken_glass.class);
                startActivity(intent);
            }
        });
    }
}