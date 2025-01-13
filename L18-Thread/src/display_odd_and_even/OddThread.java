package display_odd_and_even;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i+=2) {
            try {
                System.out.println(i);
                Thread.sleep(10);
            } catch (Exception e) {
                Logger.getLogger(OddThread.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
