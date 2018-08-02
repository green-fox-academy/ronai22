package com.example.greenfoxacademy.themoviedatabaseandroidapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.model.Movie;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.service.MovieDatabaseClient;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchByIdActivity extends AppCompatActivity {

  EditText searchInput;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_serach_by_id);
  }

  public void btnSearch(View view) {

    searchInput = findViewById(R.id.editText);

    Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/")
            .addConverterFactory(GsonConverterFactory.create());

    Retrofit retrofit = builder.build();

    MovieDatabaseClient client = retrofit.create(MovieDatabaseClient.class);
    Call<Movie> call = client.getMovieById(searchInput.getText().toString());

    call.enqueue(new Callback<Movie>() {
      @Override
      public void onResponse(Call<Movie> call, Response<Movie> response) {
        Movie repos = response.body();
        ImageView image = (ImageView) findViewById(R.id.iv);
        Picasso.get().load("https://image.tmdb.org/t/p/w1280/" + repos.getPoster_path()).into(image);
      }

      @Override
      public void onFailure(Call<Movie> call, Throwable t) {
        Toast.makeText(SearchByIdActivity.this, "error :(", Toast.LENGTH_SHORT).show();
      }
    });

  }
}
