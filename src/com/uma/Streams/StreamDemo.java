package com.uma.Streams;

import java.util.List;

public class StreamDemo {
    public static void show(){
        List<Movie> movies = List.of(new Movie("a", 10),
                                     new Movie("b",15),
                                     new Movie("b",20));
        //Imperative programming
        int count = 0;
        for(var movie : movies)
            if(movie.getLikes() > 10)
                count++;
        System.out.println(count);

        //Declarative (Functional) programming
        var count2 = movies.stream().filter(movie -> movie.getLikes() > 10).count();
        System.out.println(count2);
    }
}
