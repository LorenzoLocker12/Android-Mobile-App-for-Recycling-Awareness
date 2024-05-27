package com.unisagrado.lixixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Papel extends AppCompatActivity {

    ImageView card_board, paper_pile, jornal, livros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papel);

        card_board = (ImageView)findViewById(R.id.card_board);
        paper_pile = (ImageView)findViewById(R.id.paper_pile);
        jornal = (ImageView)findViewById(R.id.jornal);
        livros = (ImageView)findViewById(R.id.livros);

        card_board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Papel.this,Papelao.class);
                startActivity(intent);
            }
        });
        paper_pile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Papel.this,Papel_pilha.class);
                startActivity(intent);
            }
        });
        jornal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Papel.this,Jornal.class);
                startActivity(intent);
            }
        });
        livros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Papel.this,Livro.class);
                startActivity(intent);
            }
        });
    }
}