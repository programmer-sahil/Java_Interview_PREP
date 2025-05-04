package intermediate_codes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            LocalTime time = LocalTime.now();
            System.out.print("\rCurrent Time: " + formatter.format(time)); // \r keeps it on the same line
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                System.out.println("Clock interrupted!");
            }
        }
    }
}

// javac intermediate_codes/DigitalClock.java
// java intermediate_codes.DigitalClock
// ctrl + c to remove the terminal
