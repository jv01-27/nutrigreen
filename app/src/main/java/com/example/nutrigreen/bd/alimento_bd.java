package com.example.nutrigreen.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class alimento_bd extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "alimentos.db";
    private static final int DATABASE_VERSION = 1;

    public alimento_bd(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_FOOD_TABLE = "CREATE TABLE " + alimento_bd.FoodEntry.TABLE_NAME + " ("
                + alimento_bd.FoodEntry.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + alimento_bd.FoodEntry.COLUMN_NOMBRE + " TEXT NOT NULL, "
                + alimento_bd.FoodEntry.COLUMN_CATEGORIA + " TEXT NOT NULL, "
                + alimento_bd.FoodEntry.COLUMN_PORCION + " TEXT NOT NULL, "
                + alimento_bd.FoodEntry.COLUMN_ENERGIA + " TEXT NOT NULL, "
                + alimento_bd.FoodEntry.COLUMN_HIDRATOS + " TEXT NOT NULL, "
                + alimento_bd.FoodEntry.COLUMN_GRASA + " TEXT NOT NULL, "
                + alimento_bd.FoodEntry.COLUMN_PROTEINAS + " TEXT NOT NULL, "
                + alimento_bd.FoodEntry.COLUMN_INDICE_GLUC + " TEXT, "
                + alimento_bd.FoodEntry.COLUMN_I_G + " INTEGER);";

        db.execSQL(SQL_CREATE_FOOD_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Implementa la lógica de actualización si es necesario
    }
}

