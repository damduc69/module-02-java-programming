package circular_queue_demo;

public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.emQueue(10);
        queue.emQueue(20);
        queue.emQueue(30);
        queue.emQueue(40);

        queue.display();

        System.out.println("Dequeued item is " + queue.deQueue());
        System.out.println("Dequeued item is " + queue.deQueue());

        queue.display();

        queue.emQueue(50);

        queue.display();
    }
}
