package count_number;

public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "My runnable thread");
        System.out.println("My runnable thread created" + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Count: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("My runnable thread interrupted.");
        }
        System.out.println("My runnable thread exiting.");
    }
}
