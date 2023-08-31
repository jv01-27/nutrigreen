package com.example.nutrigreen;

import android.content.Intent;
import android.net.Uri;
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
        //setupHyperlink();
    }
    public void volverC (View view){
        Intent sig = new Intent(this, MainActivity.class);
        startActivity(sig);
    }
    public void legal (View view){
        Intent sig = new Intent(this, legal.class);
        startActivity(sig);
    }
    public void abrirLibro1 (View view) {
        Uri parsedUrl = null;
        parsedUrl = Uri.parse("https://imss.gob.mx/sites/all/statics/salud/guia-alimentos.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(parsedUrl);
        startActivity(intent);
    }
    public void abrirLibro2 (View view) {
        Uri parsedUrl2 = null;
        parsedUrl2 = Uri.parse("https://alimentacionysalud.unam.mx/wp-content/uploads/2021/05/Menus-para-pacientes-con-diabetes.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(parsedUrl2);
        startActivity(intent);
    }

    /*
    public void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.legal_hyperlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView2 = findViewById(R.id.donacion);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
    */
}
