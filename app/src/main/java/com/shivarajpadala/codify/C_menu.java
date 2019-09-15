package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class C_menu extends AppCompatActivity {
    CardView Webcompiler,c2,c5,c4,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_menu);

        Webcompiler=(CardView)findViewById(R.id.card2);
        c2=(CardView)findViewById(R.id.card1);
        c5=(CardView)findViewById(R.id.card5);
        c3=(CardView)findViewById(R.id.card3);
        c4=(CardView)findViewById(R.id.card4);
        Webcompiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_menu.this,Compiler.class);
                startActivity(i);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_menu.this,C_programminglist.class);
                startActivity(i);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_menu.this,Online_test.class);
                startActivity(i);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_menu.this,C_questions.class);
                startActivity(i);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_menu.this,C_Definitions.class);
                startActivity(i);
            }
        });
    }
}
