package com.example.examen;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {
WebView vistaweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        vistaweb=(WebView)findViewById(R.id.vistaweb);

        Bundle bundle= getIntent( ).getExtras();
        String dato=bundle.getString("url");
        vistaweb.loadUrl("https://" +dato);

    }
    public void volver (View v){
        finish();
    }
}