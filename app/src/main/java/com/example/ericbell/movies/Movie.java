package com.example.ericbell.movies;

/**
 * Created by eric.bell on 5/30/2017.
 */

public class Movie {

    private final int imagesResource;
    private final String nameMoive;

    public Movie(int imagesResource, String nameMoive) {
        this.imagesResource = imagesResource;
        this.nameMoive = nameMoive;
    }

    //geters
    public int getImagesResource() {
        return imagesResource;
    }

    public String getNameMoive() {
        return nameMoive;
    }
}
