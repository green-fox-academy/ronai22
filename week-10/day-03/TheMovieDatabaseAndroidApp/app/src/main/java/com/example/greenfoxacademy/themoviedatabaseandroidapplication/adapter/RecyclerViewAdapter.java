package com.example.greenfoxacademy.themoviedatabaseandroidapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.GalleryActivity;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.R;
import java.util.List;
import com.example.greenfoxacademy.themoviedatabaseandroidapplication.model.Movie;
import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

  public static final String TAG = "RecyclerViewAdapter";

  private List<Movie> movieList;
  private Context mContext;

  public RecyclerViewAdapter(Context context, List<Movie> moviesList) {
    movieList = moviesList;
    mContext = context;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_pagination, parent, false);
    ViewHolder holder = new ViewHolder(view);
    return holder;
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, final int position) {
    Log.d(TAG, "onBindViewHolder: called.");

    Glide.with(mContext)
            .asBitmap()
            .load("https://image.tmdb.org/t/p/w1280/"+ movieList.get(position).getPoster_path())
            .into(holder.image);

    holder.imageName.setText(movieList.get(position).getTitle());

    holder.parentLayout.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Log.d(TAG, "onClick: clicked on: " + movieList.get(position).getTitle());

        Toast.makeText(mContext, movieList.get(position).getTitle(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(mContext, GalleryActivity.class);
        intent.putExtra("image_url", "https://image.tmdb.org/t/p/w1280/"+ movieList.get(position).getPoster_path());
        intent.putExtra("image_name", movieList.get(position).getTitle());
        mContext.startActivity(intent);
      }
    });
  }

  @Override
  public int getItemCount() {
    return movieList.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder{

    CircleImageView image;
    TextView imageName;
    RelativeLayout parentLayout;

    public ViewHolder(View itemView) {
      super(itemView);
      image = itemView.findViewById(R.id.image);
      imageName = itemView.findViewById(R.id.image_name);
      parentLayout = itemView.findViewById(R.id.parent_layout);
    }
  }
}