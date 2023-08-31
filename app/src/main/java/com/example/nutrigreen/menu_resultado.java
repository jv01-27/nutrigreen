package com.example.nutrigreen;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu_resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_resultado);
    }
    public void helpMenuChoice (View view){

        AlertDialog.Builder alerta = new AlertDialog.Builder(menu_resultado.this);
        alerta.setMessage("Los alimentos se presentan de la siguiente forma:\n" +
                "Alimento | Porción")
                .setCancelable(true)
                .setPositiveButton("¡Entendido!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Menú");
        titulo.show();
        }
    public void volver (View view){
        Intent sig = new Intent(this, menu_selection.class);
        startActivity(sig);
    }
}