package com.example.moviecentral.network;

import com.example.moviecentral.models.GenreResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieAPI {

    /**
     * https://api.themoviedb.org/3/genre/movie/list?api_key=<<api_key>>&language=en-US
     */
    @GET("3/genre/movie/list")
    Call<GenreResponse> getGenreList(
            @Query("api_key") String apiKey,
            @Query("language") String language);

}
