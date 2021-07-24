package com.uma.Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Print1");
        queue.add("Print2");
        queue.add("Print3");
        var front = queue.peek();
        System.out.println("Front queue: " + front);
        queue.remove();
        System.out.println(queue);
    }
}
