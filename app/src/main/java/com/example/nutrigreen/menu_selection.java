package com.example.nutrigreen;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class menu_selection extends AppCompatActivity {
    private ListView listview;
    private ArrayList<String> menus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_selection);

        listview = (ListView) findViewById(R.id.listview);

        /*
        menus = new ArrayList<String>();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menus);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(menu_selection.this, "Has pulsado: "  + menus.get(position), Toast.LENGTH_LONG).show();
                Intent sig = new Intent(menu_selection.this, menu_resultado.class);
                startActivity(sig);
            }
        });
        */
    }

    public void m1(View view) {
        Intent sig = new Intent(this ,menu_resultado.class);
        startActivity(sig);
    }

    public void m2(View view) {
        //Intent sig = new Intent(this, MainActivity.class);
        //startActivity(sig);
    }

    public void m3(View view) {
        //Intent sig = new Intent(this, MainActivity.class);
        //startActivity(sig);
    }
    public void volver (View view){
        Intent sig = new Intent(this, choice.class);
        startActivity(sig);
    }
    public void helpResultado (View view){

        AlertDialog.Builder alerta = new AlertDialog.Builder(menu_selection.this);
        alerta.setMessage("Debe seleccionar un menú de su preferencia, algunos incluyen postre.\n" +
                "Cuando no se especifica la bebida, ésta será agua simple.")
                .setCancelable(true)
                .setPositiveButton("¡Entendido!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Selección de Menú");
        titulo.show();
    }
}