package com.example.nutrigreen;

import android.content.Intent;
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

        menus = new ArrayList<String>();
        menus.add("Menú 1:\n\tDesayuno: Queso primavera" +
                "\n\tComida: Bistec en chile pasilla" +
                "\n\tCena: Pechuga de Pavo con Calabacitas");
        menus.add("Menú 2:\n\tDesayuno: Pollo con ejotes" +
                "\n\tComida:  Arroz blanco" +
                "\n\tCena: Tostadas de pata");
        menus.add("Menú 3:" +
                "\n\tDesayuno: Hotcakes" +
                "\n\tComida: Sopa de Tallarín" +
                "\n\tCena: Atún Isleño");
        menus.add("Menú 4:" +
                "\n\tDesayuno: Chayote con jamón" +
                "\n\tComida: Caldo de hongos. Res con jitomate" +
                "\n\tCena: Enchiladas verdes con queso ,");
        menus.add("Menú 5:" +
                "\n\tDesayuno: Omelette de acelgas. Salsa verde" +
                "\n\tComida: Arroz rojo. Salpicón de pescado" +
                "\n\tCena: Alambre de pollo");
        menus.add("Menú 6:" +
                "\n\tDesayuno: Sincronizadas de champiñones" +
                "\n\tComida: Crema de calabacita. Pollo jugoso" +
                "\n\tCena: Tostadas de tinga");
        menus.add("Menú 7:" +
                "\n\tDesayuno: Cacerola de huevo" +
                "\n\tComida: Coditos. Cerdo agridulce" +
                "\n\tCena: Rollo de col y queso");
        menus.add("Menú 8:" +
                "\n\tDesayuno: Res con nopales" +
                "\n\tComida: Arroz amarillo con ejotes. Pescado al comal" +
                "\n\tCena: Pechuga de pavo a la mexicana");
        menus.add("Menú 9:" +
                "\n\tDesayuno: Fajita de pollo con pimiento" +
                "\n\tComida: Sopa a la campesina. Bistec en salsa morena" +
                "\n\tCena: Omelette de espinaca");
        menus.add("Menú 10:" +
                "\n\tDesayuno: Huevo con calabacita" +
                "\n\tComida: Fideos con espinacas. Cerdo en pipián" +
                "\n\tCena: Pollo con poblano");
        menus.add("Menú 10:" +
                "\n\tDesayuno: Tacos de jamón" +
                "\n\tComida: Sopa de zanahoria. Pescado al ajillo" +
                "\n\tCena: Pudin de verduras con queso");
        menus.add("Menú 12:" +
                "\n\tDesayuno: Brócoli con jamón" +
                "\n\tComida: Sopa de cebolla. Rollo de carne con verduras" +
                "\n\tCena: Queso con verdolagas");
        menus.add("Menú 13:" +
                "\n\tDesayuno: Molletes" +
                "\n\tComida: Sopa de pollo. Chile ancho relleno de queso" +
                "\n\tCena: Bistec entomatado");
        menus.add("Menú 14:" +
                "\n\tDesayuno: Coliflor con queso" +
                "\n\tComida: Sopa mixteca. Cerdo a la mexicana" +
                "\n\tCena: Conchitas con huevo");

        menus.add("Menú 15:\n\tDesayuno: Queso primavera" +
                "\n\tComida: Bistec en chile pasilla" +
                "\n\tCena: Pechuga de Pavo con Calabacitas");
        menus.add("Menú 16:" +
                "\n\tDesayuno: Hotcakes" +
                "\n\tComida: Sopa de Tallarín" +
                "\n\tCena: Atún Isleño");
        menus.add("Menú 17:" +
                "\n\tDesayuno: Chayote con jamón" +
                "\n\tComida: Caldo de hongos. Res con jitomate" +
                "\n\tCena: Enchiladas verdes con queso ,");
        menus.add("Menú |8:" +
                "\n\tDesayuno: Omelette de acelgas. Salsa verde" +
                "\n\tComida: Arroz rojo. Salpicón de pescado" +
                "\n\tCena: Alambre de pollo");
        menus.add("Menú |9:" +
                "\n\tDesayuno: Sincronizadas de champiñones" +
                "\n\tComida: Crema de calabacita. Pollo jugoso" +
                "\n\tCena: Tostadas de tinga");
        menus.add("Menú 20:" +
                "\n\tDesayuno: Cacerola de huevo" +
                "\n\tComida: Coditos. Cerdo agridulce" +
                "\n\tCena: Rollo de col y queso");
        menus.add("Menú 21:" +
                "\n\tDesayuno: Res con nopales" +
                "\n\tComida: Arroz amarillo con ejotes. Pescado al comal" +
                "\n\tCena: Pechuga de pavo a la mexicana");
        menus.add("Menú 22:" +
                "\n\tDesayuno: Fajita de pollo con pimiento" +
                "\n\tComida: Sopa a la campesina. Bistec en salsa morena" +
                "\n\tCena: Omelette de espinaca");
        menus.add("Menú 23:" +
                "\n\tDesayuno: Huevo con calabacita" +
                "\n\tComida: Fideos con espinacas. Cerdo en pipián" +
                "\n\tCena: Pollo con poblano");
        menus.add("Menú 24:" +
                "\n\tDesayuno: Tacos de jamón" +
                "\n\tComida: Sopa de zanahoria. Pescado al ajillo" +
                "\n\tCena: Pudin de verduras con queso");
        menus.add("Menú 25:" +
                "\n\tDesayuno: Brócoli con jamón" +
                "\n\tComida: Sopa de cebolla. Rollo de carne con verduras" +
                "\n\tCena: Queso con verdolagas");
        menus.add("Menú 26:" +
                "\n\tDesayuno: Molletes" +
                "\n\tComida: Sopa de pollo. Chile ancho relleno de queso" +
                "\n\tCena: Bistec entomatado");
        menus.add("Menú 27:" +
                "\n\tDesayuno: Coliflor con queso" +
                "\n\tComida: Sopa mixteca. Cerdo a la mexicana" +
                "\n\tCena: Conchitas con huevo");
        menus.add("Menú 28:" +
                "\n\tDesayuno: Pollo con ejotes" +
                "\n\tComida:  Arroz blanco" +
                "\n\tCena: Tostadas de pata");
        /*
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");
        menus.add("Menú :" +
                "\n\tDesayuno:" +
                "\n\tComida: " +
                "\n\tCena: ");

         */
        //menus.add("Menú 4:\n\tDesayuno: \n\tComida:  \n\tCena: ");
        //menus.add("Menú 5:\n\tDesayuno: \n\tComida:  \n\tCena: ");
        //menus.add("Menú 6:\n\tDesayuno: \n\tComida:  \n\tCena: ");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menus);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(menu_selection.this, "Has pulsado: " + menus.get(position), Toast.LENGTH_LONG).show();
                Intent sig = new Intent(menu_selection.this, menu_resultado.class);
                startActivity(sig);
            }
        });
    }

    public void m1(View view) {
        //Intent sig = new Intent(this, MainActivity.class);
        //startActivity(sig);
    }

    public void m2(View view) {
        //Intent sig = new Intent(this, MainActivity.class);
        //startActivity(sig);
    }

    public void m3(View view) {
        //Intent sig = new Intent(this, MainActivity.class);
        //startActivity(sig);
    }
}