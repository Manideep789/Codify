package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    CardView c,java,py,php,js,cpp,html,css,sw,kot;
    TextView txabt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txabt=(TextView)findViewById(R.id.abttxt);
        c=(CardView)findViewById(R.id.cp);
        java=(CardView)findViewById(R.id.java);
        py=(CardView)findViewById(R.id.py);
        php=(CardView)findViewById(R.id.php);
        js=(CardView)findViewById(R.id.js);
        cpp=(CardView)findViewById(R.id.cpp);
        html=(CardView)findViewById(R.id.html);
        css=(CardView)findViewById(R.id.css);
        sw=(CardView)findViewById(R.id.swt);
        kot=(CardView)findViewById(R.id.kot);

        txabt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Home.this, About.class);
                startActivity(i);

            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,C_menu.class);
                startActivity(i);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Java_menu.class);
                startActivity(i);
            }
        });

        py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, Py_menu.class);
                startActivity(i);
            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Php_menu.class);
                startActivity(i);
            }
        });

        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Js_menu.class);
                startActivity(i);
            }
        });

        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Cpp_menu.class);
                startActivity(i);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, Html_menu.class);
                startActivity(i);
            }
        });

        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Css_menu.class);
                startActivity(i);
            }
        });

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Sw_menu.class);
                startActivity(i);
            }
        });

        kot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this,Kot_menu.class);
                startActivity(i);
            }
        });


    }
}
