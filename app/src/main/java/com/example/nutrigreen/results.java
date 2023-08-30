package com.example.nutrigreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class results extends AppCompatActivity {

    private TextView frn;
    private TextView vern;
    private TextView carbn;
    private TextView protn;
    private TextView lacn;

    private TextView frp;
    private TextView verp;
    private TextView carbp;
    private TextView protp;
    private TextView lacp;

    private TextView adv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        //nombres de alimentos
        frn = (TextView) findViewById(R.id.txt_frn);
        vern = (TextView) findViewById(R.id.txt_vern);
        carbn = (TextView) findViewById(R.id.txt_carbn);
        protn = (TextView) findViewById(R.id.txt_protn);
        lacn = (TextView) findViewById(R.id.txt_lacn);
        //porciones de alimentos
        frp = (TextView) findViewById(R.id.txt_frp);
        verp = (TextView) findViewById(R.id.txt_verp);
        carbp = (TextView) findViewById(R.id.txt_carbp);
        protp = (TextView) findViewById(R.id.txt_protp);
        lacp = (TextView) findViewById(R.id.txt_lacp);

        adv = (TextView) findViewById(R.id.txt_adv);

        //asignación
        frn.setText(getIntent().getStringExtra("frutan"));
        frp.setText(getIntent().getStringExtra("frutap"));

        vern.setText(getIntent().getStringExtra("verduran"));
        verp.setText(getIntent().getStringExtra("verdurap"));

        carbn.setText(getIntent().getStringExtra("carbohidraton"));
        carbp.setText(getIntent().getStringExtra("carbohidratop"));

        protn.setText(getIntent().getStringExtra("proteinan"));
        protp.setText(getIntent().getStringExtra("proteinap"));

        lacn.setText(getIntent().getStringExtra("lacteon"));
        lacp.setText(getIntent().getStringExtra("lacteop"));

        /*
        Random r = new Random();

        int value = r.nextInt(10 + 1) + 1;
        if (value >= 3){
            adv.setText("Si usted decide tomar alcohol, reduzca la cantidad y hágalo con un alimento. Consulte con su proveedor de atención médica sobre la forma como el alcohol afectará su azúcar en la sangre y para determinar una cantidad segura para usted");
        } else if (value >= 6) {
            adv.setText("Los dulces son ricos en grasa y azúcar. Mantenga los tamaños de las porciones pequeños.");
        } else if (value >= 10) {
            adv.setText("Coma dulces que no tengan azúcar.");
        }
        */
    }
}