package com.aweperi.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("Kate", Genre.ACTION, 1000, 4),
                new Movie("Panda", Genre.COMEDY, 1500, 5),
                new Movie("Lucy", Genre.ACTION, 4000, 3),
                new Movie("Iron Man", Genre.ACTION, 1500, 4),
                new Movie("Harry Potter", Genre.THRILL, 1500, 5)
        );

        Predicate<Movie> isSuperAwesome = m -> m.getRating() > 4;

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
//        movies.stream()
//                .skip(1)
//                .takeWhile(isSuperAwesome)
//                .forEach(m -> System.out.println(m.getTitle()));

//        //Sorting
//        movies.stream()
//                .sorted(Comparator.comparing(Movie::getRating).reversed())
//                .forEach(System.out::println);

        // Selecting Distinct
//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach(System.out::println);
//
//        //reducers
//        var totalLikes = movies.stream()
//                .map(Movie::getLikes)
//                .reduce(0,Integer::sum);
//
//        System.out.println(totalLikes);
//
//        // collectors
//        var result = movies.stream()
//                .map(Movie::getTitle)
//                .collect(Collectors.joining(","));
//        System.out.println(result);
//
//        //grouping
//        var genreMap = movies.stream()
//                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
//        System.out.println(genreMap);
        var string = "1234567890";
        var lists = string.chars()
                .mapToObj(c -> (char) c)
                .map(c -> Integer.parseInt(String.valueOf(c)))
                .collect(Collectors.partitioningBy(c -> c > 3));
        System.out.println(lists);

        //partitioning
//        var partitionedMovies = movies.stream()
//                .collect(Collectors.partitioningBy(isSuperAwesome,
//                        Collectors.mapping(Movie::getTitle,Collectors.joining(", "))));
//        System.out.println(partitionedMovies);


    }
}
