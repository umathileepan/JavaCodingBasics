package com.uma.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("Prepare for a job");
        list.add("Planning your time");
        list.add("Study each and every details with interest");
        list.add("Do practice");
        list.add("Repeat the hard work till get your passion job");
        list.add("Continue your hard work to pay for your salary");
        System.out.println(list);
        list.add(0,"Hello");
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list);
        list.set(0,"Hi");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.indexOf("Do practice"));
        System.out.println(list.subList(1,4));


    }
}
