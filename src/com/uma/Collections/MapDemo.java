package com.uma.Collections;

import java.util.HashMap;
import java.util.Map;


public class MapDemo {
    public static void show() {
        var c1 = new Customer("Uma", "u@net.com");
        var c2 = new Customer("Tom", "t@net.com");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        var customer = map.get("u@net.com");
        System.out.println(customer);
        var unknown = new Customer("unknown", "");
        var customer1 = map.getOrDefault("e10",unknown);
        System.out.println(customer1);
        var exists = map.containsKey("e10");
        System.out.println(exists);
        map.replace("Uma", new Customer("Carol","u@net.com"));
        System.out.println(map);
        for(var key : map.keySet())
            System.out.println(key);
        for(var entry : map.entrySet())
            System.out.println(entry);
        for(var customer2 : map.values())
            System.out.println(customer2);
    }
}
