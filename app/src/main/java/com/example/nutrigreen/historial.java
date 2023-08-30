package com.example.nutrigreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class historial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
    }
    public void volverM (View view){
        Intent sig = new Intent(this, MainActivity.class);
        startActivity(sig);
    }
}