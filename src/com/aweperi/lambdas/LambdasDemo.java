package com.aweperi.lambdas;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdasDemo {
    public static void show() {
        greet(System.out::println);

        Consumer<String> print = input -> System.out.println(input);
        Consumer<String> printUpperCase = input -> System.out.println(input.toUpperCase());

        List<String> list = List.of("a", "b", "c");
        list.forEach(print.andThen(printUpperCase));

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        var result = replaceColon.andThen(addBraces).apply("Key:Value");
        var result2 = addBraces.compose(replaceColon).apply("Key:Value");

        System.out.println(result);
        System.out.println(result2);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}