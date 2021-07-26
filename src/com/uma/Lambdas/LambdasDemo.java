package com.uma.Lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo{
    public static void show(){
        greet(new ConsolePrinter());

        //Consumer interface examples
        List<Integer> list = List.of(1,2,3);

        //Imperative Programming
        for(var item : list)
            System.out.println(item);

        //Declarative Programming
        list.forEach(item -> System.out.println(item));

        //Consumer Chaining print lower and upper case string
        List<String> listStr = List.of("Consumer","Chaining","Interesting");
        Consumer<String> print = (item) -> System.out.println(item);
        Consumer<String> printUppercase = (item) -> System.out.println(item.toUpperCase());

        listStr.forEach(print.andThen(printUppercase));

        //Supplier interface print random number
        Supplier<Double> getRandom = () -> Math.random();
        var randomNumber = getRandom.get();
        System.out.println(randomNumber);

        //Using Function interface
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Function");
        System.out.println(length);
    }

    //Can create an anonymous inner class to execute interface without separate class
    //but Lambda expression is the shortest way
    public static void anonymousInnerClassShow(){
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    //Lambda expression instead of a class or anonymous class
    public static void lambdaShow(){
        greet((message -> System.out.println(message)));
    }

    public static void greet(Printer printer){

        printer.print("Good Morning!");

    }
}
