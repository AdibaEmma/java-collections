package com.aweperi.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GetGreatestNumber.getGreatestNumber(2,5,8);
        System.out.println(CalculateFactorial.calculateFactorial(5));

        ConfirmPrimeNumber.confirmPrimeNumber(2);

        DisplayFibonacciSequence.displayFibonacciSequence();

        var list = new ArrayList<int[]>();

        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});

        System.out.println(CountPassengers.countPassengers(list));

        System.out.println(SortDescendingOrder.sortDesc(143435));

        String str = "hey_there";

        System.out.println(CamelCase.toCamelCase(str));

        System.out.println(Arrays.toString(ArrayDifference.arrayDiff(new int[]{1, 3, 2}, new int[]{1})));

        System.out.println(FindIntegerCount.find(new int[] {1312,4313,3434,4545}));

        System.out.println(OddOrEven.oddOrEven(new int[] {1,4,7,8,9}));

        System.out.println(GetVowelCount.getVowelCount("aeiouaeiouaeiouaeiou"));

        System.out.println(Arrays.toString("aadfffff".chars().mapToObj(c -> (char) c).map(c -> Character.toUpperCase(c)).toArray()));
        System.out.println(ConfirmPrimeNumber.number(Arrays.asList("a", "b", "c")));

        StringBuilder sb = new StringBuilder();
        var name = "emmaAdiba";

        var result = name.split("[A-Z]", 5);
        System.out.println(Arrays.toString(result));
        System.out.println(name.replaceAll("([A-Z])", " $1"));
        var n = "12345";
        StringBuilder fake = new StringBuilder();
        for (char a: n.toCharArray()) {
            if (a >= '5') {
                fake.append('1');
            }
            else {
                fake.append('0');
            }
        }
        System.out.println(fake);

        var nd = Integer.toBinaryString(123);
        int counter = 0;
        for (char c: nd.toCharArray()) {
            if(c == '1') counter++;
        }
        System.out.println(nd);
        System.out.println(counter);

        String words = "I am a boy";
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        var wordsArray = words.split(" ");
        System.out.println(Arrays.toString(wordsArray));
        for (String word: wordsArray) {
            lengths.add(word.length());
        }

        System.out.println(JosephusPermutation.josephusPermutation(List.of(1,2,3,4,5,6,7),3));

//        System.out.println(longestSlideDown(new int[][]{{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}}));
        System.out.println(LongestSlideDown.longestSlideDown(new int[][]{
                {75},
                {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10},
                {20, 4, 82, 47, 65},
                {19, 1, 23, 75, 3, 34},
                {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
                {41, 41, 26, 56, 83, 40, 80, 70, 33},
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}}));

        System.out.println(JadenCase.toJadenCase(null));
    }

}
