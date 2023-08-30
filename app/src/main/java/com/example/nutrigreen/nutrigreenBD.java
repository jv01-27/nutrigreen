package com.example.nutrigreen;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class nutrigreenBD extends SQLiteOpenHelper {

    public static final String nombre_bd = "ng_db";
    public static final int version_bd = 1;
    public static final String tabla_usuario = "CREATE TABLE USER (ID INT PRIMARY KEY, EDAD INT, PESO DOUBLE, ALTURA DOUBLE, SEXO TEXT, GLUCOSA INT, GET DOUBLE, FRUTA_N TEXT, FRUTA_P TEXT, VERDURA_N TEXT, VERDURA_P TEXT, PROTEINA_N TEXT, PROTEINA_P TEXT, CEREAL_N TEXT, CEREAL_P TEXT, LACTEO_N TEXT, LACTEO_P TEXT)";

    public nutrigreenBD(@Nullable Context context) {
        super(context, nombre_bd, null, version_bd);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(tabla_usuario);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + tabla_usuario);
        sqLiteDatabase.execSQL(tabla_usuario);
    }

    public void agregar_registro (int id, int edad, double peso, double altura,
            String sexo, int glucosa,double get
//            , String fruta_n, String fruta_p
//            ,String verdura_n, String verdura_p,
//            String proteina_n, String proteina_p,
//            String cereal_n, String cereal_p,
//            String lacteo_n, String lacteo_p
            , String fecha
            ){
        SQLiteDatabase bd = getWritableDatabase();
        if (bd != null){
            bd.execSQL("INSERT INTO USUARIO VALUES ('"+id+"','"+edad+"','"+peso+"','"+altura+"','"+sexo+"','"+glucosa+"','"+get+"','"+fecha+"')");
            bd.close();
        }
    }
}
