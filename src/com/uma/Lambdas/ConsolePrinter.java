package com.uma.Lambdas;

//This class just created to implement the Printer interface but Lambda expression is the shortest way
public class ConsolePrinter implements Printer{

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
