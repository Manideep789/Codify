package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Java_menu extends AppCompatActivity {

    CardView Webcompiler,c1,c5,c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_menu);

        Webcompiler=(CardView)findViewById(R.id.card2);
        c5=(CardView)findViewById(R.id.card5);
        c4=(CardView)findViewById(R.id.card4);
        c1=(CardView)findViewById(R.id.card1);
        Webcompiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Java_menu.this,Compiler.class);
                startActivity(i);
            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Java_menu.this,Java_programlist.class);
                startActivity(i);

            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Java_menu.this,Online_test.class);
                startActivity(i);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Java_menu.this,Java_questions.class);
                startActivity(i);

            }
        });


    }
}
