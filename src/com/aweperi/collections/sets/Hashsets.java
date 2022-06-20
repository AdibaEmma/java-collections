package com.aweperi.collections.sets;

import java.util.HashSet;

public class Hashsets {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        System.out.println(hs);
    }
}