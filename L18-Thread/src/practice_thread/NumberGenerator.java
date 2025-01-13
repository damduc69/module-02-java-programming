package practice_thread;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " - Number: " + i + " - hashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted." + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator1 = new NumberGenerator();

        Thread thread = new Thread(numberGenerator, "Thread");
        Thread thread1 = new Thread(numberGenerator1, "Thread1");

        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);

        thread.start();
        thread1.start();
    }
}
