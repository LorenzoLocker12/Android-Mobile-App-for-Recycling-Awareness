package com.unisagrado.lixixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Hosp extends AppCompatActivity {

    ImageView hosp_equip_1, hosp_equip_2, hosp_equip_3, hosp_equip_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosp);

        hosp_equip_1 = (ImageView) findViewById(R.id.hosp_equip_1);
        hosp_equip_2 = (ImageView) findViewById(R.id.hosp_equip_2);
        hosp_equip_3 = (ImageView) findViewById(R.id.hosp_equip_3);
        hosp_equip_4 = (ImageView) findViewById(R.id.hosp_equip_4);

        hosp_equip_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hosp.this, Hosp_equip.class);
                startActivity(intent);
            }
        });
        hosp_equip_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hosp.this, Hosp_equip.class);
                startActivity(intent);
            }
        });
        hosp_equip_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hosp.this, Hosp_equip.class);
                startActivity(intent);
            }
        });
        hosp_equip_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hosp.this, Hosp_equip.class);
                startActivity(intent);
            }
        });
    }
}