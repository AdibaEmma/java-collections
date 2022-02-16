package com.aweperi.codewars;

import java.util.List;

public class PredictAge {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        List<Integer> ageList = List.of(age1,age2,age3,age4,age5,age6,age7,age8);
        return (int) (Math.floor(Math.sqrt(ageList.stream().map(a -> a * a).reduce(0, Integer::sum))) / 2);
    }
}
