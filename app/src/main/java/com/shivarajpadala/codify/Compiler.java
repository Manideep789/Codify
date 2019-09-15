package com.shivarajpadala.codify;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Compiler extends AppCompatActivity {

    WebView webcompiler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compiler);

        webcompiler=(WebView)findViewById(R.id.compiler);
        WebSettings webSettings = webcompiler.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webcompiler.setWebViewClient(new WebViewClient()
        {
            ProgressDialog pg = null;

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                pg = new ProgressDialog(Compiler.this);
                pg.setTitle("Loading");
                pg.setMessage("Connecting to Compiler...");
                pg.show();
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                pg.dismiss();
                super.onPageFinished(view, url);
            }
        });
        webcompiler.loadUrl("https://rextester.com/l/java_online_compiler");
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

