package com.example.nutrigreen.bd;

import android.provider.BaseColumns;

public class alimento_const {
    private alimento_const() {} // Constructor privado para evitar instancias

    public static class FoodEntry implements BaseColumns {
        public static final String TABLE_NAME = "alimentos";
        public static final String COLUMN_ID = "id_alimento";
        public static final String COLUMN_NOMBRE = "nombre";
        public static final String COLUMN_CATEGORIA = "categoria";
        public static final String COLUMN_PORCION = "porcion";
        public static final String COLUMN_ENERGIA = "energia_kcal";
        public static final String COLUMN_HIDRATOS = "hidratos_decarbono_g";
        public static final String COLUMN_GRASA = "grasa_g";
        public static final String COLUMN_PROTEINAS = "proteinas_g";
        public static final String COLUMN_INDICE_GLUC = "indice_glucemico";
        public static final String COLUMN_I_G = "i_g";
    }
}
