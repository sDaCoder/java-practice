// Implement multithreading with runnable interface

class MyRunnable implements Runnable {
    MyRunnable() {
        Thread thread = new Thread(this);
        System.out.println("Thread: " + this + " is running");
        thread.start();
    }
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from thread: " + this + " " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Caught" + e);
        }
    }
}

public class Prog9 {

    public static void main(String[] args) {
        new MyRunnable();
    }
}