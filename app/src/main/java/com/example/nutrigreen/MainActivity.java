package com.example.nutrigreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Toast.makeText(this, "¡Bienvenido(a)!", Toast.LENGTH_SHORT).show();
        // La actividad está creada.

    }
    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "¡Vuelva Pronto!", Toast.LENGTH_LONG).show();
        // La actividad est� a punto de ser destruida.
    }

    public void inicio (View view) {
        Intent init = new Intent(this, entrada_datos.class);
        startActivity(init);
    }
    public void credits (View view) {
        Intent init2 = new Intent(this, creditos.class);
        startActivity(init2);
    }
}