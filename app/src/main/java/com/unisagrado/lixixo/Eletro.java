package com.unisagrado.lixixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Eletro extends AppCompatActivity {

    ImageView computer, circuit_board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletro);

        computer = (ImageView) findViewById(R.id.computer);
        circuit_board = (ImageView) findViewById(R.id.circuit_board);

        circuit_board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eletro.this, Circuit_board.class);
                startActivity(intent);
            }
        });

        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Eletro.this, Computer.class);
                startActivity(intent);
            }
        });
    }
}