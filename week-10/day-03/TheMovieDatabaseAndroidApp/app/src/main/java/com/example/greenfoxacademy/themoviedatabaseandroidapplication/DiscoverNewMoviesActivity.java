package com.example.greenfoxacademy.themoviedatabaseandroidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.*;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.adapter.RecyclerViewAdapter;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.model.Result;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.service.MovieDatabaseClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DiscoverNewMoviesActivity extends AppCompatActivity {

  Button btnDiscover;
  private EditText yearInput;

  private RadioGroup rbAdult;
  private RadioButton adultYes, adultNo;
  private Boolean adultSelection;

  private RadioGroup rbOrder;
  private RadioButton popularity, release, revenue;
  private String orderSelection;
  private static final String TAG = "MainActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_discover_new_movies);

    rbAdult = (RadioGroup) findViewById(R.id.rbAdult);
    adultYes = (RadioButton) findViewById(R.id.rbAdultYes);
    adultNo = (RadioButton) findViewById(R.id.rbAdultNo);

    rbOrder = (RadioGroup) findViewById(R.id.rbOrder);
    popularity = (RadioButton) findViewById(R.id.rbOrderPopularity);
    release = (RadioButton) findViewById(R.id.rbOrderRelease);
    revenue = (RadioButton) findViewById(R.id.rbOrderRevenue);

    btnDiscover = (Button) findViewById(R.id.btnDiscover);
    btnDiscover.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        yearInput = findViewById(R.id.yearInput);
        int adultSelectedId = rbAdult.getCheckedRadioButtonId();

        if (adultSelectedId == adultYes.getId()) {
          adultSelection = true;
        } else {
          adultSelection = false;
        }

        int orderSelectedId = rbOrder.getCheckedRadioButtonId();

        if (orderSelectedId == popularity.getId()) {
          orderSelection = "popularity.desc";
        } else if (orderSelectedId == release.getId()) {
          orderSelection = "release_date.desc";
        } else if (orderSelectedId == revenue.getId()) {
          orderSelection = "revenue.desc";
        } else {
          orderSelection = "popularity.desc";
        }

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        MovieDatabaseClient client = retrofit.create(MovieDatabaseClient.class);
        Call<Result> call = client.discoverMovie("en-US",
                orderSelection,
                adultSelection,
                false,
                1,
                Integer.parseInt(yearInput.getText().toString()));

        call.enqueue(new Callback<Result>() {
          @Override
          public void onResponse(Call<Result> call, Response<Result> response) {
            Result movies = response.body();
            Log.d(TAG, "initRecyclerView: init recyclerview.");
            RecyclerView recyclerView = findViewById(R.id.pagination_list);
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(DiscoverNewMoviesActivity.this, movies.getResults());
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(DiscoverNewMoviesActivity.this));
          }

          @Override
          public void onFailure(Call<Result> call, Throwable t) {
            Toast.makeText(DiscoverNewMoviesActivity.this, "error :(", Toast.LENGTH_SHORT).show();
          }
        });
      }
    });
  }
}
