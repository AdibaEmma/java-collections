package com.aweperi.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        Map<String, Customer> customers = new HashMap<>();
        var c1 = new Customer("Emma", "e1");
        var c2 = new Customer("Sam", "e2");
        var c3 = new Customer("Bright", "e3");

        customers.put(c1.getEmail(),c1);
        customers.put(c2.getEmail(),c2);
        customers.put(c3.getEmail(),c3);
        customers.replace("e1", new Customer("Emmanuel", "e1"));
        for (var customer: customers.values()) {
            System.out.println(customer);
        }
    }
}
