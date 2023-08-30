package com.example.nutrigreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class alimento extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner sp_time;
    private Spinner sp_fr;
    private Spinner sp_veg;
    private Spinner sp_carb;
    private Spinner sp_prot;
    private Spinner sp_lac;

    private String frp;
    private String verp;
    private String carbp;
    private String protp;
    private String lacp;

    private TextView get_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimento);

        //Spinners
        sp_time = (Spinner)findViewById(R.id.spinner_tiempo);
        sp_fr = (Spinner)findViewById(R.id.spinner_fr);
        sp_veg = (Spinner)findViewById(R.id.spinner_veg);
        sp_carb = (Spinner)findViewById(R.id.spinner_carb);
        sp_prot = (Spinner)findViewById(R.id.spinner_prot);
        sp_lac = (Spinner)findViewById(R.id.spinner_lac);

        //Textos
        //get_t = (TextView)findViewById(R.id.text_get);

        //get_t.setText("Gasto Energpetico: " + getIntent().getStringExtra("g_e_t") + " KCal");

        ArrayAdapter <CharSequence> tiempos = ArrayAdapter.createFromResource(
                this,
                R.array.tiempo,
                android.R.layout.simple_spinner_item);
        tiempos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_time.setAdapter(tiempos);
        sp_time.setOnItemSelectedListener(this);

    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //Cambiar el Spinner de Fruta
        int[] t1  = {R.array.no_select,
                R.array.fruta_des,
                R.array.fruta_alm,
                R.array.fruta_com,
                R.array.fruta_cen};

        ArrayAdapter <CharSequence> fr_t = ArrayAdapter.createFromResource(
                this,
                t1[i],
                android.R.layout.simple_spinner_item);
        fr_t.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_fr.setAdapter(fr_t);

        //Cambio de porcentaje de cálculo

        //Cambiar el Spinner de Verdura
        int [] t2 = {R.array.no_select,
                R.array.verdura_des,
                R.array.verdura_alm,
                R.array.verdura_com,
                R.array.verdura_cen};

        ArrayAdapter <CharSequence> veg_t = ArrayAdapter.createFromResource(
                this,
                t2[i],
                android.R.layout.simple_spinner_item);
        veg_t.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_veg.setAdapter(veg_t);

        //Cambio de porcentaje de cálculo

        //Cambiar el Spinner de Proteinas/Origen Animal
        int [] t3 = {R.array.no_select,
                R.array.proteina_des,
                R.array.proteina_alm,
                R.array.proteina_com,
                R.array.proteina_cen};

        ArrayAdapter <CharSequence> prot_t = ArrayAdapter.createFromResource(
                this,
                t3[i],
                android.R.layout.simple_spinner_item);
        prot_t.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_prot.setAdapter(prot_t);

        //Cambio de porcentaje de cálculo

        //Cambiar el Spinner de Cereales
        int [] t4 = {R.array.no_select,
                R.array.cereales_des,
                R.array.cereales_alm,
                R.array.cereales_com,
                R.array.cereales_cen};

        ArrayAdapter <CharSequence> carb_t = ArrayAdapter.createFromResource(
                this,
                t4[i],
                android.R.layout.simple_spinner_item);
        carb_t.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_carb.setAdapter(carb_t);

        //Cambio de porcentaje de cálculo

        //Cambiar el Spinner de Lacteos
        int [] t5 = {R.array.no_select,
                R.array.lacteos_des,
                R.array.lacteos_alm,
                R.array.lacteos_com,
                R.array.lacteos_cen};

        ArrayAdapter <CharSequence> lac_t = ArrayAdapter.createFromResource(
                this,
                t5[i],
                android.R.layout.simple_spinner_item);
        lac_t.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_lac.setAdapter(lac_t);

        //Cambio de porcentaje de cálculo
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void volverA (View view){
        Intent sig = new Intent(this, entrada_datos.class);
        startActivity(sig);
    }

    public void calcular (View view){
        validarSpinnerFruta();
        validarSpinnerVerdura();
        validarSpinnerCarb();
        validarSpinnerProt();
        validarSpinnerLac();

        Intent sig = new Intent(this, results.class);

        sig.putExtra("frutap", frp);
        sig.putExtra("frutan", sp_fr.getSelectedItem().toString());

        sig.putExtra("verdurap", verp);
        sig.putExtra("verduran", sp_veg.getSelectedItem().toString());

        sig.putExtra("carbohidratop", carbp);
        sig.putExtra("carbohidraton", sp_carb.getSelectedItem().toString());

        sig.putExtra("proteinap", protp);
        sig.putExtra("proteinan", sp_prot.getSelectedItem().toString());

        sig.putExtra("lacteop", lacp);
        sig.putExtra("lacteon", sp_lac.getSelectedItem().toString());

        startActivity(sig);
    }
    public void validarSpinnerFruta(){
        switch (sp_fr.getSelectedItem().toString()){
            case "Arándano":
                frp = "1/2 Taza";
                break;
            case "Chabacano":
                frp = "4 Piezas";
                break;
            case "Chirimoya":
                frp = "1/3 de Pieza";
                break;
            case "Ciruela":
                frp = "3 Piezas";
                break;
            case "Ciruela pasa deshuesada":
                frp = "7 Piezas";
                break;
            case "Durazno (chico)":
                frp = "2 Piezas";
                break;
            case "Frambuesa":
                frp = "1 Taza";
                break;
            case "Fresa rebanada":
                frp = "1 Taza";
                break;
            case "Gajos de mandarina, toronja y naranja":
                frp = "1 Taza";
                break;
            case "Granada china":
                frp = "2 Piezas";
                break;
            case "Granada roja":
                frp = "1 Pieza";
                break;
            case "Guanábana":
                frp = "1 Pieza";
                break;
            case "Guayaba":
                frp = "3 Piezas";
                break;
            case "Higo":
                frp = "Taza";
                break;
            case "Lichis":
                frp = "12 Piezas";
                break;
            case "Lima":
                frp = "3 Piezas";
                break;
            case "Mamey":
                frp = "1/3 de Pieza";
                break;
            case "Mandarina (chica)":
                frp = "2 Piezas";
                break;
            case "Mango ataulfo":
                frp = "1/2 Pieza";
                break;
            case "Mango petacón":
                frp = "1/2 Pieza";
                break;
            case "Manzana (chica)":
                frp = "1 Pieza";
                break;
            case "Melón picado":
                frp = "1 Taza";
                break;
            case "Naranja":
                frp = "1 Pieza";
                break;
            case "Papaya picada":
                frp = "1 Taza";
                break;
            case "Pasas":
                frp = "10 Piezas";
                break;
            case "Pera":
                frp = "1/2 Pieza";
                break;
            case "Piña picada":
                frp = "3/4 de Taza";
                break;
            case "Plátano macho":
                frp = "1/4 de Pieza";
                break;
            case "Plátano tabasco":
                frp = "1/2 Pieza";
                break;
            case "Sandía picada":
                frp = "1 Taza";
                break;
            case "Toronja":
                frp = "1 Pieza";
                break;
            case "Tuna":
                frp = "Taza";
                break;
            case "Uva roja o verde":
                frp = "2 Piezas";
                break;
            case "Zapote negro":
                frp = "1/2 Pieza";
                break;
            case "Zarzamora":
                frp = "1 Taza";
                break;
        }
    }
    public void validarSpinnerVerdura(){
        switch (sp_veg.getSelectedItem().toString()){
            case "Acelga cocida":
                verp = "1/2 Taza";
                break;
            case "Acelga cruda":
                verp = "2 Tazas";
                break;
            case "Champiñón cocido rebanado":
                verp = "1 Taza";
                break;
            case "Ejotes cocidos picados":
                verp = "1/2 Taza";
                break;
            case "Espinaca cocida":
                verp = "1/2 Taza";
                break;
            case "Flor de calabaza cocida":
                verp = "1 Taza";
                break;
            case "Huitlacoche cocido":
                verp = "5 Cucharadas";
                break;
            case "Lechuga":
                verp = "3 Tazas";
                break;
            case "Nabo":
                verp = "1/2 Taza";
                break;
            case "Nopal Cocido":
                verp = "1 Taza";
                break;
            case "Papaloquelite":
                verp = "2 Tazas";
                break;
            case "Pepino rebanado":
                verp = " Taza";
                break;
            case "Pimiento morrón (rojo, amarillo, verde)":
                verp = "1 Pieza";
                break;
            case "Rábano":
                verp = "1 Taza";
                break;
            case "Salsa mexicana, pico de gallo, taquera, roja o verde":
                verp = "1/2 Taza";
                break;
            case "Setas cocidas":
                verp = "1/2 Taza";
                break;
            case "Berro cocido":
                verp = "1 Taza";
                break;
            case "Brócoli cocido":
                verp = "1/2 Taza";
                break;
            case "Calabacita cocida":
                verp = "1/2 Taza";
                break;
            case "Chayote cocido":
                verp = "1/2 Taza";
                break;
            case "Jicama picada":
                verp = "1/2 Taza";
                break;
            case "Puré de tomate":
                verp = "1/4 Taza";
                break;
            case "Quelite":
                verp = "1/2 Taza";
                break;
            case "Romeritos cocidos":
                verp = "1 Taza";
                break;
            case "Zanahoria Picada o rallada":
                verp = "1/2 Taza";
                break;
        }
    }
    public void validarSpinnerCarb(){
        switch (sp_carb.getSelectedItem().toString()){
            case "Avena en hojuelas":
                carbp = "1 Taza";
                break;
            case "Avena Cocida":
                carbp = "1/3 Taza";
                break;
            case "Barrita de granola o avena":
                carbp = "1/2 Taza";
                break;
            case "Bolillo sin migajón":
                carbp = "1/2 Taza";
                break;
            case "Cereal de caja con azúcar":
                carbp = "1/3 Taza";
                break;
            case "Cereal de caja sin azúcar":
                carbp = "1/2 Taza";
                break;
            case "Crepas":
                carbp = "2 Piezas";
                break;
            case "Galleta de animalitos":
                carbp = "6 Piezas";
                break;
            case "Galleta María":
                carbp = "5 Piezas";
                break;
            case "Galleta salada":
                carbp = "4 Piezas";
                break;
            case "Hot cake (1 pieza chica)":
                carbp = "1 Pieza";
                break;
            case "Maíz (blanco, cacahuazintle, palomero)":
                carbp = "22 Gramos";
                break;
            case "Palitos de pan":
                carbp = "3 Piezas";
                break;
            case "Palomitas naturales":
                carbp = "3 Tazas";
                break;
            case "Pan de caja (blanco, integral, multigrano)":
                carbp = "1/2 Taza";
                break;
            case "Pan tostado":
                carbp = "1 Pieza";
                break;
            case "Papa (hervida o al horno)":
                carbp = "1/2 Taza";
                break;
            case "Tlacoyo (sin freír)":
                carbp = "1 Pieza";
                break;
            case "Tortilla de maíz":
                carbp = "1 Pieza";
                break;
            case "Tortilla de maíz azul":
                carbp = "1 Pieza";
                break;
            case "Tortilla de harina":
                carbp = "1/2 Pieza";
                break;
        }
    }
    public void validarSpinnerProt(){
        switch (sp_prot.getSelectedItem().toString()){
            case "Almeja fresca":
                protp = "4 Piezas";
                break;
            case "Atún en agua":
                protp = "40 Gramos";
                break;
            case "Agujas de res":
                protp = "40 Gramos";
                break;
            case "Arrachera":
                protp = "30 Gramos";
                break;
            case "Atún en aceite":
                protp = "30 Gramos";
                break;
            case "Bagre":
                protp = "80 Gramos";
                break;
            case "Barbacoa Maciza":
                protp = "50 Gramos";
                break;
            case "Bistec de ternera":
                protp = "40 Gramos";
                break;
            case "Bistec de res":
                protp = "30 Gramos";
                break;
            case "Cabeza de pescado":
                protp = "400 Gramos";
                break;
            case "Cabrito":
                protp = "30 Gramos";
                break;
            case "Calamar ":
                protp = "50 Gramos";
                break;
            case "Camarón cocido":
                protp = "5 Piezas";
                break;
            case "Cangrejo":
                protp = "2 Piezas";
                break;
            case "Carne de avestruz":
                protp = "40 Gramos";
                break;
            case "Carne de jaiba":
                protp = "40 Gramos";
                break;
            case "Carne de res seca":
                protp = "1 Cucharada";
                break;
            case "Carne molida de pollo y pavo":
                protp = "30 Gramos";
                break;
            case "Carne de cerdo":
                protp = "40 Gramos";
                break;
            case "Carpa cocida":
                protp = "30 Gramos";
                break;
            case "Cecina":
                protp = "30 Gramos";
                break;
            case "Conejo":
                protp = "45 Gramos";
                break;
            case "Charales frescos":
                protp = "30 Gramos";
                break;
            case "Charales secos":
                protp = "1 Cucharada";
                break;
            case "Clara de huevo":
                protp = "2 Piezas";
                break;
            case "Escalopa de res":
                protp = "30 Gramos";
                break;
            case "Escamoles":
                protp = "80 Gramos";
                break;
            case "Fajitas de pollo sin piel":
                protp = "30 Gramos";
                break;
            case "Falda de res":
                protp = "40 Gramos";
                break;
            case "Filete de Huachinango":
                protp = "40 Gramos";
                break;
            case "Filete de pescado, mero, mojarra, merluza":
                protp = "40 Gramos";
                break;
            case "Filete de res y tampiqueña":
                protp = "30 Gramos";
                break;
            case "Huachinango":
                protp = "70 Gramos";
                break;
            case "Huevo":
                protp = "1 Pieza";
                break;
            case "Jaiba cocida entera":
                protp = "80 Gramos";
                break;
            case "Liebre":
                protp = "50 Gramos";
                break;
            case "Longaniza":
                protp = "45 Gramos";
                break;
            case "Maciza de res":
                protp = "15 Gramos";
                break;
            case "Medallón de filete de res":
                protp = "1/3 Pieza";
                break;
            case "Mejillones":
                protp = "30 Gramos";
                break;
            case "Milanesa de pollo y res":
                protp = "30 Gramos";
                break;
            case "Molida de pollo":
                protp = "30 Gramos";
                break;
            case "Molleja de pollo":
                protp = "30 Gramos";
                break;
            case "Muslo de pollo sin piel":
                protp = "1/2 Gramos";
                break;
            case "Pancita de res":
                protp = "50 Gramos";
                break;
            case "Pata de res":
                protp = "120 Gramos";
                break;
            case "Pechuga a la plancha, asada, cocida":
                protp = "30 Gramos";
                break;
            case "Pechuga de pavo":
                protp = "2 Rebanadas";
                break;
            case "Pechuga de pollo deshuesada":
                protp = "30 Gramos";
                break;
            case "Pescado en trozo":
                protp = "80 Gramos";
                break;
            case "Pierna de pollo sin piel":
                protp = "1/4 de Pieza";
                break;
            case "Puntas de res":
                protp = "30 Gramos";
                break;
            case "Queso cottage":
                protp = "3 Cucharadas";
                break;
            case "Salami de pavo":
                protp = "6 Rebanadas";
                break;
            case "Salchicha de cerdo":
                protp = "3/4 de Pieza";
                break;
            case "Salchicha de pavo":
                protp = "1 Pieza";
                break;
            case "Sardina en aceite":
                protp = "3 Piezas";
                break;
            case "Sardina en tomate":
                protp = "1 Pieza";
                break;
            case "Suadero":
                protp = "29 Gramos";
                break;
            case "Surimi":
                protp = "2/3 de Barra";
                break;
            case "Tampiqueña":
                protp = "30 Gramos";
                break;
            case "Venado cocido":
                protp = "30 Gramos";
                break;
        }
    }
    public void validarSpinnerLac(){
        switch (sp_lac.getSelectedItem().toString()){
            case "Leche de soya baja en grasa":
                lacp = "1 Taza";
                break;
            case "Leche descremada":
                lacp = "1 Taza";
                break;
            case "Leche entera":
                lacp = "1 Taza";
                break;
            case "Leche liconsa liquida":
                lacp = "1/4 Taza";
                break;
            case "Yogurt light":
                lacp = "3/4 Taza";
                break;
            case "Yogurt bebible bajo en grasa y azúcar":
                lacp = "1 Pieza";
                break;
            case "Yogurt natural":
                lacp = "1 Taza";
                break;
            case "Yogurt bebible con fruta":
                lacp = "1 Taza";
                break;
        }
    }
    }