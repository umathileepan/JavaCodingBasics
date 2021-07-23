package com.uma.Generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second) < 0) ? second : first;
    }

    /* Multiple type parameter of Generic method*/
    public static <K,V> void print(K key, V value){
        System.out.println(key + " = " + value);
    }

    public static void printUser(User user){
        System.out.println(user);
    }
}
