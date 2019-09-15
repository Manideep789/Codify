package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Leefcode extends AppCompatActivity {

    WebView webcompiler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leefcode);

        webcompiler=(WebView)findViewById(R.id.web);
        WebSettings webSettings = webcompiler.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webcompiler.setWebViewClient(new WebViewClient());
        webcompiler.loadUrl("https://leetcode.com/");
    }

    @Override
    public void onBackPressed() {
        if(webcompiler.canGoBack())
        {
            webcompiler.goBack();
        }
        else{

            super.onBackPressed();

        }

    }
}
