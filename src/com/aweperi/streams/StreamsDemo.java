package com.aweperi.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("Kate", 1000, 4),
                new Movie("Panda", 1500, 5),
                new Movie("Lucy", 4000, 3),
                new Movie("Iron Man", 1500, 4),
                new Movie("Harry Potter", 1500, 5)
        );

//        // Map
//        movies.stream()
//                .map(Movie::getLikes)
//                .forEach(like -> System.out.println(like));
//
//        //Flatmap
//        Stream.of(List.of(1,2,3),List.of(4,5,6))
//                .flatMap(list -> list.stream())
//                .forEach(n -> System.out.println(n));
//
//        //Filter
//        Predicate<Movie> isPopular = movie -> movie.getLikes() > 1000;
//        movies.stream()
//                .filter(isPopular)
//                .forEach(m -> System.out.println(m));

        // Slicing
//        Predicate<Movie> isSuperAwesome = m -> m.getRating() > 4;
//        movies.stream()
//                .skip(1)
//                .takeWhile(isSuperAwesome)
//                .forEach(m -> System.out.println(m.getTitle()));

        //Sorting
        movies.stream()
                .sorted(Comparator.comparing(Movie::getRating).reversed())
                .forEach(System.out::println);

        //reducers
        var totalLikes = movies.stream()
                .map(Movie::getLikes)
                .reduce(0,Integer::sum);

        System.out.println(totalLikes);

    }
}
