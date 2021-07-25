package com.uma.Lambdas;

public class LambdasDemo {
    public static void show(){
        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer){
        printer.print("Good Morning!");
    }
}
