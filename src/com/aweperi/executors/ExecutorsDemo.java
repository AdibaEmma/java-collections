package com.aweperi.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {
    public static void show(){
        var executorService = Executors.newFixedThreadPool(2);
        try{
            var future = executorService.submit(() -> {
                LongTask.simulate();
                return 1;
            });
            System.out.println("Do more work");
            try {
                var result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        finally {
            executorService.shutdown();
        }
    }
}
