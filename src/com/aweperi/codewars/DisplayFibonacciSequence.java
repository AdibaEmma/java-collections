package com.aweperi.codewars;

public class DisplayFibonacciSequence {
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
}
