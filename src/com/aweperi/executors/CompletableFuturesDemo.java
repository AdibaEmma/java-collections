package com.aweperi.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
    public static void show() {
        Supplier<Integer> task = () -> 1;
        var future = CompletableFuture.supplyAsync(task);
        try {
            System.out.println("Getting Results");
            var result = future.get();
            System.out.println("Result is: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        future.thenRun(() -> System.out.println("Done"));
    }
}
