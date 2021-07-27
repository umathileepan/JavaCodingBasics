package com.uma.Streams;

import java.util.List;

public class StreamDemo {
    public static void show(){
        List<Movie> movies = List.of(new Movie("a", 10),
                                     new Movie("b",20),
                                     new Movie("c",30));
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
    }
}
