package my_queue;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(70);
    }
}
