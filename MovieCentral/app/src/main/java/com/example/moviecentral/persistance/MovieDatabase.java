package com.example.moviecentral.persistance;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class MovieDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "MovieDatabase";

    private static MovieDatabase instance;

    public static MovieDatabase getInstance(final Context context) {
        if (instance == null) {
            return Room.databaseBuilder
                    (context.getApplicationContext()
                            , MovieDatabase.class, DATABASE_NAME).build();
        }
        return instance;
    }

    public abstract MovieDao getMovieDao();

}
