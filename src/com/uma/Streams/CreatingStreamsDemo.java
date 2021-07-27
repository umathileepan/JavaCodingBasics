package com.uma.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show(){
        int[] numbers = {3,7,9,11};
        Arrays.stream(numbers).forEach(n -> System.out.println(n));

        var stream = Stream.generate(() -> Math.random());
        stream.limit(3).forEach(n -> System.out.println(n));

        Stream.iterate(1, n -> n + 1).limit(10).forEach(n -> System.out.println(n));

        //Flat map
        var streamList = Stream.of(List.of(1,2,3,4),List.of(3,4,5,6));
        streamList.flatMap(list -> list.stream()).forEach(n -> System.out.println(n));

    }
}
