package com.unisagrado.lixixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;



public class MainActivity extends AppCompatActivity {

     ImageView bgapp,cloverimg,map,trash,credits,about;
     Animation botop;
     LinearLayout firstpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgapp = (ImageView) findViewById(R.id.bgapp);
        cloverimg = (ImageView) findViewById(R.id.cloverimg);
        firstpage = (LinearLayout) findViewById(R.id.firstpage);
        map = (ImageView) findViewById(R.id.map);
        about = (ImageView) findViewById(R.id.about);
        trash = (ImageView) findViewById(R.id.trash);
        credits = (ImageView) findViewById(R.id.credits);


        botop = AnimationUtils.loadAnimation(this,R.anim.botop);


        bgapp.animate().translationY(-5000).setDuration(800).setStartDelay(300);
        cloverimg.startAnimation(botop);
        firstpage.startAnimation(botop);



        trash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,trashcans.class);
                startActivity(intent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Map.class);
                startActivity(intent);
            }
        });
        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Credits.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Info.class);
                startActivity(intent);
            }
        });
    }
}