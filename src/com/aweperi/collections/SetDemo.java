package com.aweperi.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void show() {
        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b","c","d"));

//        // Union
//        set1.addAll(set2);
//        System.out.println(set1);
//
        // Intersection
        set1.retainAll(set2);
        System.out.println(set1);

//        // Difference
//        set2.removeAll(set1);
//        System.out.println(set2);
    }
}
