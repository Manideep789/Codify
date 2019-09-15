package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class C_Definitions extends AppCompatActivity {

    TextView tx1,tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__definitions);
        tx1=(TextView)findViewById(R.id.tx1);
        tx2=(TextView)findViewById(R.id.tx2);
        tx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(C_Definitions.this,C_Deflist.class);
                startActivity(i);

            }
        });

        tx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_Definitions.this,C_Dlist2.class);
                startActivity(i);

            }
        });

    }
}
