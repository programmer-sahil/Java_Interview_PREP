package intermediate_codes;

class EvenThread extends Thread {
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultithreadedPrinter {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start(); // Start even number thread
        odd.start();  // Start odd number thread
    }
}

// javac intermediate_codes/MultithreadedPrinter.java

// java intermediate_codes.MultithreadedPrinter

