package com.aweperi.lambdas;


import java.util.function.Function;

public class LambdasDemo {
    public static void show() {
//        greet(System.out::println);

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        var result = replaceColon.andThen(addBraces).apply("Key:Value");
        result = addBraces.compose(replaceColon).apply("Key:Value");

        System.out.println(result);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
