package com.example.moviecentral.requests;

import com.example.moviecentral.utils.Constants;
import com.example.moviecentral.utils.LiveDataCallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static OkHttpClient okHttpClient =
            new OkHttpClient.Builder().
                    // establish connection to server
                            connectTimeout(Constants.CONNECTION_TIMEOUT, TimeUnit.SECONDS).
                    // time between each byte read from the server
                            readTimeout(Constants.READ_TIMEOUT, TimeUnit.SECONDS).
                    // time between each byte send to server
                            writeTimeout(Constants.WRITE_TIMEOUT, TimeUnit.SECONDS).
                    retryOnConnectionFailure(false).build();

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    //.client(okHttpClient)
                    .addCallAdapterFactory(new LiveDataCallAdapterFactory())
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static MovieAPI movieAPI = retrofit.create(MovieAPI.class);

    public static MovieAPI getRecipeApi() {
        return movieAPI;
    }
}
