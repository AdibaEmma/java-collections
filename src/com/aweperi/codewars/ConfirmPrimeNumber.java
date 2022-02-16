package com.aweperi.codewars;

import java.util.ArrayList;
import java.util.List;

public class ConfirmPrimeNumber {
    public static void confirmPrimeNumber(int n) {
        int flag = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n / i == 0) {
                flag = 0;
                break;
            }
        }
        if ( flag == 0) {
            System.out.println(n + " is not a prime number");
        }
        else {
            System.out.println(n + " is a prime number");
        }
    }

    public static List<String> number(List<String> lines) {
        List<String> newList = new ArrayList<String>();
        for (int i = 0; i < lines.size(); i++) {
            var line = String.format("%s: %s", i + 1, lines.get(i));
            newList.add(line);
        }
        return newList;

    }
}
