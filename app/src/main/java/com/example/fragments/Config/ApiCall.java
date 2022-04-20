package com.example.fragments.Config;

import com.example.fragments.Model.Film.AccountStates;
import com.example.fragments.Model.Film.FavFilmRequest;
import com.example.fragments.Model.Film.FavFilmResponse;
import com.example.fragments.Model.Film.searchFilmModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiCall {

    @GET("search/movie?")
    Call<searchFilmModel> getData(@Query("api_key") String api_key, @Query("query") String query);

    @GET("account/empi4/favorite/movies?")
    Call<searchFilmModel> getFavs(@Query("api_key") String api_key, @Query("session_id") String session_id);

    @GET("movie/{movie_id}/account_states?")
    Call<AccountStates> getFavStatus(@Path("movie_id") int movie_id,
                                    @Query("api_key") String api_key,
                                     @Query("session_id") String session_id);

    @POST("account/empi4/favorite?")
    @Headers({"Content-Type: application/json;charset=utf-8"})
    Call<FavFilmResponse> setFav(@Query("api_key") String api_key,
                                        @Query("session_id") String session_id,
                                        @Body FavFilmRequest request);
}
