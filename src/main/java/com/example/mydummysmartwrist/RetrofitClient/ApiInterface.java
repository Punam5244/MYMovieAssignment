package com.example.mydummysmartwrist.RetrofitClient;


import com.example.mydummysmartwrist.Movies;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("?s=batman&apikey=fd133e0e")
    Call<Movies> getMovies();


}
