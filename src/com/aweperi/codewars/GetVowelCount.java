package com.aweperi.codewars;

public class GetVowelCount {
    public static int getVowelCount(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }
}
