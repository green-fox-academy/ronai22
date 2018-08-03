package com.example.greenfoxacademy.themoviedatabaseandroidapplication.service;

import com.example.greenfoxacademy.themoviedatabaseandroidapplication.model.Movie;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.model.Result;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface MovieDatabaseClient {

  @GET("/3/movie/{movieId}?api_key=d006b36d9c0c6bbe86c9d5e1ea0dc0f2&language=en-US")
  Call<Movie> getMovieById(@Path("movieId") String movieId);

  @GET("/3/discover/movie?api_key=d006b36d9c0c6bbe86c9d5e1ea0dc0f2")
  Call<Result> discoverMovie(
          @Query("language") String lan,
          @Query("sort_by") String sort,
          @Query("include_adult") Boolean adult,
          @Query("include_video") Boolean video,
          @Query("page") Integer pageNum,
          @Query("year") Integer year);
}