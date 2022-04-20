package com.aweperi.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFuturesDemo {

    public static void show() {
        var first = CompletableFuture.supplyAsync(() -> 1);
        var second = CompletableFuture.supplyAsync(() -> 2);
        var third = CompletableFuture.supplyAsync(() -> 3);
        var all = CompletableFuture.allOf(first, second, third);
        all.thenRun(() -> {
            try {
                var result = first.get() + second.get() + third.get();
                System.out.println(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println("All tasks completed");
        });
    }
}
