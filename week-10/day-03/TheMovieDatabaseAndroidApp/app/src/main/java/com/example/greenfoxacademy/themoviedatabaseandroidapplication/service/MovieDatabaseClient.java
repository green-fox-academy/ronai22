package com.example.greenfoxacademy.themoviedatabaseandroidapplication.service;

import com.example.greenfoxacademy.themoviedatabaseandroidapplication.model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MovieDatabaseClient {

  @GET("/3/movie/{movieId}?api_key=d006b36d9c0c6bbe86c9d5e1ea0dc0f2&language=en-US")
  Call<Movie> getMovieById(@Path("movieId") String movieId);

}