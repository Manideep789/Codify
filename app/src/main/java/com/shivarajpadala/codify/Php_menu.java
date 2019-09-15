package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Php_menu extends AppCompatActivity {

    CardView Webcompiler,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_menu);

        Webcompiler=(CardView)findViewById(R.id.card2);
        c5=(CardView)findViewById(R.id.card5);
        Webcompiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Php_menu.this,Compiler.class);
                startActivity(i);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Php_menu.this,Online_test.class);
                startActivity(i);
            }
        });
    }
}
