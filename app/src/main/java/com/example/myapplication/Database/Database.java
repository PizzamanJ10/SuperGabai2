package com.example.myapplication.Database;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {guys.class}, version = 2)
public abstract class Database extends RoomDatabase {
    public abstract UserDao userDao();
}
