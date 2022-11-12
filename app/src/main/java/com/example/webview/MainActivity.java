package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView web;
    EditText name;
    Button search;
    String touch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextTextPersonName);
        search=findViewById(R.id.button);
        web=findViewById(R.id.web);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                touch=name.getText().toString();

                web.loadUrl("https://www."+touch+".com");


            }
        });


    }
}