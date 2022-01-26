package com.aweperi.multithreading.threadpriorities;

public class ThreadPriority extends Thread {
    // Method 1
    // run() method for the thread that is called
    // as soon as start() is invoked for thread in main()
    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        // main thread priority is set to 6 now
        Thread.currentThread().setPriority(6);

        // Print and display main thread priority using getPriority() method
        System.out.println("main thread priority : " + Thread.currentThread().getPriority());

        // Creating  a thread by creating object inside main
        ThreadPriority t1 = new ThreadPriority();
        // t1 is child of main thread
        // so t1 will also have priority 6

        System.out.println("t1 thread priority : " + t1.getPriority());

        t1.setPriority(8);
        System.out.println("t1 new thread priority is : " + t1.getPriority());

        t1.setPriority(NORM_PRIORITY);
        System.out.println("t1 new thread priority is : " + t1.getPriority());

    }
}
