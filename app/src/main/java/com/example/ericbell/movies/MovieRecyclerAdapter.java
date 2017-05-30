package com.example.ericbell.movies;

import android.content.Context;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by eric.bell on 5/30/2017.
 */

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.MoiveViewHolder> {

    Context context;
    LayoutInflater layoutInflater;
    List<Movie> movies;

    public MovieRecyclerAdapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        movies = MoviesDataSource.getMovies();
    }

    @Override
    public MoiveViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v =layoutInflater.inflate(R.layout.movie_item,parent,false);

        MoiveViewHolder mh = new MoiveViewHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(MoiveViewHolder holder, int position) {
        Movie m = movies.get(position);
        holder.ivMovie.setImageResource(m.getImagesResource());
       holder.tvMovie.setText(m.getNameMoive());


    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MoiveViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView ivMovie;
        TextView tvMovie;

        public MoiveViewHolder(View v) {
            super(v);
            int position = getAdapterPosition();

            ivMovie = (ImageView) v.findViewById(R.id.ivThumbnail);
            tvMovie = (TextView) v.findViewById(R.id.tvmovie);

            v.setOnClickListener(this);




        }

        @Override
        public void onClick(View v) {
            int positin = getAdapterPosition();
            String moviename = movies.get(positin).getNameMoive();
            Toast.makeText(context,moviename,Toast.LENGTH_SHORT).show();
        }
    }



}
