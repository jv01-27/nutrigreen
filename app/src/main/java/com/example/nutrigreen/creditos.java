package com.example.nutrigreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class creditos  extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creditos);
        setupHyperlink();
    }
    public void volverM (View view){
        Intent sig = new Intent(this, MainActivity.class);
        startActivity(sig);
    }
    public void setupHyperlink(){
        TextView linkTextView = findViewById(R.id.legal);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView2 = findViewById(R.id.donacion);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
