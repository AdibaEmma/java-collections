package com.aweperi.codewars;

import java.util.ArrayList;
import java.util.List;

public class JosephusPermutation {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<T>(items.size());
        List<Integer> people = new ArrayList<>(items.size());
        int index = 0;
        for(int i = 0;i < items.size();i++){
            people.add(i);
        }

        while (people.size() > 0) {
            index = (index + k - 1) % people.size();
            result.add(items.get(people.get(index)));
            people.remove(index);
        }
        return result;
    }
}
