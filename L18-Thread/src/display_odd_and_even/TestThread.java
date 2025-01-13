package display_odd_and_even;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        System.out.println("DISPLAY ODD");
        oddThread.start();

        try{
            oddThread.join();
        } catch (InterruptedException e) {
            Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, e);
        }

        System.out.println("==============================");

        System.out.println("DISPLAY EVEN");
        evenThread.start();
    }
}
