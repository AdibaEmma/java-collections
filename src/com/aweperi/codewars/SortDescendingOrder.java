package com.aweperi.codewars;

public class SortDescendingOrder {
    public static int sortDesc(final int num) {
        var values = String.valueOf(num).toCharArray();
        char[] sortedValues = new char[values.length];
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                sortedValues[i] = values[i];
            }
            else{
                sortedValues[i] = values[i + 1];
            }
        }
        return 0;
    }
}
