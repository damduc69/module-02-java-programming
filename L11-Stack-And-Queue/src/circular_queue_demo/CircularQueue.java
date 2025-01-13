package circular_queue_demo;

public class CircularQueue {
    private Node front;
    private Node rear;

    public CircularQueue() {
        front = null;
        rear = null;
    }

    public void emQueue(int value) {
        Node newNode = new Node(value);

        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        rear.next = front;
    }

    public int deQueue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int value;
        if (front == rear) {
            value = front.data;
            front = null;
            rear = null;
        } else {
            value = front.data;
            front = front.next;
            rear.next = front;
        }
        return value;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Elements in the queue: ");
        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
}
