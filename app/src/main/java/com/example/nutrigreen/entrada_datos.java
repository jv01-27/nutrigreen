package com.example.nutrigreen;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class entrada_datos extends AppCompatActivity{
    private Spinner ages;
    private EditText alturat;
    private EditText pesot;
    private Spinner sexs;
    private EditText glucosat;

    private Spinner actfisicaS;
    /*
    private EditText descansot;
    private EditText movimientot;
    private EditText aseopt;
    private EditText tareashogart;
    private Spinner trabajos;
    private Spinner deportes;
    private EditText ttrabajot;
    private EditText tdeportet;
    */

    private int age;
    //private double altura;
    private double peso;
    //private boolean sex;
    //private int glucosa;

    private double metabolismobasal;
    private double get;
    private boolean validateData;

    /*
    private double descanso;
    private double movimiento;
    private double aseop;
    private double tareashogar;
    private double trabajo;
    private double deporte;
    */

    private TextView testText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada_datos);
        //Datos Personales
        //Textos
        alturat = (EditText)findViewById(R.id.in_altura);
        pesot = (EditText)findViewById(R.id.in_peso);
        glucosat = (EditText)findViewById(R.id.in_glucosa);

        //Spinners
        ages = (Spinner) findViewById(R.id.spinner_age);
        sexs = (Spinner) findViewById(R.id.spinner_sex);

        //Actividad Física
        //Spinner
        actfisicaS = (Spinner) findViewById(R.id.actividadfisica);

        /*
        //Textos
        descansot = (EditText)findViewById(R.id.in_descanso);
        movimientot = (EditText)findViewById(R.id.in_movimiento);
        aseopt = (EditText)findViewById(R.id.in_aseop);
        tareashogart = (EditText)findViewById(R.id.in_tareash);
        ttrabajot = (EditText)findViewById(R.id.in_tiempo_trabajo);
        tdeportet = (EditText)findViewById(R.id.in_tiempo_deporte);
        //Spinners
        trabajos = (Spinner) findViewById(R.id.spinner_trabajo);
        deportes = (Spinner) findViewById(R.id.spinner_deporte);
        */

        testText = (TextView) findViewById(R.id.t1);

        //setupHyperlink();

        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        // La actividad está creada.
        }
    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "¡Vuelva Pronto!", Toast.LENGTH_LONG).show();
        // La actividad est� a punto de ser destruida.
    }

    public void siguiente (View view){
        get();
        if (validateData == true){
            Intent sig = new Intent(this, choice.class);
            sig.putExtra("g_e_t", get());

            startActivity(sig);
        } else {
            floatingMessage("Necesita ingresar los datos solicitados","Entendido","Error");
        }


        //unused GET method
        /*
        glucosa = Integer.parseInt(sglucosa);

        if (peso < 20) {
            Toast.makeText(this, "Ingrese un peso válido (+20 Kg)",
                    Toast.LENGTH_LONG).show();
        } else {
            if (altura < 1) {
                Toast.makeText(this, "Ingrese una alturas válida (+ 1m)",
                        Toast.LENGTH_LONG).show();
            } else {
                String sdescanso = descansot.getText().toString();
                String smovimiento = movimientot.getText().toString();
                String saseop = aseopt.getText().toString();
                String stareashogar = tareashogart.getText().toString();
                String sttrabajo = ttrabajot.getText().toString();
                String stdeporte = tdeportet.getText().toString();

                descanso = Double.parseDouble(sdescanso);
                movimiento = Double.parseDouble(smovimiento);
                aseop = Double.parseDouble(saseop);
                tareashogar = Double.parseDouble(stareashogar);
                trabajo = Double.parseDouble(sttrabajo);
                deporte = Double.parseDouble(stdeporte);

                descanso = descanso * 60 * peso * 0.018;
                movimiento = movimiento * 60 * peso * 0.063;
                aseop = aseop * 60 * peso * 0.036;
                tareashogar = 60* peso * 0.037;

                switch (trabajos.getSelectedItem().toString()){
                    case "Ligero":
                        trabajo = trabajo * 60 * peso * 0.031;
                        break;
                    case "Activo":
                        trabajo = trabajo * 60 * peso * 0.049;
                        break;
                    case "Muy Activo":
                        trabajo = trabajo * 60 * peso * 0.096;
                        break;
                }
                switch (deportes.getSelectedItem().toString()){
                    case "Correr":
                        deporte = deporte * 60 * peso * 0.151;
                        break;
                    case "Tenis":
                        deporte = deporte * 60 * peso * 0.109;
                        break;
                    case "Fútbol":
                        deporte = deporte * 60 * peso * 0.137;
                        break;
                    case "Básquetbol":
                        deporte = deporte * 60 * peso * 0.14;
                        break;
                    case "Ciclismo":
                        deporte = deporte * 60 * peso * 0.12;
                        break;
                    case "Montañismo":
                        deporte = deporte * 60 * peso * 0.147;
                        break;
                    case "Natación":
                        deporte = deporte * 60 * peso * 0.106;
                        break;
                    case "Cabalgata":
                        deporte = deporte * 60 * peso * 0.107;
                        break;
                }
            }
        }

        get = descanso + movimiento + aseop + tareashogar + trabajo + deporte;

        if (sex == true) {
            String getstr = String.valueOf(get);
            //text.setText(getstr);

            Intent sig = new Intent(this, choice.class);
            sig.putExtra("g_e_t", getstr);

            startActivity(sig);
        }
        else {
            get = get - (get*10/100);
            String getstr = String.valueOf(get);
            //text.setText(getstr);

            Intent sig = new Intent(this, choice.class);
            sig.putExtra("g_e_t", getstr);

            startActivity(sig);
        }
        */
    }

    public void testget (View view) {

        switch (sexs.getSelectedItem().toString()){
            case "Masculino":
                metabolismobasal = metabolismobasalH();
                break;
            case "Femenino":
                metabolismobasal = metabolismobasalM();
                break;
        }

        switch (actfisicaS.getSelectedItem().toString()) {
            case "Leve":
                get = metabolismobasal * 1.55;
                break;
            case "Moderada":
                get = metabolismobasal * 1.84;
                break;
            case "Intensa":
                get = metabolismobasal * 2.2;
                break;
        }
        String getstr = String.valueOf(get);
        testText.setText(getstr);
    }

    public double get () {

        switch (sexs.getSelectedItem().toString()){
            case "Masculino":
                metabolismobasal = metabolismobasalH();
                break;
            case "Femenino":
                metabolismobasal = metabolismobasalM();
                break;
        }

        switch (actfisicaS.getSelectedItem().toString()) {
            case "Leve":
                get = metabolismobasal * 1.55;
                break;
            case "Moderada":
                get = metabolismobasal * 1.84;
                break;
            case "Intensa":
                get = metabolismobasal * 2.2;
                break;
        }

        String getstr = String.valueOf(get);
        testText.setText(getstr);

        return get;
    }

    public double metabolismobasalH () {
        String sage = ages.getSelectedItem().toString();
        String speso = pesot.getText().toString();
        String saltura = alturat.getText().toString();

        if(!speso.isEmpty()) {
            if(!saltura.isEmpty()){
                age = Integer.parseInt(sage);
                peso = Double.parseDouble(speso);
                validateData = true;

                double metbasH;
                if (age == 18) {
                    metbasH = (17.686 * peso) + 658.2;
                } else if (age <= 30) {
                    metbasH = (15.057 * peso) + 692.2;
                } else if (age <= 60) {
                    metbasH = (11.472 * peso) + 873.1;
                } else {
                    metbasH = (11.711 * peso) + 587.7;
                }
                return metbasH;
            } else {
                alturat.setError("No ha ingresado su altura!");
                validateData = false;
            }
        } else {
            pesot.setError("No ha ingresado su peso!");
            validateData = false;
        }
        return 0;
    }

    public double metabolismobasalM () {
        String sage = ages.getSelectedItem().toString();
        String speso = pesot.getText().toString();
        String saltura = alturat.getText().toString();

        if(!speso.isEmpty()) {
            if(!saltura.isEmpty()){
                age = Integer.parseInt(sage);
                peso = Double.parseDouble(speso);
                validateData = true;

                double metbasM;
                if (age == 18) {
                    metbasM = (13.384 * peso) + 692.6;
                } else if (age <= 30) {
                    metbasM = (14.818 * peso) + 486.6;
                } else if (age <= 60) {
                    metbasM = (8.126 * peso) + 845.6;
                } else {
                    metbasM = (9.082 * peso) + 658.5;
                }
                return metbasM;
            } else {
                alturat.setError("No ha ingresado su altura!");
            }
        }else {
            pesot.setError("No ha ingresado su peso!");
        }
        return 0;
    }

    /*
    public void gastoEnergeticoTotal(View view) {
        String sage = ages.getSelectedItem().toString();
        String saltura = alturat.getText().toString();
        String speso = pesot.getText().toString();
        String sglucosa = glucosat.getText().toString();

        age = Integer.parseInt(sage);
        altura = Double.parseDouble(saltura);
        peso = Double.parseDouble(speso);

        switch (sexs.getSelectedItem().toString()){
            case "Masculino":
                sex = true;
                break;
            case "Femenino":
                sex = false;
                break;
        }

        glucosa = Integer.parseInt(sglucosa);

        if (peso < 20) {
            Toast.makeText(this, "Ingrese un peso válido (+20 Kg)",
                    Toast.LENGTH_LONG).show();
        } else {
            if (altura < 1) {
                Toast.makeText(this, "Ingrese una alturas válida (+ 1m)",
                        Toast.LENGTH_LONG).show();
            } else {
                String sdescanso = descansot.getText().toString();
                String smovimiento = movimientot.getText().toString();
                String saseop = aseopt.getText().toString();
                String stareashogar = tareashogart.getText().toString();
                String sttrabajo = ttrabajot.getText().toString();
                String stdeporte = tdeportet.getText().toString();

                descanso = Double.parseDouble(sdescanso);
                movimiento = Double.parseDouble(smovimiento);
                aseop = Double.parseDouble(saseop);
                tareashogar = Double.parseDouble(stareashogar);
                trabajo = Double.parseDouble(sttrabajo);
                deporte = Double.parseDouble(stdeporte);

                descanso = descanso * 60 * peso * 0.018;
                movimiento = movimiento * 60 * peso * 0.063;
                aseop = aseop * 60 * peso * 0.036;
                tareashogar = 60* peso * 0.037;

                switch (trabajos.getSelectedItem().toString()){
                    case "Ligero":
                        trabajo = trabajo * 60 * peso * 0.031;
                        break;
                    case "Activo":
                        trabajo = trabajo * 60 * peso * 0.049;
                        break;
                    case "Muy Activo":
                        trabajo = trabajo * 60 * peso * 0.096;
                        break;
                }
                switch (deportes.getSelectedItem().toString()){
                    case "Correr":
                        deporte = deporte * 60 * peso * 0.151;
                        break;
                    case "Tenis":
                        deporte = deporte * 60 * peso * 0.109;
                        break;
                    case "Fútbol":
                        deporte = deporte * 60 * peso * 0.137;
                        break;
                    case "Básquetbol":
                        deporte = deporte * 60 * peso * 0.14;
                        break;
                    case "Ciclismo":
                        deporte = deporte * 60 * peso * 0.12;
                        break;
                    case "Montañismo":
                        deporte = deporte * 60 * peso * 0.147;
                        break;
                    case "Natación":
                        deporte = deporte * 60 * peso * 0.106;
                        break;
                    case "Cabalgata":
                        deporte = deporte * 60 * peso * 0.107;
                        break;
                }
            }
        }

        get = descanso + movimiento + aseop + tareashogar + trabajo + deporte;

        if (sex == true) {
            String getstr = String.valueOf(get);
            text.setText(getstr);
        }
        else {
            get = get - (get*10/100);
            String getstr = String.valueOf(get);
            text.setText(getstr);
        }


        final nutrigreenBD ngbd= new nutrigreenBD(getApplicationContext());
        ngbd.agregar_registro(1,age,peso,altura,sexs.getSelectedItem().toString(),glucosa,get,new Date().toString());
        Toast.makeText(getApplicationContext(),"Sus datos se agregaron a la BD",Toast.LENGTH_SHORT).show();

    }
    */

    public void test (View view){
        String sage = ages.getSelectedItem().toString();
        String saltura = alturat.getText().toString();
        String speso = pesot.getText().toString();
        String sglucosa = glucosat.getText().toString();

        String ssex = sexs.getSelectedItem().toString();

        testText.setText(sage + " - " + speso + " - " + saltura + " - " + sglucosa + " - " + ssex);
        //+ pesot + speso + glucosat + sexs
    }
    public void volver (View view){
        Intent sig = new Intent(this, MainActivity.class);
        startActivity(sig);
    }

    public void legal (View view){
        Intent sig = new Intent(this, legal.class);
        startActivity(sig);
    }

    public void floatingMessage (String message, String oktext, String title){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage(message)

                .setCancelable(true)
                .setPositiveButton(oktext, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle(title);
        titulo.show();
    }
    public void helpAF (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage("La actividad leve considera actividades como:\n" +
                "\t- Cocinar.\n" +
                "\t- Limpiar la casa.\n" +
                "\t- Cuidar a los niños.\n" +
                "\t- Trabajar sentado.\n" +
                "\t- Caminar hasta 1 hora por día.\n \n" +
                "La actividad moderada considera actividades como:\n" +
                "\t- Correr, nadar, bailar, o andar en bici al menos 1 hora por día.\n" +
                "\t- Trabajar como obrero en la construcción, vendedor puerta a puerta, cartero o repartidor de mercancía leve.\n \n" +
                "La actividad intensa considera actividades como:\n" +
                "\t- Correr, nadar, bailar, o andar en bici al menos 2 hora por día.\n" +
                "\t- Trabajador rural que utiliza instrumentos manuales y que caminan largas distancias o repartidor de mercancía pesada.")

                .setCancelable(true)
                .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Actividad Física");
        titulo.show();
    }

    //unused help methods
    /*
    public void setupHyperlink(){
        TextView linkTextView = findViewById(R.id.terminos);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void help (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage("")
                .setCancelable(true)
                .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda:");
        titulo.show();
    }
    public void helpDiabetes (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage("Diabetes tipo 1: \n" +
                "La diabetes tipo 1 es causada por una reacción autoinmunitaria (el cuerpo se ataca a sí mismo por error). Esta reacción impide que su cuerpo produzca insulina.\n" +
                "Diabetes tipo 2: \n" +
                "Con la diabetes tipo 2, el cuerpo no usa la insulina adecuadamente y no puede mantener el azúcar en la sangre a niveles normales.\n" +
                "Aproximadamente del 90 al 95% de las personas con diabetes tiene la diabetes tipo 2.\n" +
                "*De momento, nuestra app no ofrece funciones alternativas para la diabetes tipo 1, sin embargo, las recomendaciones de alimento aplican igualmente para ambos tipos.")
            .setCancelable(true)
            .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Tipos de Diabetes");
        titulo.show();
    }
    */
    public void helpGlucosa (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage("El nivel de glucosa en sangre o glucemia es la cantidad de glucosa (azúcar), que circula por el torrente sanguíneo. \n" +
                "Para conocer este valor debe usar un medidor del nivel de azúcar en la sangre (glucómetro).\n" +
                "Hay diferentes tipos de medidores, pero la mayoría de ellos funcionan de la misma manera. Pídale a su médico que le muestre los beneficios de cada uno.\n" +
                "Para un correcto cálculo el nivel de glucosa DEBE ingresarse en miligramos por decilitro (mg/dl).")
                .setCancelable(true)
                .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Nivel de Glucosa");
        titulo.show();
    }

    /*
    public void helpDescanso (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage("Entre las actividades involucradas tenemos:\n" +
                "- Dormir.\n" +
                "- Estar sentado (leyendo, escribiendo, conversando, jugando cartas, etc.)\n" +
                "- Estar de pie (esperando, charlando, etc.)\n" +
                "Escriba el tiempo (en conjunto) que realiza estas actividades")
                .setCancelable(true)
                .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Actividades de Descanso");
        titulo.show();
    }
    public void helpMovimiento (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage("Entre las actividades involucradas tenemos:\n" +
                "- Caminar.\n" +
                "- Dar un paseo.\n" +
                "- Subir, bajar escaleras.\n" +
                "- Conducir coche o moto.\n" +
                "Escriba el tiempo (en conjunto) que realiza estas actividades")
                .setCancelable(true)
                .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Actividades de Movimiento");
        titulo.show();
    }
    public void helpAseoPersonal (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage("Entre las actividades involucradas tenemos:\n" +
                "- Bañarse, ducharse, lavarse.\n" +
                "- Peinarse, vestirse.\n" +
                "- Limpiar los zapatos.\n" +
                "Escriba el tiempo (en conjunto) que realiza estas actividades")
                .setCancelable(true)
                .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Actividades de Aseo Personal");
        titulo.show();
    }
    public void helpTareasHogar (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage("Entre las actividades involucradas tenemos:\n" +
                "- Barrer, Trapear.\n" +
                "- Aspirar el piso.\n" +
                "- Planchar la ropa.\n" +
                "- Limpiar los cristales.\n" +
                "- Tender la cama.\n" +
                "- Lavar la ropa, los trastes.\n" +
                "- Cocinar.\n" +
                "Escriba el tiempo (en conjunto) que realiza estas actividades")
                .setCancelable(true)
                .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Actividades del Hogar");
        titulo.show();
    }
    public void helpTrabajo (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage("El trabajo se clasifica de la siguiente manera:\n" +
                "- Ligero: (Empleos de oficina, estudiantes, profesionales, comercio, etc).\n" +
                "- Activo: (Industria ligera, construcción (excepto muy duros), ama de casa, trabajos agrícolas, pesca, etc.)\n" +
                "- Muy activo: (Segar, cavar, peones, leñadores, soldados en maniobras, mineros, metalúrgicos, atletas, bailarines, etc.)\n" +
                "Seleccione el tipo de trabajo que realiza y escriba el tiempo que invierte en ello.")
                .setCancelable(true)
                .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Clasificación del Trabajo");
        titulo.show();
    }
    public void helpDeporte (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(entrada_datos.this);
        alerta.setMessage("Seleccione alguno de los deportes que realiza:\n" +
                "*En caso de no practicar algún deporte, seleccione cualquiera y deje el campo de tiempo en 0 ")
                .setCancelable(true)
                .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Ayuda: Deportes");
        titulo.show();
    }
    */
}