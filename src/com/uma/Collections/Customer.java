package com.uma.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(String name, String email){
        this.name=name;
        this.email = email;
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
        customer.add(new Customer("Uma", "a@com.net"));
        customer.add(new Customer("Mary", "m@com.net"));
        customer.add(new Customer("Gorge", "g@com.net"));
        Collections.sort(customer);
        System.out.println(customer);
        Collections.sort(customer, new EmailComparator());
        System.out.println(customer);
    }
}
