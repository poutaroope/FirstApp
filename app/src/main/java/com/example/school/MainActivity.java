package com.example.school;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button button;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button = (Button)findViewById(R.id.btn1);
        //button.setOnClickListener(this);
        webView = (WebView)findViewById(R.id.web);
        webView.loadUrl("www.youtube.com");

    }


   // public void onClick(View view){
       // if(view.getId() == R.id.btn1){
           // webView.loadUrl("www.youtube.com");
        }


