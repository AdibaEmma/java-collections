package com.aweperi.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("Kate", 1000),
                new Movie("Lucy", 4000),
                new Movie("Panda", 1500)
        );

        // Map
        movies.stream()
                .map(Movie::getLikes)
                .forEach(like -> System.out.println(like));

        //Flatmap
        Stream.of(List.of(1,2,3),List.of(4,5,6))
                .flatMap(list -> list.stream())
                .forEach(n -> System.out.println(n));

        //Filter
        Predicate<Movie> isPopular = movie -> movie.getLikes() > 1000;
        movies.stream()
                .filter(isPopular)
                .forEach(m -> System.out.println(m));


    }
}
