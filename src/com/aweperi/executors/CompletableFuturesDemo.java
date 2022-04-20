package com.aweperi.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
    public static int toFarhenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> 20);
        future
                .thenApply(CompletableFuturesDemo::toFarhenheit)
                .thenAccept(System.out::println);
    }
}
