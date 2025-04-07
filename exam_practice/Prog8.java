class NewThread extends Thread {
    NewThread() {
        super();
        // System.out.println("Thread: " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(this + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Caught" + e);
        }
    }
}

class MyThread extends Thread {
    MyThread()
    {
        super();
        System.out.println("Thread: " + this + " is running");
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + 1);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Caught" + e);
        }
    }
}

public class Prog8 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        t1.setName("Main Thread");
        // System.out.println(t1);
        // new NewThread();
        new MyThread();
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(t1 + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Caught" + e);
        }
    }
}