package com.example.moviecentral.persistance;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.moviecentral.models.Genre;

@Database(entities = {Genre.class}, version = 1)
@TypeConverters({Converters.class})
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
