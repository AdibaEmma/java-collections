package multithreading.usingThread;

//The Thread Class
class MultithreadingDemo extends Thread {
    public void run() {
       try {
//           Displaying the thread that is running
           System.out.println("Thread " + Thread.currentThread().getId() + " is running");
       }
       catch (Exception e) {
           System.out.println("Exception is caught");
       }
    }
}
//main Class
public class Multithread {
    public static void main(String[] args) {
        int numberOfThreads = 8; // Number of threads
        for (int i = 0; i < numberOfThreads; i++) {
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
        }
    }
}
