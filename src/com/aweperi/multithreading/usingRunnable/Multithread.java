package com.aweperi.multithreading.usingRunnable;

//The Runnable Interface
class MultithreadingDemo implements Runnable {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + "is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
// Main Class
public class Multithread {
    public static void main(String[] args) {
        int numberOfThreads = 8;
        for (int i = 0; i < numberOfThreads; i++) {
            Thread object = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
}
