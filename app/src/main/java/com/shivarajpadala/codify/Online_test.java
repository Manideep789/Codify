package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Online_test extends AppCompatActivity {

    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_test);

        tx1=(TextView)findViewById(R.id.tx1);
        tx2=(TextView)findViewById(R.id.tx2);
        tx3=(TextView)findViewById(R.id.tx3);
        tx4=(TextView)findViewById(R.id.tx4);
        tx5=(TextView)findViewById(R.id.tx5);
        tx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Online_test.this,Hacker_earth.class);
                startActivity(i);
            }
        });

        tx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Online_test.this,Codechef.class);
                startActivity(i);
            }
        });

        tx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Online_test.this,Topcoder.class);
                startActivity(i);
            }
        });

        tx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Online_test.this,Hacker_earth.class);
                startActivity(i);
            }
        });

        tx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Online_test.this,Leefcode.class);
                startActivity(i);
            }
        });

    }
}
