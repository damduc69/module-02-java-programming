package runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Main thread");
        RunnableDemo thread1 = new RunnableDemo("Thread-1");
        thread1.start();

        RunnableDemo thread2 = new RunnableDemo("Thread-2");
        thread2.start();

        System.out.println("Exiting Main thread");
    }
}
