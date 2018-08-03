package com.example.greenfoxacademy.themoviedatabaseandroidapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.R;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.model.Movie;

import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {

  private Context context;
  private List<Movie> values;

  public MovieAdapter(Context context, List<Movie> values) {
    super(context, R.layout.activity_discover_new_movies, values);

    this.context = context;
    this.values = values;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View row = convertView;

    if (row == null) {
      LayoutInflater inflater =
              (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      row = inflater.inflate(R.layout.activity_discover_new_movies, parent, false);
    }

    TextView textView = (TextView) row.findViewById(R.id.list_item_pagination_text);

    Movie item = values.get(position);
    String message = item.getOriginal_title();
    textView.setText(message);

    return row;
  }

}
