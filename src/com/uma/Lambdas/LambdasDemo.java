package com.uma.Lambdas;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

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

        //Consumer Chaining
        List<String> listStr = List.of("Consumer","Chaining","Interesting");
        Consumer<String> print = (item) -> System.out.println(item);
        Consumer<String> printUppercase = (item) -> System.out.println(item.toUpperCase());

        listStr.forEach(print.andThen(printUppercase));
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
