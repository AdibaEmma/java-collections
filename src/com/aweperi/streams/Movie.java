package com.aweperi.streams;

public class Movie {
    private final String title;
    private final int likes;
    private final int rating;

    public Movie(String title, int likes, int rating) {
        this.title = title;
        this.likes = likes;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                ", rating=" + rating +
                '}';
    }
}
