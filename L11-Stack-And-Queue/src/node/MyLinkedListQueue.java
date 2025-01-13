package node;

import node.Node;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        head = null;
        tail = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (tail == null) {
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    public void dequeue(int key) {
        Node temp = new Node(key);
        if (tail == null) {
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
