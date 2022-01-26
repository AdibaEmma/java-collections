package com.aweperi.multithreading.synchronization;

class Sender {
    public  void send(String msg) {
       synchronized (this) {
           System.out.println("Sending\t" + msg);
           try {
               Thread.sleep(1000);
           } catch (Exception e) {
               System.out.println("Thread interrupted.");
           }
           System.out.println("\n" + msg + "Sent");
       }
    }
}

// Class for sending a message using Threads
class  ThreadedSend extends Thread {
    private String msg;
    Sender sender;

    // Receives a message object snd a string message to be sent
    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    // Only one thread can send a message at a time
    public void run() {
        sender.send(msg);
    }
}
// Driver Class
public class SyncDemo {
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadedSend S1 = new ThreadedSend("Hi ", snd);
        ThreadedSend S2 = new ThreadedSend("Bye ", snd);

        S1.start();
        S2.start();

        try {
            S1.join();
            S2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
