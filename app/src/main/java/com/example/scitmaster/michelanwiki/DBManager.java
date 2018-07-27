package com.example.scitmaster.michelanwiki;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SCITMASTER on 2018-07-16.
 */

public class DBManager extends SQLiteOpenHelper {

    public DBManager(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE Table Member_List(idText TEXT, nickName TEXT Primary key, pwText Text); ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldOne, int newOne) {

    }

    public void insert(String query){
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL(query);
        db.close();
    }
}
