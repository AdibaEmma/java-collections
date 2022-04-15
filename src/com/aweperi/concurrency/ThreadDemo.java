package com.aweperi.concurrency;

import java.util.*;

public class ThreadDemo {
    public static void show() {
//        var status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread: threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(status.getTotalBytes());

        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());

        var thread1 = new Thread(() -> collection.addAll(Arrays.asList(1, 2, 3)));
        var thread2 = new Thread(() -> collection.addAll(Arrays.asList(4, 5, 6)));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(collection);
    }
}
