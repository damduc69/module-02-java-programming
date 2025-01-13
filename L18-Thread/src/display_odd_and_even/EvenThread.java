package display_odd_and_even;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i+=2) {
            try {
                System.out.println(i);
                Thread.sleep(15);
            } catch (InterruptedException e) {
                Logger.getLogger(EvenThread.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
