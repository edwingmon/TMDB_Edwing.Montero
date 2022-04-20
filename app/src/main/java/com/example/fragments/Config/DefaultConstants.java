package com.example.fragments.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DefaultConstants {

    public static final String API_KEY = "3d78c1a69403fb1bea1dbf281596bf93";
    public static final String SESSION_ID = "fad9383a7ac7a26bee4f13d5481daaaef18be9b5";
    public static final String ACCOUNT_ID = "empi4";

    public static final String BASE_IMG_URL = "https://image.tmdb.org/t/p/w500/";

    public static final Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("https://api.themoviedb.org/3/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();

}
