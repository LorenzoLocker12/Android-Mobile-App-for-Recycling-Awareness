package com.unisagrado.lixixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Org extends AppCompatActivity {

    ImageView leaf, banana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org);

        leaf = (ImageView)findViewById(R.id.leaf);
        banana = (ImageView)findViewById(R.id.banana);

        leaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Org.this,Restos_vegetais.class);
                startActivity(intent);

            }
        });

        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Org.this, Restos_de_alimentos.class);
                startActivity(intent);
            }
        });

    }
}