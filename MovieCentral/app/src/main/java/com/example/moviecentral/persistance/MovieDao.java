package com.example.moviecentral.persistance;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.moviecentral.models.Genre;

import java.util.List;

@Dao
public interface MovieDao {

    @Insert(onConflict = REPLACE)
    long[] insertGenreList(Genre... genres);

    @Query("SELECT * FROM genre")
    LiveData<List<Genre>> getGenreList();

}
