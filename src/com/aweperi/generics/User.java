package com.aweperi.generics;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(@NotNull User other) {
        return points - other.points;
    }

    @Override
    public String toString() {
        return "User{" +
                "points=" + points +
                '}';
    }
}
