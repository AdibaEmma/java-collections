package com.aweperi.codewars;

public class GetGreatestNumber {
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
}
