package com.aweperi.basics;

public class Strings {
    public static void main(String[] args) {
        String message = "Hello World";
        message = message + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf('o'));
        System.out.println(message.replace("!", "*"));

    }
}
