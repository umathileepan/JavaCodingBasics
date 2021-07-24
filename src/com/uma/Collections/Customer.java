package com.uma.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer implements Comparable<Customer> {
    private String name;

    public Customer(String name){
        this.name=name;
    }

    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString(){
        return "Customer: " + name;
    }

    public static void showCustomer(){
        List<Customer> customer = new ArrayList<>();
        customer.add(new Customer("Uma"));
        customer.add(new Customer("Mary"));
        customer.add(new Customer("Gorge"));
        Collections.sort(customer);
        System.out.println(customer);
    }
}
