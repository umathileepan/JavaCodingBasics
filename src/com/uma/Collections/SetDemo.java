package com.uma.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void show(){
        Set<String> set =new HashSet<>();
        set.add("No Duplicate");
        set.add("No Duplicate");
        set.add("In Set");
        set.add("Unique");
        System.out.println(set);

    }
}
