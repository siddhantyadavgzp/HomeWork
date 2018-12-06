package com.apress.gerber.homework;

import android.media.Image;
import android.widget.ImageView;

public class Movie {

    private int mImageResource;
    private String title, genre, year;

    public Movie() {
    }

    public Movie(int mi,String title, String genre, String year) {
        this.mImageResource=mi;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




}
