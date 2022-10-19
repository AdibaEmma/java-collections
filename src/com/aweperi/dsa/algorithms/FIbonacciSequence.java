package com.aweperi.dsa.algorithms;

public class FIbonacciSequence {
    static int n1 = 0, n2 = 1, n3 = 0;


    public static int[] printFibonacci(int count) {
        int[]  sequence = new int[count];
        sequence[0] = n1;
        sequence[1] = n2;
        int pos = 2;
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            sequence[pos] = n3;
            pos++;
            printFibonacci(count -1);
        }

        return sequence;
    }
}
