package com.example.moviecentral.requests.responses;

import com.example.moviecentral.models.Genre;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GenreResponse {

    @SerializedName("genres")
    @Expose
    private List<Genre>genres;

}
