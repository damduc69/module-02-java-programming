package my_queue;

public class MyQueue {
    private int capacity;
    private int queueArray[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArray = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity -1) {
                tail = 0;
            }
            queueArray[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to queue");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! unable to remove element from queue");
        } else {
            head++;
            if (head == capacity -1) {
                head = 0;
            }
            else {
                System.out.println("Element " + queueArray[head] + " is removed from queue");
            }
            currentSize--;
        }
    }
}
