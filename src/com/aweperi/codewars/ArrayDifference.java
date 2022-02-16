package com.aweperi.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayDifference {
    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> list_of_a = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> list_of_b = Arrays.stream(b).boxed().collect(Collectors.toCollection(ArrayList::new));

        return list_of_a.stream().filter(v -> !list_of_b.contains(v)).mapToInt(Integer::intValue).toArray();

    }
}
