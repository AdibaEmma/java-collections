package com.aweperi.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        var calculator = new TaxCalculatorImpl(10_000);
//        var report = new TaxReport();
//        report.show(calculator);
//
////        report.setCalculator(new TaxCalculatorImpl2());
//        report.show(new TaxCalculatorImpl2());

        getGreatestNumber(2,5,8);
        System.out.println(calculateFactorial(5));

        confirmPrimeNumber(2);

        displayFibonacciSequence();

        var list = new ArrayList<int[]>();

        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});

        System.out.println(countPassengers(list));

        System.out.println(sortDesc(143435));
    }

    public static void getGreatestNumber(int a, int b, int c) {
        if ( a > b ) {
            if ( a > c ) {
                System.out.println("the first number is the greatest");
            }
            else {
                System.out.println("the third number is the greatest");
            }
        }
        else {
            if ( b > c ) {
                System.out.println("the second number is the greatest");
            }
            else {
                System.out.println("the third number is the greatest");
            }
        }
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

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

    public static void displayFibonacciSequence() {
        int first_term = 0;
        int second_term = 1;
        int temp;

        while ( second_term < 1000) {
            temp = second_term;
            second_term = first_term + second_term;

            first_term = temp;
            System.out.println(second_term);
        }
    }

    public static int countPassengers(ArrayList<int[]> stops) {

        var passengersLeft = 0;
        for (int[] stop : stops) {
            var first_term = stop[0];

            var second_term = stop[1];

            passengersLeft += first_term + second_term;
        }
        return passengersLeft;
    }

//    public static String whoLikesIt(String... names) {
//        var size = names.length;
//        switch (true) {
//            case size == 1 -> {
//                return names[0] + " likes this";
//            }
//            case  size > 2  -> {
//                return names[0] + " and " + names[1] + " likes this";
//            }
//            case size > 4 -> {
//
//            }
//        }
//        return "";
//    }

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
        return Integer.parseInt(String.valueOf(sortedValues));
    }
}
