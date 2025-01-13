package count_number;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        Thread thread = count.getMyThread();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
