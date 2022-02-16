package com.aweperi.codewars;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        String outlier = "";
        int result = 0;
        for (int a: array) {
            result+=a;
        }
        if(result % 2 == 0) {
            outlier = "even";
        } else {
            outlier = "odd";
        }
        return outlier;
    }
}
