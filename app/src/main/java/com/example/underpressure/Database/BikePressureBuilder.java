package com.example.underpressure.Database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.underpressure.DAO.BikesDAO;
import com.example.underpressure.DAO.UsersDAO;
import com.example.underpressure.Entity.Bikes;
import com.example.underpressure.Entity.Users;

// Database with terms, courses, and assessments tables
@Database(entities = {Bikes.class, Users.class}, version = 1, exportSchema = false)
public abstract class BikePressureBuilder extends RoomDatabase {
    public abstract BikesDAO bikesDAO();
    public abstract UsersDAO usersDAO();

    // Making instance in the DB
    private static volatile BikePressureBuilder INSTANCE;

    // Basic part of Android. Tell you where you in the flow of the program
    static BikePressureBuilder getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (BikePressureBuilder.class) {
             if (INSTANCE == null) {
                 INSTANCE = Room.databaseBuilder(context.getApplicationContext(), BikePressureBuilder.class, "myBikeDatabase.db")
                         .fallbackToDestructiveMigration()
                         .build();
                }
            }
        }
        return INSTANCE;
    }
}


