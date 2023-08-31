package com.example.nutrigreen;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class choice extends AppCompatActivity {
    TextView kcal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

    kcal = (TextView) findViewById(R.id.txt_test);

    kcal.setText(getIntent().getStringExtra("g_e_t"));
    }

    public void modo1 (View view) {
        Intent init = new Intent(this, alimento.class);
        startActivity(init);
    }

    public void modo2 (View view) {
        Intent init = new Intent(this, menu_selection.class);
        startActivity(init);
    }

    public void volver (View view){
        Intent sig = new Intent(this, entrada_datos.class);
        startActivity(sig);
    }

    public void helpChoice (View view){

        AlertDialog.Builder alerta = new AlertDialog.Builder(choice.this);
        alerta.setMessage("NutriGreen ofrece 2 modos para los alimentos:\n" +
                "\t- El primero, le permite seleccionar alimentos entre varias categorías, posteriormente le dará las porciones recomendadas de acuerdo a los datos que ingresó\n" +
                "\t- El segundo le permite seleccionar menús ya predefinidos.\n")
                .setCancelable(true)
                .setPositiveButton("¡Entendido!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: ¿Qué debería elegir?");
        titulo.show();
    }
}