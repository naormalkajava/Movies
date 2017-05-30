package com.example.ericbell.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eric.bell on 5/30/2017.
 */

public class MoviesDataSource {


    public static List<Movie> getMovies () {
        List<Movie> movies = new ArrayList<>();

        movies.add( new Movie (R.drawable.a1,"a1"));
        movies.add( new Movie (R.drawable.a2,"a2"));
        movies.add( new Movie (R.drawable.a3,"a3"));
        movies.add( new Movie (R.drawable.a4,"a4"));
        movies.add( new Movie (R.drawable.a5,"a5"));
        movies.add( new Movie (R.drawable.a6,"a6"));
        movies.add( new Movie (R.drawable.a6,"a7"));
        movies.add( new Movie (R.drawable.a7,"a8"));
        movies.add( new Movie (R.drawable.a8,"a9"));
        movies.add( new Movie (R.drawable.a9,"a10"));
        movies.add( new Movie (R.drawable.a10,"a11"));
        movies.add( new Movie (R.drawable.a11,"a12"));
        movies.add( new Movie (R.drawable.a12,"a13"));
        movies.add( new Movie (R.drawable.a13,"a14"));
        movies.add( new Movie (R.drawable.a14,"a15"));
        movies.add( new Movie (R.drawable.a15,"a16"));



        return movies;
    }
}
