package com.uma.Collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Grapes");
        collection.add("Strawberry");
        collection.add("Blueberry");
        for(var item : collection)
        System.out.println(item);
        System.out.println(collection.size());
        collection.remove("Orange");
        System.out.println(collection );
        collection.clear();
        System.out.println(collection.isEmpty());
        var containsApple = collection.contains("Apple");
        System.out.println(containsApple);
        Collections.addAll(collection, "Orange","Mango","Watermelon");
        //Convert collection to regular array.
        Object[] objectArray = collection.toArray();
        String[] stringArray = collection.toArray(new String[0]);

    }
}
