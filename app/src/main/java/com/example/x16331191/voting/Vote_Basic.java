package com.example.x16331191.voting;

public class Vote_Basic{

    private int Thumbnail ;
    private String Title;
    private int score;


    public Vote_Basic() {
    }

    public Vote_Basic(int thumbnail, String title, int score) {
        Thumbnail = thumbnail;
        Title = title;
        this.score = score;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public int getScore() {
        return score;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
