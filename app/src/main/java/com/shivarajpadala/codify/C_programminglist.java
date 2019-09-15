package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class C_programminglist extends AppCompatActivity {

    TextView tx1,tx2,tx3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_programminglist);
        tx1=(TextView)findViewById(R.id.tx1);
        tx2=(TextView)findViewById(R.id.tx2);
        tx3=(TextView)findViewById(R.id.tx3);

        tx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_programminglist.this,C_hello_program.class);
                startActivity(i);

            }
        });
        tx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_programminglist.this,C_Assignment.class);
                startActivity(i);

            }
        });
        tx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_programminglist.this,C_relational.class);
                startActivity(i);

            }
        });
    }
}
