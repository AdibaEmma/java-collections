package com.aweperi.streams;

public class Movie {
    private final String title;
    private Genre genre;
    private final int likes;
    private final int rating;

    public Movie(String title, Genre genre, int likes, int rating) {
        this.title = title;
        this.genre = genre;
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

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", likes=" + likes +
                ", rating=" + rating +
                '}';
    }
}
