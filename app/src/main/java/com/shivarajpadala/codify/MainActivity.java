package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Splash s = new Splash();
        s.start();
    }

    class Splash extends Thread{
        @Override
        public void run() {
            try {
                sleep(1000);

            }
            catch (InterruptedException e){
                e.printStackTrace();

            }
            Intent i = new Intent(MainActivity.this,Home.class);
            startActivity(i);
            MainActivity.this.finish();
        }
    }
}
