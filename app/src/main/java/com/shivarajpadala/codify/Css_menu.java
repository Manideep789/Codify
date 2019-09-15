package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Css_menu extends AppCompatActivity {

    CardView Webcompiler,c2,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css_menu);

        Webcompiler=(CardView)findViewById(R.id.card2);
        c5=(CardView)findViewById(R.id.card5);
        c2=(CardView)findViewById(R.id.card1);
        Webcompiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_menu.this,HtmlCompiler.class);
                startActivity(i);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_menu.this,Css_list.class);
                startActivity(i);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_menu.this,Online_test.class);
                startActivity(i);
            }
        });
    }
}
