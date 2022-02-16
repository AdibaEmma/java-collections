package com.aweperi.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindIntegerCount {
    static int find(int[] integers){
        ArrayList<Integer> listIntegers = Arrays.stream(integers).boxed().collect(Collectors.toCollection(ArrayList::new));
        listIntegers.stream().min(Integer::compare).get();
        var outlier = 0;
        for ( int i: integers) {
            if (i % 2 == 0) {
                outlier = i;
            } else {
                outlier = i;
            }
        }
        return outlier;
    }
}
