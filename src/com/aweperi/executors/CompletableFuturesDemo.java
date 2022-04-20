package com.aweperi.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFuturesDemo {

    public static void show() {
        var first = CompletableFuture
                .supplyAsync(() -> "20USD")
                .thenApply(str -> {
                    var price = str.replace("USD", "");
                    return Integer.parseInt(price);
                });

        var second = CompletableFuture.supplyAsync(() -> 0.9);
        first
            .thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
            .thenAccept(System.out::println);
    }
}
