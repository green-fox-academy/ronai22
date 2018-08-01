package com.example.greenfoxacademy.themoviedatabaseandroidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.adapter.MovieAdapter;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.model.Movie;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.service.MovieDatabaseClient;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

  private ListView listView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    listView = (ListView) findViewById(R.id.pagination_list);

    Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/movie/")
            .addConverterFactory(GsonConverterFactory.create());

    Retrofit retrofit = builder.build();

    MovieDatabaseClient client = retrofit.create(MovieDatabaseClient.class);
    Call<Movie> call = client.titlesForMovies("tt0167261");

    call.enqueue(new Callback<Movie>() {
      @Override
      public void onResponse(Call<Movie> call, Response<Movie> response) {
        Movie repos = response.body();

        listView.setAdapter(new MovieAdapter(MainActivity.this, repos));
      }

      @Override
      public void onFailure(Call<Movie> call, Throwable t) {
        Toast.makeText(MainActivity.this, "error :(", Toast.LENGTH_SHORT).show();
      }
    });

  }
}
