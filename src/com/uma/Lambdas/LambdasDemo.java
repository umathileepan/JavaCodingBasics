package com.uma.Lambdas;

import java.util.List;
import java.util.function.*;

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

        //Composing Function
        Function<String,String> replaceColon = str -> str.replace(":","=");
        Function<String,String> addBraces = str -> "{" + str + "}";
        var result = replaceColon.andThen(addBraces).apply("key:value");
        System.out.println(result);

        result = addBraces.compose(replaceColon).apply("id:name");
        System.out.println(result);

        //Predicate interface
        Predicate<String> checkMore5 = str -> str.length() > 5;
        System.out.println(checkMore5.test("Sky"));

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");
        System.out.println(hasLeftBrace.and(hasRightBrace).test("{Key:Value}"));

        //Binary Operator
        BinaryOperator<Integer> add = (a , b) -> a + b;
        var addResult = add.apply(45, 78);
        System.out.println(addResult);

        Function<Integer,Integer> square = a -> a*a;
        var squareResult = square.apply(4);
        System.out.println(squareResult);

        UnaryOperator<Integer> squary = s -> s * s;
        UnaryOperator<Integer> increment = n -> n + 1;
        var unaryOps = increment.andThen(squary).apply(6);
        System.out.println(unaryOps);
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
