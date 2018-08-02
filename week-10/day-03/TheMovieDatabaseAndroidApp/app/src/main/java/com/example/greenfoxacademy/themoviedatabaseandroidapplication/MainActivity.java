package com.example.greenfoxacademy.themoviedatabaseandroidapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  Button searchByIdButton;
  Button discoverButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    searchByIdButton = (Button) findViewById(R.id.searchByIdButton);
    searchByIdButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent searchIntent = new Intent(MainActivity.this, SearchByIdActivity.class);
        startActivity(searchIntent);
      }
    });

    discoverButton = (Button) findViewById(R.id.discoverButton);
    discoverButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent discoverintent = new Intent(MainActivity.this, DiscoverNewMoviesActivity.class);
        startActivity(discoverintent);
      }
    });
  }
}
