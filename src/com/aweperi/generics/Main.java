package com.aweperi.generics;

public class Main {
    public static void main(String[] args) {
        var max = Utils.max(new User(10), new User(20));
        System.out.println(max);
        Utils.print("Emma", new User(50));
    }
}
