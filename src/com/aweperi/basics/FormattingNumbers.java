package com.aweperi.basics;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(780000000);
        System.out.println(result);

        int x = 1;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);
        byte b = 0;
    }
}
