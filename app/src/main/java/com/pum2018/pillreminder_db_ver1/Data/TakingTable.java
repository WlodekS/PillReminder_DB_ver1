package com.pum2018.pillreminder_db_ver1.Data;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import android.util.Log;

import java.sql.Time;

/**
 * Created by Wlodek on 2018-03-08.
 */

public class TakingTable {
    /*
    * https://developer.android.com/training/data-storage/sqlite.html#DefineContract
    * */
    // Inner class that defines the table contents
    public static class Tbl implements BaseColumns {
        public static final String TABLE_NAME = "store";
        public static final String COLUMN_MEDICINE_ID = "medicine_id";
        public static final String COLUMN_QUANTITY = "quantity";
        public static final String COLUMN_DOSE = "dose";
        public static final String COLUMN_TIME = "time";

    }

    // Creating table string
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE if not exists " + Tbl.TABLE_NAME + " (" +
                    Tbl._ID + " INTEGER PRIMARY KEY," +
                    Tbl.COLUMN_MEDICINE_ID + " INTEGER," +
                    Tbl.COLUMN_QUANTITY + " INTEGER," +
                    Tbl.COLUMN_DOSE + " INTEGER," +
                    Tbl.COLUMN_TIME + " TIME)";


    // Drop table string
    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Tbl.TABLE_NAME;


    public static void onCreate(SQLiteDatabase db){
        db.execSQL(SQL_CREATE_ENTRIES);
        Log.d("DB", "Tabela taking utworzona.");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
