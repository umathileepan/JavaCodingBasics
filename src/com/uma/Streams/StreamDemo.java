package com.uma.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void show(){
        List<Movie> movies = List.of(new Movie("The Crown", 10, Genre.THRILLER),
                                     new Movie("BoldType",20, Genre.ACTION),
                                     new Movie("Suits",30, Genre.THRILLER));
        //Imperative programming
        int count = 0;
        for(var movie : movies)
            if(movie.getLikes() > 10)
                count++;
        System.out.println(count);

        //Declarative (Functional) programming
        var count2 = movies.stream().filter(movie -> movie.getLikes() > 10).count();
        System.out.println(count2);

        movies.stream().map(movie -> movie.getTitle()).forEach(name -> System.out.println(name));

        //Slicing stream - limit
        movies.stream().limit(2).forEach(m -> System.out.println(m.getTitle()));

        //Slicing stream - skip
        movies.stream().skip(2).forEach(m -> System.out.println(m.getTitle()));

        //Slicing stream - takeWhile
        movies.stream().takeWhile(m -> m.getLikes() < 30).forEach(m -> System.out.println(m.getTitle()));

        //Slicing stream - dropWhile
        movies.stream().dropWhile(m -> m.getLikes() < 30).forEach(m -> System.out.println(m.getTitle()));

        //Sorting streams
        movies.stream().sorted(Comparator.comparing(Movie::getTitle).reversed()).forEach(m -> System.out.println(m.getTitle()));

        //Getting unique element
        movies.stream().map(Movie::getLikes).distinct().forEach(System.out::println);

        //Peeking elements
        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println("filtered " + m.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("map " + t))
                .forEach(m -> System.out.println(m));

        //Reducers - anyMatch() : to check whether the condition has any match
        var answer = movies.stream().anyMatch(m -> m.getLikes()>20);
        System.out.println("Has any movie has more than 20 likes: " + answer);

        //Reducers - allMatch() : to check whether the condition has satisfied with all match
        var answerAllMatch = movies.stream().allMatch(m -> m.getLikes()>20);
        System.out.println("Has all movies have more than 20 likes: " + answerAllMatch);

        //Reducers - findFirst() : Find the movie and print it's title
        var result = movies.stream().findFirst().get();
        System.out.println(result.getTitle());

        //Reducers - max() Find the movie with the maximum number of likes
        var resultMaxLikes = movies.stream().max(Comparator.comparing(Movie::getLikes)).get();
        System.out.println("Movie with the maximum number of likes: " + resultMaxLikes.getTitle());

        //reduce() to get sum of likes of all movies
        Optional<Integer> sum = movies.stream().map(m -> m.getLikes()).reduce((a , b) -> a + b);
        System.out.println("Total likes: " + sum.orElse(0));

        //Collectors - collect() will give the summarising results
        var resultSummary = movies.stream().
                filter(m -> m.getLikes() > 10).
                collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println("Summarize Movie: " + resultSummary);

        //Group our data
        var resultByGroup = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre,Collectors.counting()));
        System.out.println("Grouping by: " + resultByGroup);
    }
}
